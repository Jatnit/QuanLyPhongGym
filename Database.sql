-- Tạo cơ sở dữ liệu PhongGym
CREATE DATABASE PhongGym;
GO

-- Sử dụng cơ sở dữ liệu PhongGym
USE PhongGym;
GO

-- Tạo bảng HoiVien
CREATE TABLE HoiVien (
    MaHV INT IDENTITY(1,1) PRIMARY KEY,
    HoTen NVARCHAR(50),
    GioiTinh NVARCHAR(3),
    Sdt VARCHAR(12),
    NgayHethan DATE,
    GoiTap NVARCHAR(50),
    TrangThai BIT DEFAULT 0
);
GO

-- Tạo bảng SanPham
CREATE TABLE SanPham (
    MaSP INT IDENTITY(1,1) PRIMARY KEY,
    TenSP NVARCHAR(50),
    Loai NVARCHAR(30),
    NgayNhap DATE,
    SoLuong INT,
    DonGia FLOAT,
    HangSX NVARCHAR(50)
);
GO

-- Tạo bảng ThietBi
CREATE TABLE ThietBi (
    MaTB INT IDENTITY(1,1) PRIMARY KEY,
    TenTB NVARCHAR(50),
    Loai NVARCHAR(10),
    SoLuong INT,
    HangSX NVARCHAR(50),
    TinhTrang NVARCHAR(20),
    Soluonghu INT,
    Ghichu NVARCHAR(200)
);
GO

-- Tạo bảng HoaDon
CREATE TABLE HoaDon (
    MaHD INT IDENTITY(1,1) PRIMARY KEY,
    NgayLap DATE,
    TongTien FLOAT
);
GO

-- Tạo bảng CTHoaDon
CREATE TABLE CTHoaDon (
    MaCTHD INT IDENTITY(1,1) PRIMARY KEY,
    MaHD INT,
    MaSP int,
    SoLuong INT,
    CONSTRAINT FK_CTHoaDon_HoaDon FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
	CONSTRAINT FK_CTHoaDon_SanPham FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP)
);
GO

-- Tạo bảng PhieuNhapSP
CREATE TABLE PhieuNhapSP (
    MaPNSP INT IDENTITY(1,1) PRIMARY KEY,
    NgayLap DATE,
    TongTien FLOAT
);
GO

-- Tạo bảng CTPhieuNhapSP
CREATE TABLE CTPhieuNhapSP (
    MaCTPNSP INT IDENTITY(1,1) PRIMARY KEY,
    MaPNSP INT,
    MaSP int,
    SoLuong INT,
    CONSTRAINT FK_CTPhieuNhapSP_PhieuNhapSP FOREIGN KEY (MaPNSP) REFERENCES PhieuNhapSP(MaPNSP),
	CONSTRAINT FK_CTPhieuNhapSP_SanPham FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP)
);
GO


-- Tạo bảng PhieuNhapTB
CREATE TABLE PhieuNhapTB (
    MaPNTB INT IDENTITY(1,1) PRIMARY KEY,
    NgayLap DATE,
    TongTien FLOAT
);
GO

-- Tạo bảng CTPhieuNhapTB
CREATE TABLE CTPhieuNhapTB (
    MaCTPNTB INT IDENTITY(1,1) PRIMARY KEY,
    MaPNTB INT,
    MaTB int,
    SoLuong INT,
    CONSTRAINT FK_CTPhieuNhapTB_PhieuNhapTB FOREIGN KEY (MaPNTB) REFERENCES PhieuNhapTB(MaPNTB),
	CONSTRAINT FK_CTPhieuNhapTB_ThietBi FOREIGN KEY (MaTB) REFERENCES ThietBi(MaTB)
);
GO

insert into HoiVien(HoTen,GioiTinh,Sdt,NgayHethan,GoiTap,TrangThai) values
	(N'Nguyễn Thanh Phong', N'Nam', '0901123521', '2024/07/10', N'Theo tháng', 1),
	(N'Lương Hoàng Tiến', N'Nam', '0902365418', '2024/06/10', N'Theo tháng', 0),
	(N'Nguyễn Mai Ngọc Trân', N'Nữ', '0386123654', '2024/06/25', N'Theo tháng', 1),
	(N'Lâm Anh Tú', N'Nam', '0777521456', '2024/05/10', N'Theo tháng', 0),
	(N'Nguyễn Thanh Bình', N'Nam', '0123654789', '2024/06/13', N'Theo tháng', 0),
	(N'Lương Văn Tình', N'Nam', '0123654852', '2024/07/10', N'Theo tháng', 1),
	(N'Trần Thị Ngọc', N'Nữ', '0741852963', '2024/06/16', N'Theo tháng', 1),
	(N'Vũ Duy Anh', N'Nam', '0111111111', '2024/07/10', N'Theo tháng', 1),
	(N'Lê Tuyết Mai', N'Nữ', '0222222222', '2024/07/15', N'Theo tháng', 1),
	(N'Lại Hoàng Hà', N'Nam', '0333333333', '2024/06/30', N'Theo tháng', 1)
insert into SanPham(TenSP, Loai, NgayNhap, SoLuong, DonGia, HangSX) values
	(N'ISO 93 Sensation (Socola)', N'Whey Protein', '2024-01-12', 50, 1400000, 'ABC'),
	(N'Rule 1 Protein (Dâu)', N'Whey Protein', '2024-01-15', 50, 1500000, 'ABC'),
	(N'Bao tay tập gym', N'Phụ kiện', '2024-2-12', 50, 550000, 'ABC'),
	(N'Serious Mass 12LBS', N'Mass', '2024-3-15', 50, 1500000, 'ABC'),
	(N'Đai lưng', N'Phụ kiện', '2024-2-12', 50, 400000, 'ABC'),
	(N'Bình lắc 840ml', N'Phụ kiện', '2024-2-12', 50, 10000, 'ABC'),
	(N'Sting dâu', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'Sting vàng', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'CocaCola', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'Pepsi', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'247', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'RedBull', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'C2 đào', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'C2 dưa lưới', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'Revive', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'Revive chanh muối', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'Trà xanh 0 độ', N'Nước uống', '2024-6-6', 50, 15000, 'ABC'),
	(N'NutriBoots dâu', N'Nước uống','2024-6-6', 50, 15000, 'ABC'),
	(N'NutriBoots cam', N'Nước uống', '2024-6-6', 50, 10000, 'ABC')
insert into ThietBi(TenTB, Loai,SoLuong, HangSX, TinhTrang) values
	(N'Máy chạy bộ', N'Máy', 4, N'LBH', N'Tốt'),
	(N'Máy đạp xe', N'Máy', 4, N'DHZ', N'Hư'),
	(N'Máy mát-xa eo hông đùi', N'Máy', 2, N'THOL', N'Hư'),
	(N'Giàn tạ tay 40kg', N'Tạ', 1, N'LBL', N'Mới'),
	(N'Cạp tạ tay 5kg', N'Tạ', 2, N'THOL', N'Mới'),
	(N'Cạp tạ tay 2kg', N'Tạ', 4, N'THOL', N'Tốt'),
	(N'Giàn tập đa năng', N'Tạ', 1, N'LBH', N'Mới'),
	(N'Tạ đòn 20kg', N'Tạ', 8, N'THOL', N'Mới')