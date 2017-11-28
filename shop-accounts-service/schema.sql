
create database shop;
use shop;

create table shop.ACCOUNTS(
email varchar(30) primary key,
password varchar(30),
name varchar(30),
mobile varchar(10)
);

insert into shop.ACCOUNTS values('nag@email.com','secret','Nag','9945674228');