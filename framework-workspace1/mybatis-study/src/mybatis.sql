create table spring_member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100) not null
);

insert into spring_member values('java', '1234', '아이유', '판교');
select * from spring_member;
update spring_member set password = '1111', name = '1111', address ='1111' where id = 'zzzz'
select distinct address from spring_member
select count
commit

select * from emp;
select * from dept;
select deptno,dname,loc from dept order by deptno desc;

SELECT E.ENAME,D.DNAME,D.LOC
FROM emp e, dept d 
WHERE e.deptno=d.deptno and E.EMPNO = '7369';

select * from salgrade;


SELECT e.ename,e.sal,s.grade,s.losal,s.hisal
FROM emp e, salgrade s 
WHERE  e.sal>=s.losal and e.sal<=s.hisal  and e.empno = 'SMITH' ;

SELECT e.empno,e.ename,d.deptno,d.dname,d.loc
FROM emp e, dept d 
WHERE e.deptno(+)=d.deptno order by d.deptno asc;




------------------------------------------------------------------------------------
영화제목, 장르, 관객수, 감독명, 감독소개
------------------------------------------------------------------------------------
create table director(
	director_id varchar2(100) primary key,
	director_name varchar2(100) not null,
	director_intro varchar2(100) not null
);
create table movie(
	movie_id varchar2(100) primary key,
	title varchar2(100) not null,
	genre varchar2(100) not null,
	attendance number default 0,
	director_id varchar2(100) not null 
	constraint fk_director_id references director(director_id)
);	
select * from director;
select * from movie;
insert into director values('a','봉준호','한국영화아카데이수료,황금사자상수상');

select director_id,director_name,director_intro
from director
where director_id = 'a';

select m.title,m.genre,m.attendance,d.director_name
 		from movie m, director d
 		where m.director_id = d.director_id 

 		
-----------------------------------------------------------
--mybatis에서 sequenct test

create table guestbook(
	no number primary key,
	title varchar2(100) not null,
	content clob not null
)

create sequence guestbook_seq;

insert into guestbook(no,title,content) 
values(guestbook_seq.nextval,'마지막예제','고생하셧습니다')

commit

select * from guestbook;