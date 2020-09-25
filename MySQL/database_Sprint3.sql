drop database if exists sprint3;
create database sprint3 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
use sprint3;

CREATE TABLE role (
    id_role INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(20) NOT NULL
);
insert into role (role_name) values ('ROLE_ADMIN'),('ROLE_MEMBER'),('ROLE_USER');

CREATE TABLE user (
    id_user INT PRIMARY KEY AUTO_INCREMENT,
    full_name NVARCHAR(150),
    username VARCHAR(50) NOT NULL,
    password VARCHAR(150) NOT NULL,
    delete_flag TINYINT(4) DEFAULT NULL,
    id_role INT,
    FOREIGN KEY (id_role)
        REFERENCES role (id_role)
);
insert into user (full_name,username,password,id_role) values ('Lê Đình Quốc','quocle123','quoc123',3),
('Trần Ngọc Tân','tantran','tan123',3),('Nguyễn Anh Tuấn','tuannguyen','tuan123',2),('Võ Minh Hùng','minhhung','hung123',1);

CREATE TABLE category (
    id_category INT PRIMARY KEY AUTO_INCREMENT,
    name_category VARCHAR(150),
	delete_flag TINYINT(4) DEFAULT NULL
);
insert into category(name_category) values('Đồ gia dụng'),('Đồ điện tử'),('Điện thoại'),('Laptop'),('Điện thoại');

CREATE TABLE goods (
    id_good INT PRIMARY KEY AUTO_INCREMENT,
    name_good NVARCHAR(255) NOT NULL,
    quantity INT NOT NULL,
    price DOUBLE NOT NULL,
    trademark NVARCHAR(150) NOT NULL,
    id_category INT,
    sale_off INT,
    images VARCHAR(255) DEFAULT NULL,
    delete_flag TINYINT(4) DEFAULT NULL,
    FOREIGN KEY (id_category)
        REFERENCES category (id_category)
);
insert into goods(name_good,quantity,price,trademark,id_category,sale_off) 
values	('Bình siêu tốc Sunhouse 1,8 lit',12,120000,'Sunhouse',1,0),
		('Nồi cơm điện cao tầng Tefal 0.7 lít',11,1200000,'Tefal',1,0),
		('Android Tivi Sony 4K 43 inch',8,9600000,'Sony',2,0),
		('Smart Tivi Samsung 43 inch',8,9600000,'Samsung',2,0),
        ('Điện thoại iPhone 11 Pro Max 64GB',18,33600000,'Samsung',3,0),
        ('Điện thoại Samsung Galaxy Z Flip',18,36000000,'Samsung',3,0);

CREATE TABLE bills (
    id_bill INT PRIMARY KEY AUTO_INCREMENT,
    create_date DATE NOT NULL,
    bill_type INT NOT NULL,
    id_good INT,
    id_user INT NOT NULL,
    quantity INT NOT NULL,
    delete_flag TINYINT(4) DEFAULT NULL,
    FOREIGN KEY (id_good)
        REFERENCES goods (id_good),
    FOREIGN KEY (id_user)
        REFERENCES user (id_user)
);
insert into bills(create_date,bill_type,id_good,id_user,quantity) 
values	('2020-06-24',0,null,3,2),('2020-06-30',0,null,3,4),('2020-07-12',0,null,3,2);
