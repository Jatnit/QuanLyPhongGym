/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.ThietBi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author latu2
 */
public class ThietBiDAO {
    public ArrayList<ThietBi> getListThietBi() {
        ArrayList<ThietBi> list = new ArrayList<>();
        try {
            String sql = "SELECT MaTB,TenTB,SoLuong,Loai,HangSX,TinhTrang FROM ThietBi";
            Connection con = ConnectCSDL.OpenConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                ThietBi tb = new ThietBi();
                tb.setMaTB(rs.getInt("MaTB"));
                tb.setTenTB(rs.getString("TenTB"));
                tb.setSoLuong(rs.getInt("SoLuong"));
                tb.setLoai(rs.getString("Loai"));
                tb.setHangSX(rs.getString("HangSX"));
                tb.setTinhTrang(rs.getString("TinhTrang"));
                list.add(tb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ThietBi timTheoID(int Matb) throws Exception {
        String sql = "SELECT MaTB,TenTB,SoLuong,Loai,HangSX,TinhTrang FROM ThietBi where MaTB = ?";
        try {
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, Matb);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    ThietBi tb = new ThietBi();
                    tb.setTenTB(rs.getString(1));
                    tb.setTenTB(rs.getString(2));
                    tb.setSoLuong(rs.getInt(3));
                    tb.setLoai(rs.getString(4));
                    tb.setHangSX(rs.getString(5));
                    tb.setTinhTrang(rs.getString(6));
                    return tb;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy
    }
    
    public int addThietBi(ThietBi tb) {
        try {
            String sql = "INSERT INTO ThietBi(TenTB,Loai,SoLuong,HangSX,TinhTrang)"
                    + "VALUES(?,?,?,?,?)";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tb.getTenTB());
            ps.setString(2, tb.getLoai());
            ps.setInt(3, tb.getSoLuong());
            ps.setString(4, tb.getHangSX());
            ps.setString(5, tb.getTinhTrang());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int removeThietBi(String Matb) {
        try {
            String sql = "DELETE FROM ThietBi WHERE MaTB = ?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Matb);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int updateThietBi(ThietBi tb) {
        try {
            String sql = "UPDATE ThietBi set TenTB=?,Loai=?,SoLuong=?,HangSX=?,TinhTrang=?"
                    + " WHERE MaTB=?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tb.getTenTB());
            ps.setString(2, tb.getLoai());
            ps.setInt(3, tb.getSoLuong());
            ps.setString(4, tb.getHangSX());
            ps.setString(5, tb.getTinhTrang());
            ps.setInt(6,tb.getMaTB());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public ThietBi searchThietBi(String matb) throws Exception {
        String sql = "SELECT MaTB,TenTB,SoLuong,Loai,HangSX,TinhTrang FROM ThietBi WHERE MaTB = ?";

        try {
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, matb);

            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    ThietBi tb = new ThietBi();
                    tb.setMaTB(rs.getInt("MaTB"));
                    tb.setTenTB(rs.getString("TenTB"));
                    tb.setLoai(rs.getString("Loai"));
                    tb.setSoLuong(rs.getInt("SoLuong"));
                    tb.setHangSX(rs.getString("HangSX"));
                    tb.setTinhTrang(rs.getString("TinhTrang"));
                    return tb;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
