/*
	SQL(Structured Query Language) : 구조적 질의 언어 
											  database 제어 언어 
	1. DDL ( Data Definition Language ) : 
		create : table 생성 
		drop : table 삭제 
		alter : table 정보 수정 
	2. DML ( Data Manipulation Language ) 
		insert : 정보 추가 
		delete : 정보 삭제 
		update : 정보 수정 
	3. DQL ( Data Query Language )
		select : 정보 조회 
	4. DCL ( Data Control Language )
		commit : 트랜잭션(작업단위)의 작업결과를 실제로 반영  
		rollback : 트랜잭션의 작업결과를 취소하고 원래대로 복구 
		grant : 권한부여 
			
*/
-- 테이블 생성 
/*		member : 테이블명 
 *      id,password,name,address : 컬럼명 
 *      데이터 타입 
 		varchar2(100) : 오라클 문자열 타입 
 		number : 오라클 숫자 타입 
 		제약조건 
 		-> primary key : 유일키 unique + not null 
 			not null : null을 허용하지 않는다 
 */
create table member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100)
)
-- 테이블 삭제 
drop table member;
-- member table에 회원 정보를 삽입 
insert into member(id,password,name,address)
values('java','1234','아이유','판교');
-- member table의 정보를 조회 
select id,password,name,address from member;

-- member table에 회원 정보를 삽입 
-- ORA-00001: 무결성 제약 조건(SCOTT.SYS_C004000)에 위배됩니다
-- 위와 같은 에러가 난다 
-- id는 primary key 제약조건이 설정되어 있고 
-- 반드시 유일하게 존재해야 한다 
-- id가 중복되므로 error가 나고 추가가 되지 않는다 
insert into member(id,password,name,address)
values('java','1234','부반장','야탑');

insert into member(id,password,name,address)
values('gandi','1234','김호겸','야탑');
-- name 컬럼에 not null 제약조건이 있어서 반드시 name을 insert해야 한다 
-- error
insert into member(id,password,address)
values('test','1234','야탑');
-- 가능  address는 별도의 제약조건이 없으므로 insert 안해도 된다 
insert into member(id,password,name)
values('test','1234','황잡스');
-- 전체 회원 정보 조회 
select * from member;
-- 회원수 조회 
select count(*) from member;
-- 회원 이름 조회 
select name from member;
-- 회원 아이디와 주소 조회 
select id,address from member;
-- 아이디가 gandi 인 회원의 이름과 주소를 조회 
select name,address from member where id='gandi';
-- 아이디가 java이고 패스워드가 1234인 회원의 이름과 주소를 조회 
select name,address from member where id='java' and password='1234';
-- 회원 주소가 null 인 회원을 조회 
	select id,name from member where address is null;
-- null이 아닌 회원 	
	select id,name from member where address is not null;
-- 정보 수정 update 
	update member set name='개미' where id='gandi';

-- 수정결과확인 id gandi인 member의 name을 조회 
	select name from member where id='gandi';
	
-- address 가 null 인 member의 주소를 판교로 수정 
	update member set address='판교' where address is null;
-- address 가 판교인 member의 id,name 정보를 조회 	
	select id,name from member where address='판교';

-- member 정보를 추가 
--  id : jdbc  , password : abcd , name : 설현 , address : 부천
	insert into member(id,password,name,address) 
	values('jdbc','abcd','설현','부천')
-- id가 jdbc인 member를 조회 
	select name,address from member where id='jdbc';
	
	select * from member;
    -- 야탑 address 에 사는 회원 이름을 김호겸을 수정
    	update member set name='김호겸' where address='야탑';
	-- 황잡스 이름의 회원 이름을 황윤상으로 수정 
    	update member set name='황윤상' where name='황잡스';    	
    -- 삭제 : delete 
    delete from member where name='설현';	

    commit -- 실제 db에 작업결과를 반영

    -- 정렬 
    select id,password,name,address from member
    order by id asc;

   -- 주소에 해당하는 회원수 조회 
   select count(*) from member where address='판교';




    
    
    
    
    
    
    

