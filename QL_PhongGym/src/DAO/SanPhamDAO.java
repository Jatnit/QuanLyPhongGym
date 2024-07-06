/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author ntp01
 */
public class SanPhamDAO {
    public ArrayList<SanPham> getListSanPham() {
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            String sql = "SELECT MaSP, TenSP, Loai, NgayNhap, SoLuong, DonGia, HangSX FROM SanPham";
            Connection con = ConnectCSDL.OpenConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setLoai(rs.getString("Loai"));
                sp.setNgayNhap(rs.getDate("NgayNhap"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setDonGia(rs.getDouble("DonGia"));
                sp.setHangSX(rs.getString("HangSX"));
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public SanPham timTheoID(int MaSP) throws Exception {
        String sql = "SELECT MaSP, TenSP, Loai, NgayNhap, SoLuong, DonGia, HangSX FROM SanPham WHERE MaSP = ?";
        try {
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, MaSP);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    SanPham sp = new SanPham();
                    sp.setMaSP(rs.getInt("MaSP"));
                    sp.setTenSP(rs.getString("TenSP"));
                    sp.setLoai(rs.getString("Loai"));
                    sp.setNgayNhap(rs.getDate("NgayNhap"));
                    sp.setSoLuong(rs.getInt("SoLuong"));
                    sp.setDonGia(rs.getDouble("DonGia"));
                    sp.setHangSX(rs.getString("HangSX"));
                    return sp;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy
    }
    
    public int addSanPham(SanPham sp) {
        try {
            String sql = "INSERT INTO SanPham (TenSP, Loai, NgayNhap, SoLuong, DonGia, HangSX) VALUES (?, ?, ?, ?, ?, ?)";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getLoai());
            ps.setDate(3, new java.sql.Date(sp.getNgayNhap().getTime()));
            ps.setInt(4, sp.getSoLuong());
            ps.setDouble(5, sp.getDonGia());
            ps.setString(6, sp.getHangSX());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int removeSanPham(String MaSP) {
        try {
            String sql = "DELETE FROM SanPham WHERE MaSP = ?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, MaSP);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int updateSanPham(SanPham sp) {
        try {
            String sql = "UPDATE SanPham SET TenSP=?, Loai=?, NgayNhap=?, SoLuong=?, DonGia=?, HangSX=? WHERE MaSP=?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getLoai());
            ps.setDate(3, new java.sql.Date(sp.getNgayNhap().getTime()));
            ps.setInt(4, sp.getSoLuong());
            ps.setDouble(5, sp.getDonGia());
            ps.setString(6, sp.getHangSX());
            ps.setInt(7, sp.getMaSP());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public SanPham searchSanPham(String MaSP) throws Exception {
        String sql = "SELECT MaSP, TenSP, Loai, NgayNhap, SoLuong, DonGia, HangSX FROM SanPham WHERE MaSP = ?";
        try {
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, MaSP);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    SanPham sp = new SanPham();
                    sp.setMaSP(rs.getInt("MaSP"));
                    sp.setTenSP(rs.getString("TenSP"));
                    sp.setLoai(rs.getString("Loai"));
                    sp.setNgayNhap(rs.getDate("NgayNhap"));
                    sp.setSoLuong(rs.getInt("SoLuong"));
                    sp.setDonGia(rs.getDouble("DonGia"));
                    sp.setHangSX(rs.getString("HangSX"));
                    return sp;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
