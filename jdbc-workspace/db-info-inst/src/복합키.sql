drop table shares;
drop table customer;
drop table stock;

-- �� �Ϲ� ���� (customer) 
create table customer(
 id varchar2(50) primary key,
 password varchar2(50) not null,
 name varchar2(50) not null,
 address varchar2(50) not null
)
insert into customer(id,password,name,address) 
values('java','1234','������','����');

-- �ֽ� �Ϲ� ���� (stock)
create table stock(
 symbol varchar2(50) primary key,
 price number not null
)
insert into stock(symbol,price) values('SK',200);
insert into stock(symbol,price) values('�Ｚ',300);
insert into stock(symbol,price) values('LG',400);
insert into stock(symbol,price) values('����',500);

-- ���� ���� �ֽ� ����(shares) 
create table shares(
 id varchar2(13),
 symbol varchar2(50),
 quantity number not null,
 constraint fk_id foreign key(id) references customer,
 constraint fk_symbol foreign key(symbol) references stock,
 constraint pk_shares primary key(id,symbol)
);

insert into shares(id,symbol,quantity) values('java','�Ｚ',5); 
insert into shares(id,symbol,quantity) values('java','����',10); 
-- ���Ἲ ���� ���� ���� : ���� pk �̹Ƿ� id�� symbol �� ���� �����ؾ�!
insert into shares(id,symbol,quantity) values('java','�Ｚ',1); 
 
SELECT * FROM SHARES;