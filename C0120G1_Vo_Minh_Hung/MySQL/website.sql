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
                            (null,'TOSHIBA','Toshiba@gmail.com','018711231','Nguyễn Hoàng - ĐN');

create table categories(
id int(11) auto_increment primary key,
name varchar(50) not null,
description varchar(500)
);
insert into categories value (null,'Tivi','là 1 loại tivi'), 
(null,'Điện Thoại','là loại điện thoại'), (null,'Tai Nghe','là 1 loại tai nghe'), 
(null,'Laptop','là 1 loại laptop'), (null,'Màn hình','là 1 loại màn hình');

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
insert into orderdetails values (null,1,1,3),(null,2,2,5),(null,3,4,8),(null,4,2,4),(null,5,4,6);
         
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
select products.name as name_products ,categories.name as nam_categories from products left join categories on products.category_id=categories.id;

-- câu 17 Hiển thị tất cả các đơn hàng cùng với thông tin chi tiết khách hàng (Customer)
select * from customers join orders on customers.id=orders.customer_id;

-- câu 18 Hiển thị tất cả các mặt hàng cùng với thông tin chi tiết của Category và Supplier
select * from products join categories on products.category_id=categories.id 
						join suppliers on suppliers.id=products.supplier_id;
                        
-- câu 19 Hiển thị tất cả danh mục (Categories) với số lượng hàng hóa trong mỗi danh mục(Viết 2 cách)
-- c1:
select categories.*,sum(stock) from categories join products on products.category_id=categories.id group by categories.id; 
-- c2:
select categories.*,sum(stock) from products, categories where 
products.category_id=categories.id group by categories.id;

-- câu 20 Hiển thị tất cả nhà cung cấp (Suppliers) với số lượng hàng hóa mỗi nhà cung cấp(Viết 2 cách)
-- c1:
select suppliers.*,sum(stock) from suppliers join products on suppliers.id=products.supplier_id group by suppliers.id order by id ;
-- c2:
select suppliers.*,sum(stock) from suppliers, products where suppliers.id=products.supplier_id group by suppliers.id;

-- câu 21 Hiển thị tất cả các mặt hàng được bán trong khoảng từ ngày, đến ngày(Khoảng cách ngày các bạn tuỳ chọn theo data phù hợp với mỗi người) 
select * from orders join products using(id) where date(created_date) between '2020-03-15' and '2020-04-01';

-- câu 22 Hiển thị tất cả các khách hàng mua hàng trong khoảng từ ngày, đến ngày((Khoảng cách ngày các bạn tuỳ chọn theo data phù hợp với mỗi người))
select * from customers join orders using(id) where date(created_date) between '2020-03-15' and '2020-04-01';

-- câu 23 Hiển thị tất cả các khách hàng mua hàng (với tổng số tiền) trong khoảng từ ngày, đến ngày(viêt bằng 2 cách, ngày tuỳ chọn )
-- c1:
SELECT 
    customers.*,
    SUM(quantity *(price - (price*discount/100))) AS 'tổng số tiền'
FROM
    customers
        JOIN
    orders ON customers.id = customer_id
        JOIN
    orderdetails ON orders.id = order_id
        JOIN
    products ON products.id = product_id
WHERE
    date(created_date) between '2020-03-15' and '2020-04-01'
GROUP BY customer_id;
-- c2: 
select customers.*,sum(quantity *(price - (price*discount/100)))  as TongTien 
from customers,orders,orderdetails,products where customers.id = orders.customer_id 
and orders.id = orderdetails.order_id and orderdetails.product_id=products.id  
and date(created_date) between '2020-03-15' and '2020-04-01' group by customer_id;

-- câu 24 Hiển thị tất cả đơn hàng với tổng số tiền
select orders.id,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' from orders join orderdetails ON orders.id = order_id
join products on products.id = product_id where status = 'COMPLETED' group by orders.id;

-- câu 25  Hiển thị tất cả các nhân viên bán hàng với tổng số tiền bán được

select
employees.*,SUM(quantity * (price - (price*discount/100))) 'tổng tiền'
from
employees
join orders on employees.id = employee_id
join orderdetails on orders.id = order_id
join products ON products.id = product_id
where status = 'COMPLETED'
group by employees.id;

-- câu 26 Hiển thị tất cả các mặt hàng không bán được
select products.*,orderdetails.product_id from products left join orderdetails on product_id=products.id 
left join orders on orders.id = order_id where product_id is null ;


-- câu 27 Hiển thị tất cả các nhà cung cấp không bán được trong khoảng từ ngày, đến ngày

select suppliers.* from suppliers 
where suppliers.id not in (select products.supplier_id from products 
join orderdetails on orderdetails.product_id=products.id join orders on orders.id = order_id 
where status = 'COMPLETED' and date(created_date) between '2020-03-15' and '2020-04-01' );


-- Câu 28 Hiển thị top 3 các nhân viên bán hàng với tổng số tiền bán được từ cao đến thấp trong khoảng từ ngày, đến ngày

select
employees.*,SUM(quantity * (price - (price*discount/100))) 'tổng tiền'
from
employees
join orders on employees.id = employee_id
join orderdetails on orders.id = order_id
join products ON products.id = product_id
where status = 'COMPLETED' and (date(created_date) between '2020-03-15' and '2020-04-01' )
group by employees.id limit 3;

-- câu 29 Hiển thị top 5 các khách hàng mua hàng với tổng số tiền mua được từ cao đến thấp trong khoảng từ ngày, đến ngày

select orders.id,orders.customer_id,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' from orders 
join orderdetails ON orders.id = order_id join products on products.id = product_id where status = 'COMPLETED' 
and (date(created_date) between '2020-03-15' and '2020-04-01' ) group by orders.id limit 5;


-- câu 30 Hiển thị danh sách các mức giảm giá của cửa hàng
select products.discount as 'Giảm giá' from products ;

-- câu 31 Hiển thị tất cả danh mục (Categories) với tổng số tiền bán được trong mỗi danh mục
-- c1: Dùng INNER JOIN + GROUP BY với lệnh SUM
select categories.name as categories_name ,orders.id as  order_id,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' 
from orders join orderdetails ON orders.id = order_id
join products on products.id = product_id join categories on products.category_id=categories.id 
where status = 'COMPLETED' group by category_id;

-- c2: Dùng SubQuery với lệnh SUM



-- Câu 32: Hiển thị tất cả đơn hàng với tổng số tiền mà đã được giao hàng thành công trong khoảng từ ngày, đến ngày
select orders.*,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' 
from orders join orderdetails ON orders.id = order_id
join products on products.id = product_id join categories on products.category_id=categories.id 
where status = 'COMPLETED' and (date(created_date) between '2020-03-15' and '2020-04-01' ) group by order_id;

-- Câu 33: Hiển thị tất cả đơn hàng có tổng số tiền bán hàng nhiều nhất trong khoảng từ ngày, đến ngày
select orders.*,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' 
from orders join orderdetails ON orders.id = order_id
join products on products.id = product_id join categories on products.category_id=categories.id 
where status = 'COMPLETED' and (date(created_date) between '2020-03-15' and '2020-04-01' ) group by order_id  order by quantity desc limit 1;

-- Câu 34: Hiển thị tất cả đơn hàng có tổng số tiền bán hàng ít nhất trong khoảng từ ngày, đến ngày
select orders.*,sum(quantity * (price - (price*discount/100))) as 'Tổng tiền' 
from orders join orderdetails ON orders.id = order_id
join products on products.id = product_id join categories on products.category_id=categories.id 
where status = 'COMPLETED' and (date(created_date) between '2020-03-15' and '2020-04-01' ) group by order_id  order by quantity asc limit 1;


-- Câu 35: Hiển thị trung bình cộng giá trị các đơn hàng trong khoảng từ ngày, đến ngày

select avg(quantity * (price - (price*discount/100))) as 'Trung bình cộng' 
from orders join orderdetails ON orders.id = order_id
join products on products.id = product_id join categories on products.category_id=categories.id 
where status = 'COMPLETED' and (date(created_date) between '2020-03-15' and '2020-04-01' ) ;


