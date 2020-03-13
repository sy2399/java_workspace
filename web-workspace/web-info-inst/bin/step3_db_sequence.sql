/*  오라클 시퀀스( sequence )   
 *  - 유일한 값을 생성하기 위한 용도 
 *  - 주로 primary key 값 생성시 사용한다 
 *  - 시퀀스는 일련의 번호를 순차적으로 증가시킨다 
 *  - 테이블과 독립적으로 생성되고 저장된다 
 */
-- 시퀀스 생성 
create sequence seq_test;
-- 시퀀스 삭제 
drop sequence seq_test;

/*  다음 시퀀스 값을 반환 : 시퀀스명.nextval 
 *   dual table : 오라클에서 제공하는 기본테이블 
 * 					varchar2 타입의 컬럼하나로 구성된 테이블로서 
 * 					주로 함수 실행을 위해 사용된다  
 */
 select  seq_test.nextval from dual;
 -- 테이블 생성 
 create table car(
 	car_no number primary key,
 	model varchar2(100) not null,
 	price number default 0  
 )
-- car 테이블에서 이용할 car sequence 생성 
create sequence car_seq;
 -- 시퀀스를 이용해 차번호를 생성해 입력한다 
insert into car(car_no,model,price) values(car_seq.nextval,'k5',1000); 
insert into car(car_no,model,price) values(car_seq.nextval,'sm5',1200);  
select * from car; 
 
 /*  table :  memo 
  *  column : memo_no , title , content 
  *  type  :   number     varchar2(100)
  *  constraints:  pk       not null 
  * 
  *  memo 번호는 sequence 이용한다( sequence 명 : memo_seq ) 
 */
  create table memo(
  	memo_no number primary key,
  	title varchar2(100) not null,
  	content varchar2(100) not null
  )
  create sequence memo_seq;












