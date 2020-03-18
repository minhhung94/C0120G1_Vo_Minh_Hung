create database demo1;
use demo1;
CREATE TABLE customer
( 
  idcustomer int PRIMARY KEY AUTO_INCREMENT,
  hoten varchar(45) not null,
  address varchar(45),
  SDT int(10)
);
CREATE TABLE accounts ( 
  idaccounts varchar(45) primary key,
  idcustomer int ,
  foreign key (idcustomer) references customer(idcustomer),
  ngaymo date,
  SoduTK int
);
create table transactions(
	idmagiaodich int primary key,
    idaccounts varchar(45) ,
    foreign key (idaccounts) references accounts(idaccounts),
	sotien int,
    thoigian date,
    mota varchar(45)
);