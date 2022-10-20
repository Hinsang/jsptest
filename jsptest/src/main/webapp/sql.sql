drop database if exists jsptest;
create database jsptest;
use jsptest;

drop table if exists board;
create table board(
	bno int auto_increment primary key,
	btitle varchar(20),
    bcontent varchar(100),
    bid varchar(20),
    bpw varchar(20),
    bdate datetime default now(),
    bpoint int default 0
);

select * from board;
