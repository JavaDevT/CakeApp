use cakeshop

create table AdminLogin  (adminId int not null AUTO_INCREMENT, 
 userName varchar(20) unique ,password varchar(20),primary key (adminId))
 
 insert into AdminLogin(userName,password) values ('cake','Cake@123')
 
 delete userLogin
 drop table userLogin
 
create table userLogin  (userId int not null AUTO_INCREMENT, 
 userName varchar(20) unique ,password varchar(20),address_line1 varchar(200), email_id varchar(100), address_line2  varchar(200), pin_code varchar(6) not null, phoneNumber varchar(10),primary key (userId))
 
 
	 select * from userlogin 