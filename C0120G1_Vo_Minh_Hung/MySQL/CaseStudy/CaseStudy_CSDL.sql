use furama_resort;
-- task 2
select * from `furama_resort`.nhan_vien
 where (ho_ten_nhan_vien REGEXP "H.*|T.*|K.*")  and length(ho_ten_nhan_vien)<15;

-- task3
select * from khach_hang
where  ((year(now())-year(ngay_sinh)) between 18 and 50) and (dia_chi='Đà Nẵng' or dia_chi='Quảng Trị');

-- task 4
select c.ho_ten,c.id_khach_hang,count(ct.id_khach_hang) as number_of_contract
from `furama_resort`.khach_hang c
join `furama_resort`.hop_dong ct on c.id_khach_hang =ct.id_khach_hang
join `furama_resort`.loai_khach tc on c.id_khach_hang =tc.id_loai_khach
where tc.ten_loai_khach = 'Gold'
group by ct.id_khach_hang
order by number_of_contract;

-- task 5
select a.id_khach_hang,a.ho_ten,b.ID_Hop_Dong,b.Ngay_Lam_Hop_Dong,b.Ngay_Ket_Thuc,
		(c.Chi_Phi_Thue+d.So_Luong*e.Gia) as Tong_Tien
from (((khach_hang a left join hop_dong b on a.ID_Khach_Hang=b.ID_Khach_Hang) 
					left join dich_vu c on c.ID_Dich_vu=b.ID_Dich_vu)left join hop_dong_chi_tiet d
      on d.ID_Hop_Dong=b.ID_Hop_Dong) left join dich_vu_di_kem e on e.ID_Dich_Vu_Di_Kem=d.ID_Dich_Vu_Di_Kem  ;

-- task 6
select ID_Dich_Vu,Ten_Dich_Vu,Dien_Tich,Chi_Phi_Thue,Ten_Loai_Dich_Vu
from dich_vu a,loai_dich_vu b
where (ID_Dich_Vu IN(select ID_Dich_Vu
		   from hop_dong
                   where Ngay_Lam_Hop_Dong<'2019-01-01') or ID_Dich_Vu NOT IN(select ID_Dich_Vu
								         from hop_dong)) and a.ID_Loai_dich_vu=b.ID_loai_dich_vu ;
                                         
-- task 7
select ID_Dich_Vu,Ten_Dich_Vu,Dien_Tich,Chi_Phi_Thue,Ten_Loai_Dich_Vu
from dich_vu dv,loai_dich_vu ldv
where (ID_Dich_Vu in(select ID_Dich_Vu
                  from hop_dong 
                  where Ngay_Lam_Hop_Dong between '2018-01-01'and '2018-12-31')) and (ID_Dich_Vu not in(select ID_Dich_vu
                                    from hop_dong
                                    where year(Ngay_Lam_Hop_Dong)=2019)) and dv.ID_Loai_Dich_Vu=ldv.ID_Loai_Dich_Vu;
                                    
-- task 8
select distinct ho_ten
from khach_hang;

-- task 9

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
select hop_dong.id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as So_luong_dich_vu_di_kem
from hop_dong
join hop_dong_chi_tiet on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
group by hop_dong.id_hop_dong;
-- c2:
select hop_dong.id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as So_luong_dich_vu_di_kem
from hop_dong, hop_dong_chi_tiet
where hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong group by hop_dong.id_hop_dong;

-- task 11
select * from dich_vu_di_kem DVDK
where DVDK.id_Dich_Vu_Di_Kem in(
select HDCT.id_Dich_Vu_Di_Kem from hop_dong_chi_tiet HDCT,hop_dong HD,khach_hang KH ,loai_khach LKH
where (LKH.ten_Loai_Khach = 'Diamond'
and (KH.dia_Chi like '%Vinh%' 
or KH.dia_Chi like '%Quảng Nam%')));
