

DROP TABLE DEPT;
-- 부서 테이블 
CREATE TABLE DEPT
       (DEPTNO NUMBER(2)  PRIMARY KEY,
 DNAME VARCHAR2(14) ,
 LOC VARCHAR2(13) ) ;
DROP TABLE EMP;

-- 사원 테이블 
-- foreign key ( 부서 정보를 참조) 
CREATE TABLE EMP
       (EMPNO NUMBER(4)  PRIMARY KEY, -- 사원번호
 ENAME VARCHAR2(10),--사원명
 JOB VARCHAR2(9),-- 직종
 MGR NUMBER(4), -- 매니저 사원 번호 
 HIREDATE DATE, -- 입사일 
 SAL NUMBER(7,2), -- 월급
 COMM NUMBER(7,2), -- 커미션  
 DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT);

INSERT INTO DEPT VALUES
 (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES
 (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES
 (40,'OPERATIONS','BOSTON');
 
INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,to_date('13-7-1987','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,to_date('13-7-1987','dd-mm-yyyy'),1100,NULL,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);


select * from dept;
select * from emp;

commit

--사원 emp 테이블의 사원번호 empno, 사원명 ename, 직종 job, 입사일 hiredate 조회
select empno,ename,job,hiredate from emp;
-- empno 내림차순 정렬하여 조회
select empno,ename,job,hiredate from emp order by empno desc;
--job이 ANALYST 인 사원의 사원명 ename과 월금 sal을 조회
select ename,sal from emp where job='ANALYST';
--모든 사원의 사원명,직종,월급,연봉(월급*12)을 조회
select ename,job,sal,sal*12 as 연봉 from emp order by sal desc;
--직종 job의 종류를 조회
select distinct job from emp;
--평균 월급 조회
select avg(sal) from emp;
--소수점 이하 반올림
select round(avg(sal)) from emp;
--월급 sal 1000이상 2000이하 사원의 사원명 ename과 
--job, sal을 sal 내림차순으로 조회
select ename,job,sal from emp where sal>=1000 and sal<=2000 order by sal desc;
--between a and b
select ename, job,sal from emp
where sal between 1000 and 2000;
--like : 사원명 ename에 S 가 포함된 사원명 ename과 직종 job 조회
select ename,job from emp where ename like '%S%';
--커미션 comm이 null이 아닌 사원을 조회
select ename,job,comm from emp where comm is not null;
--date : 사원 입사일과 입사 2달 후를 조회
select ename,hiredate,add_months(hiredate,2) as 두달후 from emp;
-- date : 입사한지 몇년이 경과했는지 조회
-- trunc(): 소수점 이하 버리는 함수
select ename,hiredate,trunc(months_between(sysdate,hiredate)/12) as 몇년경과 from emp;
--clob : 최대 4GB를 지원 (cf. varchar2 : 최대 4000byte - 한글 3000자)
create table clob_test(
	id varchar2(100) primary key,
	content clob not null
)
insert into clob_test(id,content) values('java', 'aaaaa');
select * from clob_test;
create table default_test(
	id varchar2(100) primary key,
	hit number default 0
)
drop table defaut_test;
insert into default_test(id) values('java');
select * from default_test;

create table board_test(
	b_no number primary key,
	content clob not null,
	hit number
)

insert into board_test(b_no,content) values(1,'aa'); 
select * from board_test;
--alter를 이용해 hit에 default 제약조건을 추가
alter table board_test modify hit default 0;
insert into board_test(b_no,content) values(2,'bb'); 
--update를 이용해 hit에 null-> 0으로 모두 수정
update board_test set hit=0 where hit is null;
--alter를 이용해 table명 변경
alter table board_test rename to board_test2;
select * from board_test2;