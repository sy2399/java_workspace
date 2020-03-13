create table account_inst(
	account_no varchar2(100) primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number not null
)
delete from account_inst;
create sequence account_inst_seq;
drop sequence account_inst_seq;

insert into account_inst(account_no,name,password,balance)
values(account_inst_seq.nextval,'æ∆¿Ã¿Ø','1234',100);
update account_inst set balance=1000 where account_no='1';

select * from account_inst;

select balance from account_inst where account_no='1' and password='1234';













