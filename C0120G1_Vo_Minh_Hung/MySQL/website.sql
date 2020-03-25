drop database if exists website;
create database website;
use website;
create table suppliers(
id int(11) auto_increment primary key,
name varchar(100) not null,
email varchar(50) not null,
phone_number varchar(20),
address varchar(500)
);
insert into suppliers values (null,'Sony','sony@gmail.com','098711231','Núi Thành - ĐN'),
							(null,'SamSung','SamSung@gmail.com','078711231','Lê Duẩn - ĐN'),
                            (null,'APPLE','Apple@gmail.com','088711231','Lê Duẩn - ĐN'),
                            (null,'Lennovo','Lennovo@gmail.com','088711231','Đống Đa - ĐN'),
                            (null,'Dell','Dell@gmail.com','018711231','Nguyễn văn Linh - ĐN'),
                            (null,'TOSHIBA','Dell@gmail.com','018711231','Nguyễn văn Linh - ĐN');

create table categories(
id int(11) auto_increment primary key,
name varchar(50) not null,
description varchar(500)
);
insert into categories value (null,'Tivi','là 1 loại tivi'), 
(null,'Điện Thoại','là loại điện thoại'), (null,'Tai Nghe','là 1 loại tai nghe'), 
(null,'Laptop','là 1 loại tai nghe'), (null,'Màn hình','là 1 loại tai nghe');

create table products(
id int(11) auto_increment primary key,
name varchar(50) not null,
image_url varchar(1000) not null,
price decimal(18.2),
discount decimal(18.2),
stock decimal(18.2),
category_id int(11),
supplier_id int(11),
description varchar(1000),
foreign key (category_id) references categories(id) on delete cascade,
foreign key (supplier_id) references suppliers(id) on delete cascade
);
insert into products values (null,'Iphone 8','src/a222','12000','4','3','2','3','aaaaaaaaaaaa'),
							(null,'Dell XPS','src/a2233','1200000','6','4','5','4','ddddddddđ'),
							(null,'lenovo s5','src/a2223','1500000','11','2','4','3','lllllll'),
							(null,'S20','src/a2233','2200000','12','4','2','2','sssssssss'),
                            (null,'32Inch','src/a2233','220000','6','3','5','2','sssssssss'),
                            (null,'dell d6','src/a2233','2200000','6','8','5','5','sssssssss');

create table employees(
id int(11) auto_increment primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
phone_number varchar(20),
address varchar(500) not null,
email varchar(50) not null,
birthday datetime
);
insert into employees values (null,'Nguyễn Văn','Anh','098552222','03 Lê Đình Lý - ĐN','anhnguyen@gmail.com','1991/09/26'),
(null,'Nguyễn Văn','Việt','098552222','15 Cách Mạng T8 - ĐN','vietnguyen@gmail.com','1988/03/25'),
(null,'Nguyễn Thị','Bé','098552222','03 Lý Thái Tổ- ĐN','benguyen@gmail.com','1989/11/22'),
(null,'Trần Anh','Quốc','098552222','23 Trần Cao Vân- ĐN','quocanh@gmail.com','1988/10/29');

create table customers(
id int(11) auto_increment primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
phone_number varchar(20),
address varchar(500) not null,
email varchar(50) not null,
birthday date
);
insert into customers values(null,'Nguyễn Thị Kim','Nguyệt','09655555','Đà Nẵng','nguyet@gmail.com','1999/07/21'),
							(null,'Nguyễn Thị Hồng','Ánh','09255555','Quảng Nam','anh@gmail.com','1993/3/25'),
							(null,'Lương Thế','Vinh','09655555','Đà Nẵng','thevinh@gmail.com','1986/12/21'),
							(null,'Nguyễn Thị Diệu','Hiền','09455555','Hội An','dieuhien@gmail.com','1998/10/21'),
							(null,'Trần Văn','Quân','09145555','Tam Kỳ','anhquan@gmail.com','1996/08/21');

create table orders(
id int(11) auto_increment primary key,
created_date datetime not null,
shipped_date datetime,
status varchar(50) not null,
description varchar(1000),
shipping_address varchar(500) not null,
shipping_city varchar(50) not null,
payment_type varchar(20) not null,
customer_id int(11),
employee_id int(11),
foreign key (customer_id) references customers(id) on delete cascade,
foreign key (employee_id) references employees(id) on delete cascade
);
insert into orders values (null,'2019/3/21','2019/4/01','COMPLETED','cccccccccc','03 Núi thành','Đà Nẵng','CASH',1,1),
(null,'2019/8/11','2019/8/21','COMPLETED','cccccccccc','03 Phan Châu Trinh','Tam Kỳ','CASH',1,1),
(null,now(),'2020/4/01','CANCELED','cccccccccc','23 Núi thành','Đà Nẵng','CASH',1,1),
(null,now(),'2020/3/31','CANCELED','cccccccccc','28 Tam Hoà','Hà Nội','CREADIT CARD','2','2'),
(null,now(),'2020/3/30','COMPLETED','cccccccccc','08 Vĩnh Trung','Hà Nội','CREADIT CARD','3','2');

create table orderdetails(
id int(11) auto_increment primary key,
order_id int(11),
product_id int(11),
quantity decimal(18,2),
foreign key (order_id) references orders(id) on delete cascade,
foreign key (product_id) references products(id) on delete cascade
);
insert into orderdetails values-- (null,1,1,3),(null,2,2,5),(null,3,4,8),(null,4,2,4),
(null,5,4,6);

SET SQL_SAFE_UPDATES=0; 
select customers.id,concat_ws(' ',first_name, last_name) as full_Name,customers.address,products.name as 'tên SP',
orderdetails.quantity as 'Số lượng', created_date from suppliers join products using(id) 
						join orderdetails using(id)
                        join orders using(id)
                        join customers using(id);
SELECT * FROM website.products;            
-- cau 1        
update products set price = price*110/100 where price <= 100000;
-- cau 2
update products set discount = discount+5 where discount <= 10;
-- cau 3
select * from products where discount <=10;
-- câu 4
select * from products where stock <=5;
-- Câu 5
select * from customers where address = 'Đà nẵng';
-- câu 6
select * from customers where year(birthday)=1990;
-- câu 7
select * from customers where day(birthday)= day(now()) and month(birthday)= month(now());
-- câu 8
select * from orders where status= 'COMPLETED';
-- Câu 9
select * from orders where status= 'COMPLETED' and date(created_date) = date(now());
-- câu 10 
select * from orders where status= 'CANCELED';
-- Câu 11 
select * from orders where payment_type = 'CASH';
-- câu 12
select * from orders where payment_type = 'CREADIT CARD';
-- câu 13
select * from orders where shipping_address = 'TK';
-- câu 14 Hiển thị tất cả các nhân viên có sinh nhật là hôm nay
select * from employees where day(birthday)= day(now()) and month(birthday)= month(now());
-- câu 15 Hiển thị tất cả các nhà cung cấp có tên là: (SONY, SAMSUNG, TOSHIBA, APPLE)
select * from suppliers where name in ('Sony', 'Samsung', 'TOSHIBA', 'APPLE');
-- câu 16 Hiển thị tất cả các mặt hàng cùng với CategoryName
select products.name as name_products ,categories.name as nam_categories from products left join categories using(id);
-- câu 17 Hiển thị tất cả các đơn hàng cùng với thông tin chi tiết khách hàng (Customer)
select * from customers join orders using(id);
-- câu 18 Hiển thị tất cả các mặt hàng cùng với thông tin chi tiết của Category và Supplier
select * from products join categories using(id)
						join suppliers using(id);
-- câu 19 Hiển thị tất cả danh mục (Categories) với số lượng hàng hóa trong mỗi danh mục(Viết 2 cách)
select categories.name,sum(stock) from categories join products using(id) group by categories.id; 
-- select categories.name,sum(stock) from categories, products where categories.id = products.categories_id  group by categories.id;
-- câu 20 Hiển thị tất cả nhà cung cấp (Suppliers) với số lượng hàng hóa mỗi nhà cung cấp(Viết 2 cách)
select suppliers.*,sum(stock) from suppliers join products using(id) group by suppliers.id;

-- câu 21 Hiển thị tất cả các mặt hàng được bán trong khoảng từ ngày, đến ngày(Khoảng cách ngày các bạn tuỳ chọn theo data phù hợp với mỗi người) 
select * from orders join products using(id) where date(created_date) between '2020-03-15' and '2020-04-01';

-- câu 22 Hiển thị tất cả các khách hàng mua hàng trong khoảng từ ngày, đến ngày((Khoảng cách ngày các bạn tuỳ chọn theo data phù hợp với mỗi người))
select * from customers join orders using(id) where date(created_date) between '2020-03-15' and '2020-04-01';

-- câu 23 Hiển thị tất cả các khách hàng mua hàng (với tổng số tiền) trong khoảng từ ngày, đến ngày(viêt bằng 2 cách, ngày tuỳ chọn )
select customers.first_name,customers.last_name,sum(price - (price*discount/100)) as TongTien from customers join orders using(id) 
join orderdetails using(id) join products using(id) where date(created_date) between '2020-03-15' and '2020-04-01'
 group by customers.id;
 
-- câu 24 Hiển thị tất cả đơn hàng với tổng số tiền
select orders.id,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' from orders join orderdetails using(id)
join products using(id) where status = 'COMPLETED' group by orders.id;

-- câu 25  Hiển thị tất cả các nhân viên bán hàng với tổng số tiền bán được
select employees.*,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' from employees
join orders using(id)
join orderdetails using(id)
join products using(id) where status = 'COMPLETED' group by employees.id;
