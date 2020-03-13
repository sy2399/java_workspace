/*  ����Ŭ ������( sequence )   
 *  - ������ ���� �����ϱ� ���� �뵵 
 *  - �ַ� primary key �� ������ ����Ѵ� 
 *  - �������� �Ϸ��� ��ȣ�� ���������� ������Ų�� 
 *  - ���̺�� ���������� �����ǰ� ����ȴ� 
 */
-- ������ ���� 
create sequence seq_test;
-- ������ ���� 
drop sequence seq_test;

/*  ���� ������ ���� ��ȯ : ��������.nextval 
 *   dual table : ����Ŭ���� �����ϴ� �⺻���̺� 
 * 					varchar2 Ÿ���� �÷��ϳ��� ������ ���̺�μ� 
 * 					�ַ� �Լ� ������ ���� ���ȴ�  
 */
 select  seq_test.nextval from dual;
 -- ���̺� ���� 
 create table car(
 	car_no number primary key,
 	model varchar2(100) not null,
 	price number default 0  
 )
-- car ���̺��� �̿��� car sequence ���� 
create sequence car_seq;
 -- �������� �̿��� ����ȣ�� ������ �Է��Ѵ� 
insert into car(car_no,model,price) values(car_seq.nextval,'k5',1000); 
insert into car(car_no,model,price) values(car_seq.nextval,'sm5',1200);  
select * from car; 
 
 /*  table :  memo 
  *  column : memo_no , title , content 
  *  type  :   number     varchar2(100)
  *  constraints:  pk       not null 
  * 
  *  memo ��ȣ�� sequence �̿��Ѵ�( sequence �� : memo_seq ) 
 */
  create table memo(
  	memo_no number primary key,
  	title varchar2(100) not null,
  	content varchar2(100) not null
  )
  create sequence memo_seq;












