						-- Võ Minh Hùng
drop database if exists furama_resort;
create database furama_resort;
use furama_resort;
CREATE TABLE vi_tri (
    id_vi_tri INT PRIMARY KEY,
    ten_vi_tri VARCHAR(45)
);
CREATE TABLE trinh_do (
    id_trinh_do INT PRIMARY KEY,
    trinh_do VARCHAR(45)
);
CREATE TABLE bo_phan (
    id_bo_phan INT PRIMARY KEY,
    ten_bo_phan VARCHAR(45)
);
CREATE TABLE nhan_vien (
    id_nhan_vien INT PRIMARY KEY,
    ho_ten_nhan_vien NVARCHAR(255),
    id_vi_tri INT,
    FOREIGN KEY (id_vi_tri)
        REFERENCES vi_tri (id_vi_tri) ON DELETE CASCADE,
    id_trinh_do INT,
    FOREIGN KEY (id_trinh_do)
        REFERENCES trinh_do (id_trinh_do) ON DELETE CASCADE,
    id_bo_phan INT,
    FOREIGN KEY (id_bo_phan)
        REFERENCES bo_phan (id_bo_phan) ON DELETE CASCADE,
    ngay_sinh DATE,
    so_cmnd VARCHAR(45),
    luong VARCHAR(45),
    sdt VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45)
);
CREATE TABLE loai_khach (
    id_loai_khach INT PRIMARY KEY AUTO_INCREMENT,
    ten_loai_khach VARCHAR(45)
);
CREATE TABLE khach_hang (
    id_khach_hang INT PRIMARY KEY AUTO_INCREMENT,
    id_loai_khach INT,
    FOREIGN KEY (id_loai_khach)
        REFERENCES loai_khach (id_loai_khach) ON DELETE CASCADE,
    ho_ten NVARCHAR(100),
    ngay_sinh DATE,
    so_cmnd VARCHAR(45),
    sdt VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45)
);
CREATE TABLE loai_dich_vu (
    id_loai_dich_vu INT PRIMARY KEY AUTO_INCREMENT,
    ten_loai_dich_vu VARCHAR(45)
);
CREATE TABLE kieu_thue (
    id_kieu_thue INT PRIMARY KEY AUTO_INCREMENT,
    ten_kieu_thue VARCHAR(45),
    gia INT
);
CREATE TABLE dich_vu (
    id_dich_vu INT PRIMARY KEY AUTO_INCREMENT,
    ten_dich_vu VARCHAR(45),
    dien_tich INT,
    so_tang INT,
    so_nguoi_toi_da VARCHAR(45),
    chi_phi_thue VARCHAR(45),
    id_kieu_thue INT,
    FOREIGN KEY (id_kieu_thue)
        REFERENCES kieu_thue (id_kieu_thue) ON DELETE CASCADE,
    id_loai_dich_vu INT,
    FOREIGN KEY (id_loai_dich_vu)
        REFERENCES loai_dich_vu (id_loai_dich_vu),
    trang_thai VARCHAR(45)
);
CREATE TABLE hop_dong (
    id_hop_dong INT PRIMARY KEY AUTO_INCREMENT,
    id_nhan_vien INT,
    FOREIGN KEY (id_nhan_vien)
        REFERENCES nhan_vien (id_nhan_vien) ON DELETE CASCADE,
    id_khach_hang INT,
    FOREIGN KEY (id_khach_hang)
        REFERENCES khach_hang (id_khach_hang) ON DELETE CASCADE,
    id_dich_vu INT,
    FOREIGN KEY (id_dich_vu)
        REFERENCES dich_vu (id_dich_vu) ON DELETE CASCADE,
    ngay_lam_hop_dong DATE,
    ngay_ket_thuc DATE,
    tien_dat_coc INT,
    tong_tien INT
);
CREATE TABLE dich_vu_di_kem (
    id_dich_vu_di_kem INT PRIMARY KEY AUTO_INCREMENT,
    ten_dich_vu_di_kem VARCHAR(45),
    gia INT,
    don_vi VARCHAR(45),
    trang_thai_kha_dung VARCHAR(45)
);
CREATE TABLE hop_dong_chi_tiet (
    id_hop_dong_chi_tiet INT PRIMARY KEY AUTO_INCREMENT,
    id_hop_dong INT,
    FOREIGN KEY (id_hop_dong)
        REFERENCES hop_dong (id_hop_dong) ON DELETE CASCADE,
    id_dich_vu_di_kem INT,
    FOREIGN KEY (id_dich_vu_di_kem)
        REFERENCES dich_vu_di_kem (id_dich_vu_di_kem) ON DELETE CASCADE,
    so_luong INT
);

-- nhập dữ liệu cho các bảng 

insert into vi_tri(id_vi_tri,ten_vi_tri) values (1,'Trưởng phòng');
insert into vi_tri(id_vi_tri,ten_vi_tri) values (2,'Nhân viên');
insert into vi_tri(id_vi_tri,ten_vi_tri) values (3,'Quản Lý');

insert into trinh_do(id_trinh_do,trinh_do) values (1,'đại học');
insert into trinh_do(id_trinh_do,trinh_do) values (2,'thạc sĩ');
insert into trinh_do(id_trinh_do,trinh_do) values (3,'tiến sĩ');
insert into trinh_do(id_trinh_do,trinh_do) values (4,'trung cấp');

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
      (4,1,'Trần Cảnh','1975/08/22',011255545,095885770,'canhtran@gmail.com','Quảng Ngãi'),
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
value 	(2,1,3,'2018/09/11','2018/11/14',200000,1500000),
		(5,1,1,'2018/10/01','2018/11/22',100000,2000000),
		(3,4,1,'2019/11/22','2020/01/22',200000,3000000),
		(1,1,2,'2019/12/12','2020/03/03',1000000,20000000),
		(2,2,2,'2019/12/24','2020/02/02',500000,30000000),
		(4,3,1,'2020/01/12','2020/03/15',5000000,50000000);

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)value ('Karaoke',20000,'VND','Sẵn sàng'),
('Massage',50000,'VND','Sẵn sàng'),('Car',40000,'VND','Sẵn sàng'), ('Drink',10000,'VND','ss');

insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)value (1,1,3), (2,2,4), (3,3,2), (4,1,2);

-- task 2
-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự
--  “H”, “T” hoặc “K” và có tối đa 15 ký tự.	

select * from `furama_resort`.nhan_vien
 where (ho_ten_nhan_vien REGEXP "H.*|T.*|K.*")  and length(ho_ten_nhan_vien)<15;

-- task3
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select * from khach_hang
where  ((year(now())-year(ngay_sinh)) between 18 and 50) and (dia_chi='Đà Nẵng' or dia_chi='Quảng Trị');

-- task 4
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo 
-- số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select b.id_khach_hang,b.ho_ten,count(*) as SoLanDatPhong
from (hop_dong a join khach_hang b on a.id_khach_hang=b.id_khach_hang) join loai_khach c on c.id_loai_khach=b.id_loai_khach
where c.ten_loai_khach='Diamond'
group by b.ho_ten
order by SoLanDatPhong;

-- task 5
-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phòng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select a.id_khach_hang,a.ho_ten,b.id_hop_dong,b.ngay_lam_hop_dong,b.ngay_ket_thuc,
		(c.chi_phi_thue+d.so_luong*e.gia) as Tong_Tien
from (((khach_hang a left join hop_dong b on a.id_khach_hang=b.id_khach_hang) 
					left join dich_vu c on c.id_dich_vu=b.id_dich_vu)left join hop_dong_chi_tiet d
      on d.id_hop_dong=b.id_hop_dong) left join dich_vu_di_kem e on e.id_dich_vu_di_kem=d.id_dich_vu_di_kem;

-- task 6
-- Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
-- chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,ten_loai_dich_vu
from dich_vu a,loai_dich_vu b
where (id_dich_vu IN(select id_dich_vu
		   from hop_dong
                   where ngay_lam_hop_dong<'2019-01-01') or id_dich_vu NOT IN(select id_dich_vu
								         from hop_dong)) and a.id_loai_dich_vu=b.id_loai_dich_vu ;
                                         
-- task 7
-- Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của 
-- tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được  
-- Khách hàng đặt phòng trong năm 2019

select id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,ten_loai_dich_vu
from dich_vu dv,loai_dich_vu ldv
where (id_dich_vu in(select id_dich_vu
                  from hop_dong 
                  where ngay_lam_hop_dong between '2018-01-01'and '2018-12-31')) and (id_dich_vu not in(select id_dich_vu
                                    from hop_dong
                                    where year(ngay_lam_hop_dong)=2019)) and dv.id_loai_dich_vu=ldv.ID_Loai_Dich_Vu;
                                    
-- task 8
-- Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoTenKhachHang không trùng nhau.

-- c1:
select distinct ho_ten
from khach_hang;

-- c2:

SELECT 
    ho_ten
FROM
    khach_hang
GROUP BY ho_ten
HAVING COUNT(ho_ten) >= 1;

-- c3:
SELECT 
    ho_ten
FROM
    khach_hang
WHERE
    ho_ten IN (SELECT 
            ho_ten
        FROM
            khach_hang
        GROUP BY ho_ten
        HAVING COUNT(ho_ten) = 1) 
UNION SELECT 
    ho_ten
FROM
    khach_hang
WHERE
    ho_ten IN (SELECT 
            ho_ten
        FROM
            khach_hang
        GROUP BY ho_ten
        HAVING COUNT(ho_ten) > 1);
        
-- task 9
-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ 
-- có bao nhiêu khách hàng thực hiện đặt phòng.

drop table if exists Temp;
create temporary table Temp
select 1 as Month
union
select 2 as Month
union
select 3 as Month
union
select 4 as Month
union
select 5 as Month
union
select 6 as Month
union
select 7 as Month
union
select 8 as Month
union
select 9 as Month
union
select 10 as Month
union
select 11 as Month
union
select 12 as Month;
Select Month, count(month(ngay_lam_hop_dong)) as 'Số lần đặt'
From Temp
Left join hop_dong on month(ngay_lam_hop_dong) = Month
and year(ngay_lam_hop_dong) = 2019
group by Month
order by Month;

-- task 10
-- Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select hop_dong.id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as So_luong_dich_vu_di_kem
from hop_dong
join hop_dong_chi_tiet on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
group by hop_dong.id_hop_dong;
-- c2:
select hop_dong.id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as So_luong_dich_vu_di_kem
from hop_dong, hop_dong_chi_tiet
where hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong group by hop_dong.id_hop_dong;

-- task 11
-- Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và 
-- có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select * from dich_vu_di_kem DVDK
where DVDK.id_Dich_Vu_Di_Kem in(
select HDCT.id_Dich_Vu_Di_Kem from hop_dong_chi_tiet HDCT,hop_dong HD,khach_hang KH ,loai_khach LKH
where (LKH.ten_Loai_Khach = 'Diamond'
and (KH.dia_Chi like '%Vinh%' 
or KH.dia_Chi like '%Quảng Ngãi%')));

-- select acs.id_dich_vu_di_kem ,acs.ten_dich_vu_di_kem, acs.gia,
--  acs.don_vi, acs.trang_thai_khach_dung, tc.ten_loai_khach,cm.dia_chi
-- from `furama_resort`.dich_vu_di_kem acs 
-- join `furama_resort`.hop_dong_chi_tiet cd on acs.id_dich_vu_di_kem = cd.id_dich_vu_di_kem
-- join `furama_resort`.hop_dong ct on cd.id_hop_dong = ct.id_hop_dong
-- join `furama_resort`.khach_hang cm on ct.id_khach_hang = cm.id_khach_hang
-- join `furama_resort`.loai_khach tc on cm.id_loai_khach = tc.id_loai_khach
-- where tc.ten_loai_khach = 'Diamond' and cm.dia_chi in ('Vinh','Quảng Ngãi');

-- task 12 
-- Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt 
-- vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

SELECT 
    ct.id_hop_dong, ct.ngay_lam_hop_dong, sv.id_dich_vu, em.ho_ten_nhan_vien, cm.ho_ten, cm.sdt, sv.ten_dich_vu, ct.tien_dat_coc
FROM `furama_resort`.dich_vu_di_kem acs
        INNER JOIN `furama_resort`.hop_dong_chi_tiet cd ON cd.id_dich_vu_di_kem = acs.id_dich_vu_di_kem
        INNER JOIN `furama_resort`.hop_dong ct ON ct.id_hop_dong = cd.id_hop_dong
        INNER JOIN `furama_resort`.khach_hang cm ON cm.id_khach_hang = ct.id_khach_hang
        INNER JOIN `furama_resort`.dich_vu sv ON ct.id_dich_vu = sv.id_dich_vu
        INNER JOIN `furama_resort`.nhan_vien em ON em.id_nhan_vien = ct.id_nhan_vien
WHERE
    EXISTS( SELECT ct.ngay_lam_hop_dong FROM `furama_resort`.hop_dong
        WHERE ct.id_dich_vu = sv.id_dich_vu AND ct.ngay_lam_hop_dong BETWEEN '2019-01-01' AND '2019-12-31')
        AND NOT EXISTS( SELECT ct.ngay_lam_hop_dong
        FROM
            `furama_resort`.hop_dong
        WHERE
            ct.id_dich_vu = sv.id_dich_vu
                AND ct.ngay_lam_hop_dong BETWEEN '2019-01-01' AND '2019-06-30')
GROUP BY cd.id_hop_dong;

-- task 13
-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select * from dich_vu_di_kem
 where id_dich_vu_di_kem in(
     select id_dich_vu_di_kem
     from
   (select id_dich_vu_di_kem,count(id_dich_vu_di_kem) as SL
   from hop_dong_chi_tiet
   group by id_dich_vu_di_kem
   having SL= (select max(so_luong)
			from
                      (select id_dich_vu_di_kem,count(*) as so_luong
                       from hop_dong_chi_tiet
                    group by id_dich_vu_di_kem) as S)) as B);
 
 -- c2:
SELECT 
    dv.id_Dich_Vu_Di_Kem,
    dv.ten_Dich_Vu_Di_Kem,
    dv.gia,
    dv.don_vi,
    COUNT(hd.id_Dich_Vu_Di_Kem) AS So_lan
FROM
    dich_vu_di_kem dv
        JOIN
    hop_dong_chi_tiet hd ON dv.id_Dich_Vu_Di_Kem = hd.id_Dich_Vu_Di_Kem
GROUP BY dv.id_Dich_Vu_Di_Kem
HAVING So_lan = (SELECT 
        COUNT(hd.id_Dich_Vu_Di_Kem) AS So_lan
    FROM
        dich_vu_di_kem dv
            JOIN
        hop_dong_chi_tiet hd ON dv.id_Dich_Vu_Di_Kem = hd.id_Dich_Vu_Di_Kem
    GROUP BY dv.id_Dich_Vu_Di_Kem
    ORDER BY So_lan DESC
    LIMIT 1);

-- task 14
-- Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hd.id_hop_dong, ldv.ten_loai_dich_vu,ten_dich_vu_di_kem
from (((hop_dong hd join dich_vu dv on hd.id_dich_vu=dv.id_dich_vu) join loai_dich_vu ldv on ldv.id_loai_dich_vu=dv.id_loai_dich_vu) 
      join hop_dong_chi_tiet hdct on hdct.id_hop_dong=hd.id_hop_dong)join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem=hdct.id_dich_vu_di_kem
where
   hdct.id_dich_vu_di_kem in(select id_dich_vu_di_kem
                    from hop_dong_chi_tiet
                    group by id_dich_vu_di_kem
                    having count(id_dich_vu_di_kem)=1);

-- task 15
-- Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới 
-- chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019

select nv.id_nhan_vien,ho_ten_nhan_vien,td.trinh_do,bp.ten_bo_phan,nv.sdt as So_Dien_Thoai,Dia_Chi 
from ((nhan_vien nv join bo_phan bp on nv.id_bo_phan=bp.id_bo_phan) 
join hop_dong hd on hd.id_nhan_vien=nv.id_nhan_vien)join trinh_do td on nv.id_trinh_do=td.id_trinh_do
where 
     hd.id_nhan_vien in (select id_nhan_vien
                       from
                       (select id_nhan_vien,count(*) as SLNV
					    from hop_dong
						where
                             year(ngay_lam_hop_dong) between 2018 and 2019
						     group by id_nhan_vien
						      Having SLNV<=3) as B1)
                            group by id_nhan_vien ;
-- c2:                          
SELECT 
    nv.id_nhan_vien,
    nv.ho_ten_nhan_vien,
    td.trinh_do,
    bp.ten_bo_phan,
    nv.sdt,
    nv.dia_chi,
    hd.ngay_lam_hop_dong,
    COUNT(hd.id_nhan_vien) AS `So lan`
FROM
    `nhan_vien` nv
        INNER JOIN
    `bo_phan` bp USING (id_bo_phan)
        INNER JOIN
    `trinh_do` td USING (id_trinh_do)
        INNER JOIN
    `hop_dong` hd USING (id_nhan_vien)
WHERE
    YEAR(hd.ngay_lam_hop_dong) IN ('2018' , '2019')
GROUP BY hd.id_nhan_vien
HAVING `So lan` <= 3;

-- task 16
-- Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

SET SQL_SAFE_UPDATES=0;  
delete from nhan_vien  where id_nhan_vien not in (select id_nhan_vien
                                        from hop_dong 
                                        where year(ngay_lam_hop_dong) between 2017 and 2019 );
 SET SQL_SAFE_UPDATES=1; 

-- task 17
-- Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những 
-- khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

 SET SQL_SAFE_UPDATES=0; 
update khach_hang set id_loai_khach="1"
where id_khach_hang in (
                       select id_khach_hang
                         from hop_dong
                         where Year(ngay_lam_hop_dong)=2019
                         group by id_khach_hang
                          having sum(tong_tien)>10000000);
 SET SQL_SAFE_UPDATES=1; 
 
-- task 18
-- Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).

SET SQL_SAFE_UPDATES=0;  
 delete from khach_hang  where id_khach_hang in (select id_khach_hang
                                             from hop_dong
	                                     where id_khach_hang and year(ngay_lam_hop_dong)<2016);
 SET SQL_SAFE_UPDATES=1;

-- task 19
-- Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

SET SQL_SAFE_UPDATES=0; 
 update dich_vu_di_kem set gia=gia*2
 where
 id_dich_vu_di_kem in
 (select id_dich_vu_di_kem
 from (hop_dong hd join hop_dong_chi_tiet hdct on hd.id_hop_dong=hdct.id_hop_dong)
 where year(hd.ngay_lam_hop_dong)=2019 
 group by id_dich_vu_di_kem
 having count(hdct.id_dich_vu_di_kem)>3);
 SET SQL_SAFE_UPDATES=1;  

-- task 20 
-- Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select  id_nhan_vien ID, ho_ten_nhan_vien, email, sdt, ngay_sinh, dia_chi
from `furama_resort`.nhan_vien as NV
UNION all
select id_khach_hang, ho_ten, email, sdt, ngay_sinh, dia_chi
from `furama_resort`.khach_hang as KH;