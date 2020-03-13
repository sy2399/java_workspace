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
-- ���̺� ���� 
/*		member : ���̺�� 
 *      id,password,name,address : �÷��� 
 *      ������ Ÿ�� 
 		varchar2(100) : ����Ŭ ���ڿ� Ÿ�� 
 		number : ����Ŭ ���� Ÿ�� 
 		�������� 
 		-> primary key : ����Ű unique + not null 
 			not null : null�� ������� �ʴ´� 
 */
create table member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100)
)
-- ���̺� ���� 
drop table member;
-- member table�� ȸ�� ������ ���� 
insert into member(id,password,name,address)
values('java','1234','������','�Ǳ�');
-- member table�� ������ ��ȸ 
select id,password,name,address from member;

-- member table�� ȸ�� ������ ���� 
-- ORA-00001: ���Ἲ ���� ����(SCOTT.SYS_C004000)�� ����˴ϴ�
-- ���� ���� ������ ���� 
-- id�� primary key ���������� �����Ǿ� �ְ� 
-- �ݵ�� �����ϰ� �����ؾ� �Ѵ� 
-- id�� �ߺ��ǹǷ� error�� ���� �߰��� ���� �ʴ´� 
insert into member(id,password,name,address)
values('java','1234','�ι���','��ž');

insert into member(id,password,name,address)
values('gandi','1234','��ȣ��','��ž');
-- name �÷��� not null ���������� �־ �ݵ�� name�� insert�ؾ� �Ѵ� 
-- error
insert into member(id,password,address)
values('test','1234','��ž');
-- ����  address�� ������ ���������� �����Ƿ� insert ���ص� �ȴ� 
insert into member(id,password,name)
values('test','1234','Ȳ�⽺');
-- ��ü ȸ�� ���� ��ȸ 
select * from member;
-- ȸ���� ��ȸ 
select count(*) from member;
-- ȸ�� �̸� ��ȸ 
select name from member;
-- ȸ�� ���̵�� �ּ� ��ȸ 
select id,address from member;
-- ���̵� gandi �� ȸ���� �̸��� �ּҸ� ��ȸ 
select name,address from member where id='gandi';
-- ���̵� java�̰� �н����尡 1234�� ȸ���� �̸��� �ּҸ� ��ȸ 
select name,address from member where id='java' and password='1234';
-- ȸ�� �ּҰ� null �� ȸ���� ��ȸ 
	select id,name from member where address is null;
-- null�� �ƴ� ȸ�� 	
	select id,name from member where address is not null;
-- ���� ���� update 
	update member set name='����' where id='gandi';

-- �������Ȯ�� id gandi�� member�� name�� ��ȸ 
	select name from member where id='gandi';
	
-- address �� null �� member�� �ּҸ� �Ǳ��� ���� 
	update member set address='�Ǳ�' where address is null;
-- address �� �Ǳ��� member�� id,name ������ ��ȸ 	
	select id,name from member where address='�Ǳ�';

-- member ������ �߰� 
--  id : jdbc  , password : abcd , name : ���� , address : ��õ
	insert into member(id,password,name,address) 
	values('jdbc','abcd','����','��õ')
-- id�� jdbc�� member�� ��ȸ 
	select name,address from member where id='jdbc';
	
	select * from member;
    -- ��ž address �� ��� ȸ�� �̸��� ��ȣ���� ����
    	update member set name='��ȣ��' where address='��ž';
	-- Ȳ�⽺ �̸��� ȸ�� �̸��� Ȳ�������� ���� 
    	update member set name='Ȳ����' where name='Ȳ�⽺';    	
    -- ���� : delete 
    delete from member where name='����';	

    commit -- ���� db�� �۾������ �ݿ�

    -- ���� 
    select id,password,name,address from member
    order by id asc;

   -- �ּҿ� �ش��ϴ� ȸ���� ��ȸ 
   select count(*) from member where address='�Ǳ�';




    
    
    
    
    
    
    

