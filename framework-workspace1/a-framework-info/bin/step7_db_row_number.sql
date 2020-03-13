-- Oracle row_number() over() : row(줄)에 대한 순차적인 번호를 제공
-- View : 뷰는 물리적으로 존재하지 않은 가상테이블
--        SELECT 명령의 실행결과를 테이블처럼 사용
-- Inline View : SQL 문장에서 From 절에 사용된 subquery 
-- paging sql 정의시 사용됨 


drop table player;
create table player(
 no number primary key,
 title varchar2(1) not null,
 singer varchar2(30) not null
)
-- alter 를 이용해 price column 추가 
alter table player add price number;
-- alter 를 이용해 title 의 컬럼 사이즈 변경 
alter table player modify(title varchar2(100))

select * from player;

create sequence mp3_seq;

insert into player(no,title,singer,price) values(mp3_seq.nextval,'그리고 하나','태연',700);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Man In Love','인피니트',500);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Crescendo','악동뮤지션',400);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'벚꽃엔딩','버스커버스커',800);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'둘이서한잔해','다비치',900);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'어느봄날','2AM',1000);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'기대해','걸스데이',300);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'아니야','윤하',600);
commit
select count(*) from player;

--no 내림차순 정렬
select * from player order by no desc;
--row_number() over(정렬)
select row_number() over(order by no desc) as rnum,no,title from player;
--singer 가 2AM인 곡을 삭제 
delete from player where singer='2AM';
--rnum이 3 이하인 곡명들만 조회
--아래의 sql은 error: 이유는 select 되는 시점에 rownum이 생성되기 때문
--select row_number() over(order by no desc) as rnum,no,title from player where rnum<=3
--해결방안 : subquery로 rownu(행번호)dmf todtjdgks gn
--바깥 sql에서 where절을 이용해 조회하면 된다

-- Inline View : SQL 문장에서 From 절에 사용된 subquery 
select title,no from(
	select row_number() over(order by no desc) as rnum,no,title from player
	--위의 select문 결과를 하나의 table로 생각
)where rnum<=3
--rownum 기준 4이상 6 이하 곡 no와 title을 조회
select title,no,rnum from(
	select row_number() over(order by no desc) as rnum,no,title from player
	--위의 select문 결과를 하나의 table로 생각
)where rnum>=4 and rnum<=6

select A.* from(
	select row_number() over(order by no desc) as rnum,no,title,singer,price from player
	--위의 select문 결과를 하나의 table로 생각
) A where rnum between 4 and 6;
--내부 쿼리문 결과의 별칭을 준다 A로

select posting.* from(
	select row_number() over(order by no desc) 
	as rnum,no,title,writer,content,to_char(time_posted,'YYYY.MM.DD HH24:MI:SS'),hits from board3 order by no desc
) posting where rnum between 1 and 5


select posting.* from(
	select no,title,writer,content,to_char(time_posted,'YYYY.MM.DD'),hits,
	row_number() over(order by no desc) 
	as rnum from board3 order by no desc
) posting where rnum between 1 and 5


