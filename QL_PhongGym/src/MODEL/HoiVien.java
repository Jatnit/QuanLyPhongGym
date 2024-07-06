/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author HP
 */
public class HoiVien {

    private int MaHV;
    private String HoTen;
    private String GioiTinh;
    private String sdt;
    private Date NgayHetHan;
    private String GoiTap;
    private boolean TrangThai;

    public HoiVien() {
    }

    public HoiVien(int MaHV, String HoTen, String GioiTinh, String sdt, Date NgayHetHan, String GoiTap, boolean TrangThai) {
        this.MaHV = MaHV;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.sdt = sdt;
        this.NgayHetHan = NgayHetHan;
        this.GoiTap = GoiTap;
        this.TrangThai = TrangThai;
    }

    public HoiVien(String HoTen, String GioiTinh, String sdt,String GoiTap,Date NgayHetHan) {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.sdt = sdt;
        this.NgayHetHan = NgayHetHan;
        this.GoiTap = GoiTap;
    }

    
//    public HoiVien(String HoTen, String GioiTinh, String sdt, String GoiTap, Date NgayHetHan) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public HoiVien(String MaHV, String HoTen, String GioiTinh, String sdt, String GoiTap, String NgayHetHan) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public int getMaHV() {
        return MaHV;
    }

    public void setMaHV(int MaHV) {
        this.MaHV = MaHV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public String getGoiTap() {
        return GoiTap;
    }

    public void setGoiTap(String GoiTap) {
        this.GoiTap = GoiTap;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
