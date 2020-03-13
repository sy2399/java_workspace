/*  Transaction 처리(or 제어)
 *  : 작업단위를 제어 
 * 주요용어 - DCL ( data control language ) 
 *  commit :  실제 데이터베이스에 작업내용을 반영 
 *  rollback :  작업내용을 취소 
 * 
 *  JDBC는 Auto Commit 이 기본이다 
 *  Transaction 제어가 필요한 경우에는 
 *  Auto Commit 속성을 해제하여 수동 커밋모드로 변경한 후 
 *  ( connection.setAutoCommit(false) ) 
 *  작업단위 내에서 모든 작업이 정상적으로 수행되면 
 *   connection.commit();  --> 실제 db에 반영
 *  문제가 발생되면 
 *   connection.rollback(); --> 작업 취소 
 * 
 *   사례)   계좌이체(){
 * 					try{
 * 					출금업무
 * 					입금업무
 * 						commit
 * 					}catch(){
 * 						rollback 
 * 					}
 * 				}
 *        --------------------------
 * 				신규카드발급(){
 * 					try{
 * 					카드발급 
 *                  포인트지급
 * 						commit
 * 					}catch(){
 * 						rollback
 * 					}
 * 				}
 * 
 * 
 */
create table card(
	id varchar2(100) primary key,
	name varchar2(100) not null
)
create table point(
	id varchar2(100) primary key,
	point number not null
)

select * from card;
select * from point;

delete from card;
delete from point;
commit








