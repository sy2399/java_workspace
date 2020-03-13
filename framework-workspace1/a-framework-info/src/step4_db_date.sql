-- step4_db_date.sql
/*
 * date : 오라클 시간 데이터 타입
 * sysdate : 현재 시간
 */

-- dual table : 오라클에서 제공하는 기본 테이블 (varchar2 컬럼 하나로 구성)
select * from dual;

insert into dual values('A');
select sysdate from dual;
--to_char(시간, 시간포맷) : 시간 정보를 문자열 타입으로 변환하는 함수 
select to_char(sysdate,'YYYY/MM/DD HH24:MI:SS') from dual;
--연 월 일만 조회
select to_char(sysdate,'YYYY.MM.DD') from dual;

--직접 테이블을 만들어서 테스트 해보기
create table date_test(
	id varchar2(50) primary key,
	mydate date not null
)

--id java, mydate 는 현재시간으로 insert
insert into date_test(id,mydate) values('java',sysdate);
select * from date_test;

--id 가 java인 대상의 mydate를 년 월 일 시 분 초 까지 조회한다
--to_char 함수를 이용
select to_char(mydate,'YYYY/MM/DD HH24:MI:SS') from date_test where id='java';

--특정 시간을 insert해본다
--문자열 형식의 날짜 정보를 date 타입으로 insert하기 위해 to_date()를 이용
insert into date_test(id,mydate) 
values('spring', to_date('2017/1/1 9:00:10', 'yyyy/mm/dd hh24:mi:ss'))

select *from date_test;

--시간 연산이 가능하다
select id,sysdate-mydate from date_test;
-- 현재 날짜-특정날짜 -->2017/1/1 부터 66일 지남






