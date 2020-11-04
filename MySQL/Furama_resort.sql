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
