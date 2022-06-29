drop database if exists test;
create database test;
use test;

drop table if exists messages;
create table test.messages (
    id mediumint not null auto_increment,
    text varchar(30) not null,
    primary key (id)
);

insert into messages(text) values('DB接続完了です!');