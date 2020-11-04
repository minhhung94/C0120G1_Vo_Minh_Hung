drop database if exists rent_building;
create database rent_building DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
use rent_building;

CREATE TABLE role_user (
	id_role INT(12) PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(20) default null
);
insert into role_user (role_name) values('ROLE_USER'),('ROLE_MEMBER'),('ROLE_ADMIN');
CREATE TABLE building (
	id_building int(12) PRIMARY KEY AUTO_INCREMENT,
    -- anh quoc them truong logo
	logo INT(12),
    abbreviation_name VARCHAR(25),
	full_name VARCHAR(50),
    tax_code VARCHAR(25),
    phone varchar(25),
    email varchar(25),
    fax varchar(25),
    address varchar(50),
    management varchar(50),
    manager varchar(50),
    account_number varchar(25),
    recipient_name varchar(50),
    bank varchar(50),
	delete_flag tinyint(4) default null
);
insert into building (abbreviation_name,full_name,tax_code,phone,email
,fax,address,management,manager,account_number,recipient_name,bank,logo) values
('CGĐN','CodeGym','MST-001','002366517021','codegym@gmail.com','123456','295 Nguyễn Tất Thành,Đà Nẵng',
'Bi đẹp trai','Lê Vũ Nguyên','Codegym24','Trần Thị Tố Tâm','Sacombank',1),
('VTP','Vĩnh Trung Plaza','MST-002','002363666777','vtplaza@gmail.com','123457','257 Hùng Vương,Đà Nẵng',
'Nguyễn Đình Hòa','Trần Ngọc Tân','VinhTrung24','Võ Minh Hùng','Vietcombank',2),
('RKS','Rikkeisoft','MST-003','002363962685','rikkei@gmail.com','123458','81 Quang Trung,Đà Nẵng',
'Phạm Thái Cường','Nguyễn Quang Tiến','Reikei24','Nguyễn Đức Thông','ACB',3),
('Soleil','Soleil Ánh Dương','MST-004','968546586','soleilad@gmail.com','123459','2 Phạm Văn Đồng,Đà Nẵng',
'Phạm Minh Hưng','Nguyễn Anh Đức','Reikei24','Nguyễn Hoàng Long','ACB',4),
('CCBT','Cocobay Towers','MST-005','002363954666','cocobay@gmail.com','123460','Hòa Hải,Ngũ Hành Sơn,Đà Nẵng',
'Nguyễn Vũ Thành Tiến','Trương Tấn Hải','Cocobay24','Đoàn Phước Trung','TMCP',5),
('TTHC','Trung tâm Hành chính','MST-006','002363838686','tthc_dn@gmail.com','123461','24 Trần Phú,Đà Nẵng',
'Đào Dung Sỹ My','Nguyễn Công Minh','Tthc24','Trần Quang Nguyên','SHB',6),
('Azura','Azura Apartments','MST-007','968546586','azura@gmail.com','123462','339 Trần Hưng Đạo,Đà Nẵng',
'Lưu Huyền Đức','Tào Mạnh Đức','Azura24','Tôn Trọng Mưu','MSB',7),
('Novotel','Novotel Danang Premier','MST-008','002363929999','novotel@gmail.com','123463','36 Bạch Đằng,Đà Nẵng',
'Gia Cát Khổng Minh','Bàng Sĩ Nguyên','Novotel24','Chu Công Cẩn','Bidv',null),
('4Points','Four Points by Sheraton','MST-009','002363997979','azura@gmail.com','123464','120 Võ Nguyên Giáp,Đà Nẵng',
'Quan Vân Trường','Trương Dực Đức','4Points24','Triệu Tử Long','Eximbank',null),
('CB','Crystal Building','MST-010','918949724','crystal@gmail.com','123465','339 Trần Hưng Đạo,Đà Nẵng',
'Mã Mạnh Khởi','Hoàng Hán Thăng','Crystal24','Khương Bá Ước','Timobank',null);

CREATE TABLE user_building (
    username VARCHAR(50) PRIMARY KEY,
	password_user VARCHAR(255),
    delete_flag tinyint(4) default null,
    id_role INT(12),
    FOREIGN KEY (id_role )
        REFERENCES role_user (id_role)
);
insert into user_building (username,password_user,id_role) values ('quoctuoithantien','quoc123',1),
('dinhhoa','123',2),
('hungmap','123','1'),
('vantien','123','2'),
('ducthong','123','1'),
('symy','123','1'),
('duclong','123','2'),
('anhduc','123','2'),
('mylinh','123','2'),
('thanhtam','123','2'),
('daongoc','123','2'),
('vanho','123','1'),
('nhanvan','123','1'),
('vantoan','123','1'),
('dinhcuu','123','1'),
('vananh','123','1'),
('minhhung','123',3),
('minhhung2','123',3),
('minhhung3','123',3),
('minhhung4','123',3),
('nv1','123',3),
('nv2','123',3),
('nv3','123',3)
;

CREATE TABLE customer (
	id_customer INT(12) PRIMARY KEY AUTO_INCREMENT,
    name_customer VARCHAR(255),
	birthday date,
    id_card VARCHAR(255),
	phone varchar(25),
    email varchar(255),
	address varchar(255),
    gender varchar(25),
    website varchar(255),
    name_company varchar(255),
    username varchar(50),
	delete_flag tinyint(4) default null,
	FOREIGN KEY (username )
        REFERENCES user_building (username)
);
insert into customer (name_customer,birthday,id_card,phone,email,address,gender,website,name_company,username)
 values('Nguyễn Đình Hòa','1994-05-05','343432423',0906543453,'hoadeptrai@gmail.com','12 Lê Quý Kỳ,Đà Nẵng','nam','hoaminnzy.com','Hoa Thien Phú','dinhhoa'),
      ('Lê Đình Quốc','1994-05-05','343432423',0906543453,'nhanvanlam@gmail.com','12 Nguyễn Phước Nguyên,Đà Nẵng','nam','abc.com','Hoa Mặt Trời','quoctuoithantien'),
 	   ('Nguyễn Mih Hùng','1994-05-05','343432423',0906543453,'hung@gmail.com','12 Lê Duẩn,Đà Nẵng','nam','hoaminnzy.com','Hoa Hướng Dương','minhhung'),
 	   ('Phạm Minh Hưng','1994-05-05','343432423',0906543453,'hungmapdeptrai@gmail.com','12 Trường Chinh,Đà Nẵng','nam','vipnha.com','Hoa Vạn Thọ','hungmap'),
 	   ('Nguyễn Văn Tiến','1994-05-05','343432423',0906543453,'tieni@gmail.com','12 Lê Văn Quý,Đà Nẵng','nam','build.com','Hoa Cúc','vantien'),
 	   ('Nguyễn Đức Thông','1994-05-05','343432423',0906543453,'thong@gmail.com','12 Trần Nhân Tông,Đà Nẵng','nam','xmerrr.com','Hoa Bỉ Ngạn','ducthong'),
 	   ('Đào Dung Sỹ My','1994-05-05','343432423',0906543453,'symy@gmail.com','12 Trần Phú,Đà Nẵng','nam','xampp.com','Hoa Mào Gà','symy'),
 	   ('Nguyễn Đức Long','1994-05-05','343432423',0906543453,'longngu@gmail.com','12 Nguyễn Văn Linh,Đà Nẵng','nam','angular.com','Cao Bách Đạt','duclong'),
 	   ('Nguyễn Anh Đức','1994-05-05','343432423',0906543453,'anhduc@gmail.com','12 Nguyễn Sinh sắc,Đà Nẵng','nam','tangle.com','Thiên Long','anhduc'),
 	   ('Nguyễn Mỹ Linh','1994-05-05','343432423',0906543453,'linhinhdepi@gmail.com','12 Đinh Núp,Đà Nẵng','nam','dess.com','CIO','mylinh'),
 	   ('Trần Thanh Tâm','1994-05-05','343432423',0906543453,'tam@gmail.com','12 Lê Sát,Đà Nẵng','nam','caooc.com','Please','thanhtam'),
 	   ('Đào Ngọc','1994-05-05','343432423',0906543453,'daongoc@gmail.com','12 Lê Lợi,Đà Nẵng','nam','netgame.com','Fpt','daongoc'),
 	   ('Nguyễn Văn Hồ','1994-05-05','343432423',0906543453,'sotuongi@gmail.com','12 Lê Lai,Đà Nẵng','nam','baycao.com','Globel','vanho'),
 	   ('NHân Văn Lam','1994-05-05','343432423',0906543453,'anhquocnonnon@gmail.com','12 Quang Trung,Đà Nẵng','nam','cross.com','FShort','nhanvan'),
 	   ('Nguyễn Văn Toản','1994-05-05','343432423',0906543453,'taon@gmail.com','12 Trần Cao Vân,Đà Nẵng','nam','ngmodel.com','Big C','vantoan'),
 	   ('Nguyễn Đình Cựu','1994-05-05','343432423',0906543453,'cuu@gmail.com','12 Ông Ích Khiêm,Đà Nẵng','nam','enzem.com','Cofe','dinhcuu'),
 	   ('Nguyễn Văn Anh','1994-05-05','343432423',0906543453,'anh@gmail.com','12 Mẹ Thứ,Đà Nẵng','nam','fusss.com','CodeGym','vananh');
       
CREATE TABLE employee (
	id_employee INT(12) PRIMARY KEY AUTO_INCREMENT,
    name_employee VARCHAR(255),
    type_employee varchar(25),
	birthday date,
    id_card VARCHAR(255),
	phone varchar(25),
    email varchar(255),
	address varchar(255),
    gender varchar(25),
	username varchar(50),
	level_salary varchar(25),
    part varchar(25),
    salary long,
    start_word date,
	delete_flag tinyint(4) default null,
	FOREIGN KEY (username )
        REFERENCES user_building (username)
);
insert into employee (name_employee,birthday,id_card,phone,email,address,gender,username,level_salary,part,salary,start_word,type_employee)
 values('Nguyễn Minh Hùng','1994-06-05','2017753923',0906543453,'mminhhung@gmail.com','12 Trần Cao Vân,Đà Nẵng','nam','minhhung','bậc 2','markerting',1000000,'2020-06-20','0'),
('Lê Đình Quốc','1989-06-05','2015753623',0906543453,'quockimcuong2@gmail.com','12 Lê Độ ,Đà Nẵng','nam','quoctuoithantien','bậc 4','sale',2000000,'2019-09-05','1'),
('Pham Minh Hưng','1994-06-05','2017753923',0906543453,'mminhhung@gmail.com','12 Trần Cao Vân,Đà Nẵng','nam','hungmap','bậc 3','sale',3000000,'2020-09-07','1'),
('Nguyễn Đức Thông','2000-06-05','2017253923',0906543453,'ducthongg@gmail.com','1 Nguyễn Lương Bằng,Đà Nẵng','nam','ducthong','bậc 1','markerting',4000000,'2020-07-06','0'),
('Đào Dung Sỹ My','1994-06-05','2017763923',0906543453,'symy@gmail.com','34 Hà Thị Thân,Đà Nẵng','nữ','symy','bậc 2','markerting',5000000,'2020-04-05','1'),

('Lê Đình Thám','1989-06-05','2015753623',0906543453,'thamhaohoa@gmail.com','12 Lê Độ ,Đà Nẵng','nam','nv1','bậc 4','sale',2000000,'2019-09-05','1'),
('Phạm Anh Hào','1994-06-05','2017753923',0906543453,'haovuive@gmail.com','12 Trần Cao Vân,Đà Nẵng','nam','nv2','bậc 3','sale',3000000,'2020-09-07','1'),
('Nguyễn Đức Tiến','2000-06-05','2017253923',0906543453,'tientuoitan@gmail.com','1 Nguyễn Lương Bằng,Đà Nẵng','nam','nv3','bậc 1','markerting',4000000,'2020-07-06','0')
 ;
 
CREATE TABLE type_floor (
	id_type_floor INT(12) PRIMARY KEY AUTO_INCREMENT,
	delete_flag tinyint(4) default null,
    name_type_floor VARCHAR(25)
);
insert into type_floor(name_type_floor) values('Tầng trệt'),('Tầng lửng'),('Tầng trên'),('Tầng hầm'),('Tầng thượng');
CREATE TABLE floor (
	id_floor INT(12) PRIMARY KEY AUTO_INCREMENT,
    name_floor VARCHAR(25),
    code_floor VARCHAR(25),
    area double,
    capacity VARCHAR(25),
    status_floor varchar(50),
    delete_flag tinyint(4) default null,
    id_building int(12),
    id_type_floor int(12),
     FOREIGN KEY (id_type_floor )
        REFERENCES type_floor (id_type_floor),
    FOREIGN KEY (id_building )
        REFERENCES building (id_building)
);
insert into floor (name_floor,code_floor,area,capacity,status_floor,id_building,id_type_floor)
values('Tầng 1','MTL001',100,'10','Chưa bàn giao',1,1),
('Tầng 2','MTL002',200,'20','Đang vào ở',2,3),
('Tầng 3','MTL003',300,'30','Đang sửa chữa',3,4),
('Tầng 4','MTL004',400,'40','Đang vào ở',4,2),
('Tầng 5','MTL005',500,'50','Đang sửa chữa',5,5);

insert into floor (name_floor,code_floor,area,capacity,status_floor,id_building,id_type_floor)
values('Tầng 1','MTL001',100,'10','Chưa bàn giao',5,1),
('Tầng 2','MTL002',200,'20','Đang vào ở',3,2),
('Tầng 3','MTL003',300,'30','Đang sửa chữa',4,3),
('Tầng 4','MTL004',400,'40','Đang vào ở',1,4),
('Tầng 5','MTL005',500,'50','Đang sửa chữa',2,5);


CREATE TABLE type_ground (
	id_type_ground INT(12) PRIMARY KEY AUTO_INCREMENT,
	delete_flag tinyint(4) default null,
    name_type_ground VARCHAR(25)
);
insert into type_ground (name_type_ground) values ('Mặt tiền'),('Mặt hậu'),('Mặt đứng'),('Mặt cắt');

CREATE TABLE ground (
	id_ground INT(12) PRIMARY KEY AUTO_INCREMENT,
    note varchar(255),
    code_ground VARCHAR(25),
    area double,
    status_ground varchar(50),
    price int(25),
    price_manager int(25),
    id_floor int(12),
    id_building int(12),
    id_type_ground int(12),
    FOREIGN KEY (id_floor)
        REFERENCES floor (id_floor),
	FOREIGN KEY (id_type_ground)
        REFERENCES type_ground (id_type_ground),    
	delete_flag tinyint(4) default null
);
insert into ground (code_ground,area,status_ground,price,price_manager,id_floor,id_type_ground,id_building) values
('MB001','100','Chưa bàn giao','12000000','500000',1,1,1),('MB002','100','Đang vào ở','12000000','500000',2,2,2),
('MB003','100','Chưa bàn giao','12000000','500000',2,1,2),('MB004','100','Đang vào ở','12000000','500000',3,4,3),
('MB005','100','Đang sửa chữa','12000000','500000',4,3,4),('MB021','100','Chưa bàn giao','12000000','500000',4,1,4),
('MB022','100','Đang vào ở','12000000','500000',5,4,5),('MB031','100','Chưa bàn giao','12000000','500000',5,1,5),
('MB041','100','Chưa bàn giao','12000000','500000',2,4,2),('MB042','100','Đang vào ở','12000000','500000',4,2,4),
('MB043','100','Đang sửa chữa','12000000','500000',5,3,5),('MB023','100','Đang sửa chữa','12000000','500000',2,3,2),
('MB032','100','Đang vào ở','12000000','500000',3,2,3),('MB033','100','Đang sửa chữa','12000000','500000',1,2,1);
CREATE TABLE type_equipment (
	id_type INT(12) PRIMARY KEY AUTO_INCREMENT,
    name_type VARCHAR(25),
    delete_flag tinyint(4) default null
);
insert into type_equipment (name_type) values ('Bóng đèn'),('Điều hòa'),('Quạt'),('Router Wifi'),('Công tắc'),('Ổ cắm');

CREATE TABLE equipment (
	id_equipment INT(12) PRIMARY KEY AUTO_INCREMENT,
    name_equipment varchar(255),
    amount int(25),
    amount_of_broken int(25),
    note VARCHAR(100),
    id_type int(12),
    FOREIGN KEY (id_type)
        REFERENCES type_equipment (id_type) ,
    id_ground int,
	FOREIGN KEY (id_ground)
        REFERENCES ground (id_ground),
	delete_flag tinyint(4) default null
);
insert into equipment (name_equipment,amount,amount_of_broken,note,id_type,id_ground)
values ('Rạng đông 20W',20,'2','chưa thay',1,1),('Panasonic Inverter 1 HP ',20,'2','đã thay',2,1),
('Asean ',20,'0','không biết',3,1),('TpLink ',22,'1','Chưa thay',4,1),('Tenda',30,'1','Chưa thay',5,1),('Asea',30,'1','Chưa thay',6,1);

insert into equipment (name_equipment,amount,amount_of_broken,note,id_type,id_ground)
values ('Rạng đông 20W',20,'2','chưa thay',1,2),('Panasonic Inverter 1 HP ',20,'2','đã thay',2,2),
('Asean ',20,'0','không biết',3,2),('TpLink ',22,'1','Chưa thay',4,2),('Tenda',30,'1','Chưa thay',5,2),('Asea',30,'1','Chưa thay',6,2);

insert into equipment (name_equipment,amount,amount_of_broken,note,id_type,id_ground)
values ('Rạng đông 20W',20,'2','chưa thay',1,4),('Panasonic Inverter 1 HP ',20,'2','đã thay',2,4),
('Asean ',20,'0','không biết',3,4),('TpLink ',22,'1','Chưa thay',4,4),('Tenda',30,'1','Chưa thay',5,4),('Asea',30,'1','Chưa thay',6,4);

insert into equipment (name_equipment,amount,amount_of_broken,note,id_type,id_ground)
values ('Rạng đông 20W',20,'2','chưa thay',1,9),('Panasonic Inverter 1 HP ',20,'2','đã thay',2,9),('Asean ',20,'0','không biết',3,9);

CREATE TABLE contract (
	id_contract INT(12) PRIMARY KEY AUTO_INCREMENT,
    id_employee INT(12),
    id_customer INT(12),
	id_ground int(12),
    term double,
    status_contract boolean,
    start_rent_day date,
    end_rent_day date,
    price double,
    total double,
    deposits double,
    tax_code varchar(25),
    content text,
    unified boolean,
	url_image varchar(255),
    delete_flag tinyint(4) default null,
	FOREIGN KEY (id_customer)
        REFERENCES customer (id_customer),
	FOREIGN KEY (id_employee)
        REFERENCES employee (id_employee),
	FOREIGN KEY (id_ground)	
        REFERENCES ground (id_ground)
);
INSERT INTO `contract` VALUES (1,1,1,1,1,1,'2020-09-09','2020-10-09',12000000,13000000,5000000,'20202020202','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(2,1,17,2,1.12,0,'2020-01-01','2020-02-04',1300000,1456000.0000000002,700000,'MST-001','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(3,1,16,3,2.3,0,'2020-01-01','2020-03-11',1300000,2990000,100000,'MST-005','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(4,1,14,6,0.95,0,'2020-02-05','2020-03-05',12000000,11400000,6000000,'MST-005','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(5,1,10,9,3.12,1,'2020-05-11','2020-08-14',13000000,40560000,6000000,'MST-007','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(6,1,9,5,6.05,1,'2020-01-07','2020-07-09',1500000,9075000,3000000,'MST-006','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(7,1,3,2,4.99,1,'2020-02-07','2020-07-08',1600000,7984000,1600000,'MST-16','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(8,1,13,8,5.09,1,'2020-02-04','2020-07-08',2300000,11707000,2300000,'MST-23','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(9,1,2,5,5.29,1,'2020-02-05','2020-07-15',1300000,6877000,30000000,'MST-10','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(10,1,4,4,5.09,1,'2020-02-12','2020-07-16',130000,661700,130000,'MST-32','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(11,1,5,9,9.17,1,'2020-02-06','2020-11-11',1000000,9170000,10000000,'MST-132','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(12,1,7,6,7.33,1,'2020-03-04','2020-10-13',1300000,9529000,130000,'MST-312','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(13,1,6,5,2.2,0,'2020-03-05','2020-05-11',130000,286000,130000,'MST-130','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(14,1,15,4,2,0,'2020-04-10','2020-06-10',3200000,6400000,3230200,'MST-320','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(15,1,13,10,4.34,1,'2020-03-06','2020-07-16',1399900,6075566,540000,'4300000','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',1,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(16,1,8,9,1.94,0,'2020-03-05','2020-05-03',5400000,10476000,5400000,'549999','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL),
(17,1,17,13,8.21,1,'2020-03-06','2020-11-11',955655,7845927.550000001,6556556,'MST-959','Các bên cam kết thiện chí thực hiện các nghĩa vụ theo Thỏa thuận này và chịu sự ràng buộc của tất cả các điều khoản và điều kiện của Thỏa thuận này. Mọi tranh chấp, bất đồng (sau đây gọi chung là “tranh chấp”) phát sinh từ Thỏa thuận này cũng như từ việc giải thích, thực hiện Thỏa thuận sẽ được các bên thống nhất giải quyết trên tinh thần hoà giải. Nếu không hòa giải được thì tranh chấp sẽ được đưa ra giải quyết tại Tòa án nhân dân có thẩm quyền.',0,'https://www.gstatic.com/webp/gallery3/1_webp_ll.png',NULL);

-- anh quoc them bang image

CREATE TABLE image (
id_image INT(12) PRIMARY KEY AUTO_INCREMENT,
name_image varchar(50),
type_image varchar(50),
url_image varchar(255)
);
insert into image (id_image,name_image,type_image,url_image) values
(1,"tn1","LogoBuilding","../assets/image/logo/logo1.png"),
(2,"tn2","LogoBuilding","../assets/image/logo/logo2.png"),
(3,"tn3","LogoBuilding","../assets/image/logo/logo3.jpg"),
(4,"tn4","LogoBuilding","../assets/image/logo/logo4.jpg"),
(5,"tn5","LogoBuilding","../assets/image/logo/logo5.jpg"),
(6,"tn6","LogoBuilding","../assets/image/logo/logo6.jpg"),
(7,"hd1","ImageContract","../assets/image/logo/logo7.jpg");

CREATE TABLE service (
	id_service INT(12) PRIMARY KEY AUTO_INCREMENT,
    id_contract int(12),
    name_service varchar(50),
    index_before_month int(16) default null,
    index_after_month int(16) default null,
    consume int(16),
    periodic varchar(25),
    unit varchar(25),
    price int(16),
    month_year date,
    status_pay boolean default false,
    FOREIGN KEY (id_contract)
        REFERENCES contract (id_contract)
);
insert into service(name_service,id_contract,index_before_month,index_after_month,consume,periodic,unit,price,month_year) values
('Điện',1,20000,45000,25000,'1 tháng','kW/h',3000,'2015-01-01'),('Nước',1,17000,34000,17000,'1 tháng','m³',3000,'2019-01-01'),('Internet',1,13000,45000,32000,'1 tháng','Mbps',3000,'2015-01-01'),
('Điện',1,20000,45000,25000,'1 tháng','kW/h',3000,'2015-02-01'),('Điện',1,20000,45000,25000,'1 tháng','kW/h',3000,'2019-03-01'),('Điện',1,20000,45000,25000,'1 tháng','kW/h',3000,'2019-04-01'),
('Nước',1,17000,34000,17000,'1 tháng','m³',3000,'2015-02-01'),('Nước',1,17000,34000,17000,'1 tháng','m³',3000,'2019-03-01'),('Nước',1,17000,34000,17000,'1 tháng','m³',3000,'2019-04-01'),
('Điện',2,20000,34000,14000,'1 tháng','kW/h',3000,'2019-02-01'),('Nước',2,16000,27000,11000,'1 tháng','m³',3000,'2019-02-01'),('Internet',2,49000,65000,16000,'1 tháng','Mbps',3000,'2015-02-01'),
('Điện',17,18000,33000,15000,'1 tháng','kW/h',3000,'2019-03-01'),('Nước',17,10000,24000,14000,'1 tháng','m³',3000,'2019-03-01'),('Internet',17,45000,120000,75000,'1 tháng','Mbps',3000,'2015-03-01'),
('Điện',3,21000,78000,57000,'1 tháng','kW/h',3000,'2019-01-01'),('Nước',3,12000,92000,80000,'1 tháng','m³',3000,'2019-01-01'),('Internet',3,38000,51000,13000,'1 tháng','Mbps',3000,'2015-01-01'),
('Điện',4,110000,430000,320000,'1 tháng','kW/h',3000,'2019-01-01'),('Nước',4,19000,52000,33000,'1 tháng','m³',3000,'2019-01-01'),('Internet',4,41000,83000,42000,'1 tháng','Mbps',3000,'2019-01-01'),
('Điện',5,90000,260000,170000,'1 tháng','kW/h',3000,'2019-04-01'),('Nước',5,81000,91000,10000,'1 tháng','m³',3000,'2019-04-01'),('Internet',5,16000,48000,32000,'1 tháng','Mbps',3000,'2019-04-01'),
('Điện',6,10000,20000,10000,'1 tháng','kW/h',3000,'2019-05-01'),('Nước',6,14000,29000,15000,'1 tháng','m³',3000,'2019-05-01'),('Internet',6,52000,76000,24000,'1 tháng','Mbps',3000,'2019-05-01'),
('Điện',7,20000,80000,60000,'1 tháng','kW/h',3000,'2019-06-01'),('Nước',7,23000,93000,70000,'1 tháng','m³',3000,'2019-06-01'),('Internet',1,12000,23000,11000,'1 tháng','Mbps',3000,'2019-06-01'),
('Điện',13,20000,80000,60000,'1 tháng','kW/h',3000,'2019-06-01'),('Nước',13,23000,93000,70000,'1 tháng','m³',3000,'2019-06-01'),('Internet',13,12000,23000,11000,'1 tháng','Mbps',3000,'2019-06-01'),
('Điện',8,20000,80000,60000,'1 tháng','kW/h',3000,'2019-04-01'),('Nước',8,23000,93000,70000,'1 tháng','m³',3000,'2019-05-01'),('Internet',8,12000,23000,11000,'1 tháng','Mbps',3000,'2019-06-01'),
('Điện',9,20000,80000,60000,'1 tháng','kW/h',3000,'2019-07-01'),('Nước',9,23000,93000,70000,'1 tháng','m³',3000,'2019-05-01'),('Internet',9,12000,23000,11000,'1 tháng','Mbps',3000,'2019-06-01'),
('Điện',10,20000,80000,60000,'1 tháng','kW/h',3000,'2020-04-01'),('Nước',10,23000,93000,70000,'1 tháng','m³',3000,'2020-05-01'),('Internet',10,12000,23000,11000,'1 tháng','Mbps',3000,'2020-06-01'),
('Điện',11,20000,80000,60000,'1 tháng','kW/h',3000,'2020-04-01'),('Nước',11,23000,93000,70000,'1 tháng','m³',3000,'2020-05-01'),('Internet',11,12000,23000,11000,'1 tháng','Mbps',3000,'2020-06-01'),
('Điện',15,20000,80000,60000,'1 tháng','kW/h',3000,'2020-07-01'),('Nước',15,23000,93000,70000,'1 tháng','m³',3000,'2020-05-01'),('Internet',15,12000,23000,11000,'1 tháng','Mbps',3000,'2020-06-01'),
('Điện',15,20000,80000,60000,'1 tháng','kW/h',3000,'2020-05-01'),('Nước',15,23000,93000,70000,'1 tháng','m³',3000,'2020-06-01'),('Internet',15,12000,23000,11000,'1 tháng','Mbps',3000,'2020-07-01');
