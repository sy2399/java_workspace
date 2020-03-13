/*
 * subquery : 부쿼리
 * 			  SQL 안의 SQL
 * 			  SQL문 안에 포함되는 또 다른 SQL문
 *
 */

create table account_book(
	seq number primary key,
	content varchar2(100) not null,
	amount number not null
)
insert into account_book(seq,content,amount) values(1,'뻔맥',10000);
insert into account_book(seq,content,amount) values(2,'치맥',20000);
insert into account_book(seq,content,amount) values(3,'노맥',15000);
insert into account_book(seq,content,amount) values(4,'곱맥',25000);
insert into account_book(seq,content,amount) values(5,'골맥',18000);
select * from ACCOUNT_BOOK;

--지출내역 중 최고액을 조회
select max(amount) from ACCOUNT_BOOK;
--가장 높은 액수의 지출내역은? 곱맥
select max(amount) from ACCOUNT_BOOK; 
select content from ACCOUNT_BOOK where amount=25000;
--위 두 sql을 subquery를 이용해 하나의 sql로 정의
select content from ACCOUNT_BOOK where amount=(
	select max(amount) from ACCOUNT_BOOK
);
--연습)평균액수보다 많은 금액을 가진 내역과 금액을 조회
select avg(amount) from ACCOUNT_BOOK;
select content,amount from ACCOUNT_BOOK where amount>평균액수;
select content,amount from ACCOUNT_BOOK where amount>(
	select avg(amount) from ACCOUNT_BOOK
)order by amount desc;
--평균액수보다 낮은 금액 amount 중 가장 높은 금액의 내역은?
select content from ACCOUNT_BOOK where amount=max(amount);
select amount from ACCOUNT_BOOK where avg(amount);


select content from ACCOUNT_BOOK where amount=(
	select max(amount) from account_book where amount<(
			select avg(amount) from ACCOUNT_BOOK
	)
)

select empno,ename,sal,mgr from emp order by sal desc;
--연습 : 가장 낮은 sal 을 받는 사람의 ename을 조회
select ename from emp where sal = 800;
select ename from emp where sal=(
	select min(sal) from emp
)
select empno,ename,mgr from emp;
--연습) 가장 낮은 sal을 받는 사원의 매니저의 사원명을 조회
select mgr from emp where sal=800;

select ename from emp where empno=(
	select mgr from emp where ename=(
		select ename from emp where sal=(
			select min(sal) from emp
		)
	)
)
--연습)사원 평균 월급 액수보다 작은 월급을 받는 사원 중 
--가장 높은 월급을 받는 사원의 매니저의 사원명을 조회
select ename from emp where empno=(
	select mgr from emp where sal = (
		select max(sal) from emp where sal<(
			select avg(sal) from emp
		)
	)
)













