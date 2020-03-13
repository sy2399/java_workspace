drop table shares;
drop table customer;
drop table stock;

-- 고객 일반 정보 (customer) 
create table customer(
 id varchar2(50) primary key,
 password varchar2(50) not null,
 name varchar2(50) not null,
 address varchar2(50) not null
)
insert into customer(id,password,name,address) 
values('java','1234','아이유','종로');

-- 주식 일반 정보 (stock)
create table stock(
 symbol varchar2(50) primary key,
 price number not null
)
insert into stock(symbol,price) values('SK',200);
insert into stock(symbol,price) values('삼성',300);
insert into stock(symbol,price) values('LG',400);
insert into stock(symbol,price) values('현대',500);

-- 고객이 가진 주식 정보(shares) 
create table shares(
 id varchar2(13),
 symbol varchar2(50),
 quantity number not null,
 constraint fk_id foreign key(id) references customer,
 constraint fk_symbol foreign key(symbol) references stock,
 constraint pk_shares primary key(id,symbol)
);

insert into shares(id,symbol,quantity) values('java','삼성',5); 
insert into shares(id,symbol,quantity) values('java','현대',10); 
-- 무결성 제약 조건 위배 : 복합 pk 이므로 id와 symbol 의 쌍이 유일해야!
insert into shares(id,symbol,quantity) values('java','삼성',1); 
 
SELECT * FROM SHARES;