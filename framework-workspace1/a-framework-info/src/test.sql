

create table 선수(
	선수명	 varchar2(255) primary key,
	국가 varchar2(255),
	기록 varchar2(255)
);
create table 팀(
	팀이름 varchar2(255) primary key,
	감독이름 varchar2(255) not null
);
create table 소속(
	선수명 varchar2(255)  
);
create table 구단(
	구단주 varchar2(100) primary key,
	경기장 varchar2(100) not null
);
create table 운영(
	운영자금 varchar2(255) primary key,
	선수영입 varchar2(255)
);


drop table 구단;
drop table 선수;
drop table 소속;
drop table 운영;
drop table 팀;

