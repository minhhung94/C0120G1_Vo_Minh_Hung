								-- Võ Minh Hùng
create database furama_resort;
use furama_resort;
insert into vi_tri(id_vi_tri,ten_vi_tri) values (1,'Trưởng phòng');
insert into vi_tri(id_vi_tri,ten_vi_tri) values (2,'Nhân viên');
insert into vi_tri(id_vi_tri,ten_vi_tri) values (3,'Quản Lý');

insert into trinh_do(id_trinh_do,trinh_do) values (1,'đại học');
insert into trinh_do(id_trinh_do,trinh_do) values (2,'thạc sĩ');
insert into trinh_do(id_trinh_do,trinh_do) values (3,'tiến sĩ');
insert into trinh_do(id_trinh_do,trinh_do) values (4,'12/12');

insert into bo_phan(id_bo_phan,ten_bo_phan) values (1,'Kế toán');
insert into bo_phan(id_bo_phan,ten_bo_phan) values (2,'Nhân sự');
insert into bo_phan(id_bo_phan,ten_bo_phan) values (3,'Kinh doanh');
insert into bo_phan(id_bo_phan,ten_bo_phan) values (4,'Bán hàng');
insert into bo_phan(id_bo_phan,ten_bo_phan) values (5,'Tạp vụ');

insert into nhan_vien(id_nhan_vien,ho_ten_nhan_vien,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi) 
values (1,'Nguyễn Văn A',2,1,2,'1996/02/02',023655487,5000000,0987552521,"vana123@gmail.com",'Đà nẵng'),
 (2,'Nguyễn Văn B',1,2,2,'1992/02/02',033643487,5000000,0787552521,"vanb2233@gmail.com",'Huế'),
 (3,'Trần Thị Mẹt',2,4,5,'1991/11/22',0133643487,3000000,0887552521,'mettran@gmail.com','Quảng Nam'),
 (4,'Nguyễn Thị C',2,1,4,'1992/04/08',0245689987,4500000,0978553331,'cnguyen12@gmail.com','Đà Nẵng'),
 (5,'Dinh Van Tam',3,2,2,'1989/10/18',223588799,6000000,0968871222,'tamdinh12@gmail.com','Hội An');

insert into loai_khach(id_loai_khach,ten_loai_khach) values (1,'Diamond'),(2,'Platinium');
insert into loai_khach(id_loai_khach,ten_loai_khach) values (3,'Gold'), (4,'Silver'), (5,'Member');

insert into khach_hang(id_khach_hang,id_loai_khach,ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi) 
values(1,2,'Đinh Văn Toàn','1997/01/01',03654123,09856321,'toandinh@gmail.com','Quảng Nam');
insert into khach_hang(id_khach_hang,id_loai_khach,ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi) 
values (2,1,'Trần Thị An','1993/10/12',032654123,098563221,'thian12@gmail.com','Quảng Trị'),
	  (3,2,'Trần Văn Tám','1986/11/12',012255545,095888770,'tamtran123@gmail.com','Huế'),
      (4,5,'Trần Cảnh','1975/08/22',011255545,095885770,'canhtran@gmail.com','Đà Nẵng'),
      (5,5,'Trần Thị Tý','2004/07/21',132654123,068563221,'tytran12@gmail.com','Đà Nẵng');

insert into loai_dich_vu(ten_loai_dich_vu) values('Superior'), 
('Deluxe'), ('Suite'), ('Executive Suite'), ('Standard');

insert into kieu_thue(id_kieu_thue,ten_kieu_thue,gia)values(1,'Thuê theo giờ',2000);
insert into kieu_thue(id_kieu_thue,ten_kieu_thue,gia)values(2,'Thuê theo ngày',20000);
insert into kieu_thue(id_kieu_thue,ten_kieu_thue,gia)values(3,'Thuê theo tháng',3000000);
insert into kieu_thue(id_kieu_thue,ten_kieu_thue,gia)values(4,'Thuê theo năm',5000000);

insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_tang,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values 	(1,'Villa',100,3,50000,2,4,'Sẵn sàng'),
		(2,'House',80,2,30000,2,3,'Sẵn sàng'),
		(3,'Room',50,1,20000,1,1,'SS');

insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)
value 	(5,1,1,'2019/10/01','2019/11/22',100000,2000000),
		(3,2,1,'2019/11/22','2020/01/22',200000,3000000),
		(1,1,2,'2019/12/12','2020/03/03',1000000,20000000),
		(2,2,2,'2019/12/24','2020/02/02',500000,30000000),
		(4,3,1,'2020/01/12','2020/03/15',5000000,50000000);

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_khach_dung)value ('Karaoke',20000,'VND','Sẵn sàng'),
('Massage',50000,'VND','Sẵn sàng'),('Car',40000,'VND','Sẵn sàng'), ('Drink',10000,'VND','ss');

insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)value (1,1,3), (2,2,4), (3,3,2), (4,1,2);
