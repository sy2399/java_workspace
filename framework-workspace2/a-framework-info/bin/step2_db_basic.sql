/*
	SQL(Structured Query Language) : ������ ���� ��� 
											  database ���� ��� 
	1. DDL ( Data Definition Language ) : 
		create : table ���� 
		drop : table ���� 
		alter : table ���� ���� 
	2. DML ( Data Manipulation Language ) 
		insert : ���� �߰� 
		delete : ���� ���� 
		update : ���� ���� 
	3. DQL ( Data Query Language )
		select : ���� ��ȸ 
	4. DCL ( Data Control Language )
		commit : Ʈ�����(�۾�����)�� �۾������ ������ �ݿ�  
		rollback : Ʈ������� �۾������ ����ϰ� ������� ���� 
		grant : ���Ѻο� 
			
*/
/* ���̺� �����  
 * table �� : typetest , column : name�� money
 *  datatype : varchar2(9) ���ڿ�������Ÿ�� 9�� ������ ���� 
 * 														    �ѱ��� 3�ڱ��� 
 *  			 number ���� ������ Ÿ�� 
 *  ��������(constraints)  : primary key(pk, ��Ű) -> unique + not null
 * 								  not null -> null�� ������� �ʴ´� 
 */
create table typetest(
	name varchar2(9) primary key,
	money number not null
)
insert into typetest(name,money) values('javaking',100);
-- name�� javaking�� ����� money�� ��ȸ�ϼ��� 
select money from typetest where name='javaking';
-- insert test , ���̺� ������ �ִ� 9��(����)�� ���������Ƿ� error 
insert into typetest(name,money) values('barackobama',200);
-- insert ok 
insert into typetest(name,money) values('����ȣ',200);
-- insert fail  �ִ� 9 �� �ѱ� 3�ڱ��� ��� 
insert into typetest(name,money) values('�ְ���ȣ',200);
-- ��ȸ�� ���� 
select money*2,money,name from typetest 

/*  DDL ( create , drop , alter ) 
 *  alter : ���̺� ���� ���� 
 */
drop table typetest;
create table test1(
	id varchar2(100) primary key,
	hit number default 0
)
-- default 0  �� ������������ ������ ������ insert���� ������ 
-- �⺻�� 0 �� �߰��ȴ� 
-- id �� java �� ������ insert 
insert into test1(id) values('java');
select * from test1;
-- alter�� �̿��� table���� ���� 
alter table test1 rename to test2;
select * from test2;
-- alter�� �̿��� �÷����� ���� 
/*	alter table ���̺��
 	rename column �����ؾ��� �÷��� to ���ο� �÷���; 
 	
 	hit�� count�� ���� 
 */
alter table test2 rename column hit to count; 
select * from test2;

/*		���̺�� : product 
 		�÷��� : id,name,maker,price
 		������Ÿ�� : id,name,maker�� ��� varchar2(100)
 						 price �� number 
 		�������� : id�� primary key , �������� not null 
 		
 		���̺� ������ ��ȸ ��� 
 		id 		name		maker    price 
 		a		������7  �Ｚ     150
 		b       ������6  �Ｚ     100
 		c       ������6  ����     120 
 */
create table product(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)
insert into product(id,name,maker,price) 
values('a','������7','�Ｚ',150);
insert into product(id,name,maker,price) 
values('b','������6','�Ｚ',100);
insert into product(id,name,maker,price) 
values('c','������6','����',120);

select id,name,maker,price from product;

-- ����Ŭ �Լ� 
-- product �Ѽ��� 
select count(*) from product;
-- product price �ְ� 
select max(price) from product;
-- product price ������ 
select min(price) from product;
-- ��հ�
select avg(price) from product;
-- ��հ� �ݿø��Ͽ� ��ȸ 
select round(avg(price)) from product;
-- ��հ� �Ҽ��� ���� ���� �� �ø� 
select ceil(avg(price)) from product;
-- ��հ� �Ҽ��� ���� ���� 
select floor(avg(price)) from product;

-- ���� 
-- ��ǰ���� ���������� ���������� (��������) 
select id,name,maker,price from product 
order by price asc;
-- price �������� 
select id,name,maker,price from product 
order by price desc;
-- price �� 130������ product ������ ��ȸ 
select id,name,maker,price from product 
where price<=130
-- maker�� �Ｚ�� product�� id,name,price�� ��ȸ�ϵ� 
-- price ������������ ��ȸ 
select id,name,price from product
where maker='�Ｚ'
order by price asc;
-- price�� 100�� �ʰ��ϰ� 120������ ��ǰ�� ��ȸ 
select id,name,maker,price from product 
where price>100 and price<=120;
-- �������� 
select id from product; -- a , b , c �� ���� 
select count(*) from product where id='a'; -- 1 
select count(*) from product where id='d'; -- 0

-- maker ���� ��ȸ 
select maker from product;
-- distinct ���� ( �ߺ����� �� ������ ��ȸ ) 
select distinct maker from product;
-- ��ȸ�� ��Ī 
select count(*) as ��ǰ�� from product;

select name,price,price+100 as �߰����� from product
  
-- ���ΰ��� ��ȸ 
select id,name,maker,price as ����,price-(price*10/100) as ���ΰ�  
from product
order by price desc;












