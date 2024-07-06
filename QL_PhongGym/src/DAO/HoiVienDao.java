/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.HoiVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HoiVienDao {

    public ArrayList<HoiVien> getListHoiVien() {
        ArrayList<HoiVien> list = new ArrayList<>();
        try {
            String sql = "SELECT MaHV,HoTen,GioiTinh,Sdt,GoiTap,NgayHethan FROM HoiVien";
            Connection con = ConnectCSDL.OpenConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                HoiVien tb = new HoiVien();
                tb.setMaHV(rs.getInt("MaHV"));
                tb.setHoTen(rs.getString("HoTen"));
                tb.setGioiTinh(rs.getString("GioiTinh"));
                tb.setSdt(rs.getString("Sdt"));
                tb.setGoiTap(rs.getString("GoiTap"));
                tb.setNgayHetHan(rs.getDate("NgayHethan"));
                list.add(tb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int addHoiVien(HoiVien hv) {
        try {
            String sql = "INSERT INTO HoiVien(HoTen, GioiTinh, Sdt, goiTap, NgayHethan)"
                    + "VALUES(?,?,?,?,?)";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hv.getHoTen());
            ps.setString(2, hv.getGioiTinh());
            ps.setString(3, hv.getSdt());
            ps.setString(4, hv.getGoiTap());
//            ps.setDate(5, (Date) hv.getNgayHetHan());
            ps.setDate(5, new java.sql.Date(hv.getNgayHetHan().getTime()));
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public HoiVien searchHoiVien(String mahv) throws Exception {
        String sql = "SELECT MaHV,HoTen,GioiTinh,Sdt,GoiTap,NgayHethan FROM HoiVien WHERE MaHV = ?";

        try {
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, mahv);

            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    HoiVien hv = new HoiVien();
                    hv.setMaHV(rs.getInt("MaHV"));
                    hv.setHoTen(rs.getString("HoTen"));
                    hv.setGioiTinh(rs.getString("GioiTinh"));
                    hv.setSdt(rs.getString("Sdt"));
                    hv.setGoiTap(rs.getString("GoiTap"));
                    hv.setNgayHetHan(rs.getDate("NgayHethan"));
                    return hv;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

   public int XoaHoiVien(String Mahv) {
        try {
            String sql = "DELETE FROM HoiVien WHERE MaHV= ?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Mahv);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public HoiVien timTheoID(int Mahv) throws Exception {
         String sql = "SELECT MaHV,HoTen,GioiTinh,Sdt,GoiTap,NgayHethan FROM HoiVien WHERE MaHV = ?";
        try {
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, Mahv);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    HoiVien hv = new HoiVien();
                    hv.setMaHV(rs.getInt("MaHV"));
                    hv.setHoTen(rs.getString("HoTen"));
                    hv.setGioiTinh(rs.getString("GioiTinh"));
                    hv.setSdt(rs.getString("Sdt"));
                    hv.setGoiTap(rs.getString("GoiTap"));
                    hv.setNgayHetHan(rs.getDate("NgayHethan"));
                    return hv;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy
    }
}
