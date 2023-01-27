use cakeshop

create table AdminLogin  (adminId int not null AUTO_INCREMENT, 
 userName varchar(20) unique ,password varchar(20),primary key (adminId))
 
 insert into AdminLogin(userName,password) values ('cake','Cake@123')
 
 delete userLogin
 drop table userLogin
 
create table userLogin  (userId int not null AUTO_INCREMENT, 
 userName varchar(20) unique ,password varchar(20),address_line1 varchar(200), email_id varchar(100), address_line2  varchar(200), pin_code varchar(6) not null, phoneNumber varchar(10),primary key (userId))
 
 create table cake_info  (cake_id int not null AUTO_INCREMENT,
 cake_name varchar(50) ,price_kg decimal (8,2), quantity mediumint unsigned, egg_less  boolean   , cake_image blob,primary key (cake_id))


  insert into cake_info(cake_name,price_kg,quantity,egg_less,cake_image) values ('cake','22.55',1,true,'fgfd')

  drop table cake_info
 select * from cake_info




	 select * from userlogin