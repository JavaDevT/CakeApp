
use cakeshop

create table AdminLogin  (adminId int not null AUTO_INCREMENT,
 userName varchar(20) unique ,password varchar(20),primary key (adminId))

 insert into AdminLogin(userName,password) values ('cake','Cake@123')



create table userLogin  (userId int not null AUTO_INCREMENT,
 userName varchar(20) ,password varchar(20),address varchar(200), phoneNumber varchar(10),primary key (userId))

