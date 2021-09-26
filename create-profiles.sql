drop database if exists test;
create database test;
use test;

drop table if exists profiles;
create table test.profiles (
    id mediumint not null auto_increment,
    name varchar(30) not null,
    primary key (id)
);