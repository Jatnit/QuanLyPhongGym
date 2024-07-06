/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.HoiVienDao;
import DAO.SanPhamDAO;
import DAO.ThietBiDAO;
import MODEL.HoiVien;
import MODEL.SanPham;
import MODEL.ThietBi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class frmMain extends javax.swing.JFrame {

    private ArrayList<ThietBi> listThietBi;
    private ArrayList<HoiVien> listHoiVien;
    private ArrayList<SanPham> listSanPham;
    DefaultTableModel model;
    int index = 0;

    public frmMain() {
        initComponents();
        fillDataToTableHoiVien();
    }

    public void fillDataToTableThietBi() {
        ThietBiDAO cddao = new ThietBiDAO();
        listThietBi = cddao.getListThietBi();
        model = (DefaultTableModel) tblThietBi.getModel();
        model.setRowCount(0);
        for (ThietBi tb : listThietBi) {
            Object[] row = new Object[]{tb.getMaTB(), tb.getTenTB(), tb.getLoai(), tb.getSoLuong(), tb.getHangSX(), tb.getTinhTrang()};
            model.addRow(row);
        }
        tblThietBi.setModel(model);
    }
    
    public void fillDataToTableHoiVien() {
        HoiVienDao cddao = new HoiVienDao();
        listHoiVien = cddao.getListHoiVien();
        model = (DefaultTableModel) tblHoiVien.getModel();
        model.setRowCount(0);
        for (HoiVien hv : listHoiVien) {
            Object[] row = new Object[]{hv.getMaHV(), hv.getHoTen(), hv.getGioiTinh(), hv.getSdt(), hv.getGoiTap(), hv.getNgayHetHan()};
            model.addRow(row);
        }
        tblHoiVien.setModel(model);
    }
    
    public void fillDataToTableSanPham() {
        SanPhamDAO spdao = new SanPhamDAO();
        listSanPham = spdao.getListSanPham();
        model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        for (SanPham sp : listSanPham) {
            Object[] row = new Object[]{
                sp.getMaSP(),
                sp.getTenSP(),
                sp.getLoai(),
                sp.getNgayNhap(),
                sp.getSoLuong(),
                sp.getDonGia(),
                sp.getHangSX()
            };
            model.addRow(row);
        }
        tblSanPham.setModel(model);
    }

    public static Date parseDate(String dateString, String format) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.parse(dateString);
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlSideBar = new javax.swing.JPanel();
        pnlSanPham = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlHoiVien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlThietBi = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlThongTin = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pnlThanhToan = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabHoiVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoiVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMaHV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgayHetHan = new javax.swing.JFormattedTextField();
        btnLuuHV = new javax.swing.JButton();
        txtGoiTap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTimKiemHoiVien = new javax.swing.JTextField();
        btnTimKiemHV = new javax.swing.JButton();
        btnThemHV = new javax.swing.JButton();
        btnXoaHV = new javax.swing.JButton();
        btnSuaHV = new javax.swing.JButton();
        btnClearHV = new javax.swing.JButton();
        tabSanPham = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtLoaiSP = new javax.swing.JTextField();
        txtSoLuongSP = new javax.swing.JTextField();
        txtDonGiaSP = new javax.swing.JTextField();
        txtHangSXSP = new javax.swing.JTextField();
        txtNgayNhapSP = new javax.swing.JFormattedTextField();
        txtTimKiemSP = new javax.swing.JTextField();
        btnTimKiemSP = new javax.swing.JButton();
        btnThemSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnClearSP = new javax.swing.JButton();
        tabThanhToan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHoiVien_ChuaTT = new javax.swing.JTable();
        btnTaoHoaDon = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnXoaSP_GH = new javax.swing.JButton();
        lblMaHD = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        rdoTraThe = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        rdoTienMat = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pnlBangSP = new javax.swing.JPanel();
        tabThongTin = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        tabThietBi = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtTinhTrangTB = new javax.swing.JTextField();
        txtTenTB = new javax.swing.JTextField();
        txtSoLuongTB = new javax.swing.JTextField();
        txtHangSXTB = new javax.swing.JTextField();
        txtLoaiTB = new javax.swing.JTextField();
        txtTimKiemThietBi = new javax.swing.JTextField();
        btnTimKiemTB = new javax.swing.JButton();
        btnThemTB = new javax.swing.JButton();
        btnXoaTB = new javax.swing.JButton();
        btnSuaTB = new javax.swing.JButton();
        btnClearTB = new javax.swing.JButton();
        lbMaTB = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThietBi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 106, 226));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/excercise.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gym Fitness Center");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("30A Cộng Hoà, quận Tân Bình - (+84)120 457 6881");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1))
        );

        pnlSideBar.setBackground(new java.awt.Color(192, 186, 223));

        pnlSanPham.setBackground(new java.awt.Color(135, 113, 230));
        pnlSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSanPhamMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sản phẩm");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/towel.png"))); // NOI18N

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHoiVien.setBackground(new java.awt.Color(135, 113, 230));
        pnlHoiVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHoiVienMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hội viên");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/strength.png"))); // NOI18N

        javax.swing.GroupLayout pnlHoiVienLayout = new javax.swing.GroupLayout(pnlHoiVien);
        pnlHoiVien.setLayout(pnlHoiVienLayout);
        pnlHoiVienLayout.setHorizontalGroup(
            pnlHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoiVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHoiVienLayout.setVerticalGroup(
            pnlHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoiVienLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnlThietBi.setBackground(new java.awt.Color(135, 113, 230));
        pnlThietBi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThietBiMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thiết bị");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dumbbell.png"))); // NOI18N

        javax.swing.GroupLayout pnlThietBiLayout = new javax.swing.GroupLayout(pnlThietBi);
        pnlThietBi.setLayout(pnlThietBiLayout);
        pnlThietBiLayout.setHorizontalGroup(
            pnlThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThietBiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(6, 6, 6))
        );
        pnlThietBiLayout.setVerticalGroup(
            pnlThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThietBiLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThongTin.setBackground(new java.awt.Color(135, 113, 230));
        pnlThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThongTinMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thông tin");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/letter-i.png"))); // NOI18N

        javax.swing.GroupLayout pnlThongTinLayout = new javax.swing.GroupLayout(pnlThongTin);
        pnlThongTin.setLayout(pnlThongTinLayout);
        pnlThongTinLayout.setHorizontalGroup(
            pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlThongTinLayout.setVerticalGroup(
            pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThongKe.setBackground(new java.awt.Color(135, 113, 230));
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Thông kê");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profits.png"))); // NOI18N

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThanhToan.setBackground(new java.awt.Color(135, 113, 230));
        pnlThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThanhToanMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Thanh toán");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wallet.png"))); // NOI18N

        javax.swing.GroupLayout pnlThanhToanLayout = new javax.swing.GroupLayout(pnlThanhToan);
        pnlThanhToan.setLayout(pnlThanhToanLayout);
        pnlThanhToanLayout.setHorizontalGroup(
            pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlThanhToanLayout.setVerticalGroup(
            pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThanhToanLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSideBarLayout = new javax.swing.GroupLayout(pnlSideBar);
        pnlSideBar.setLayout(pnlSideBarLayout);
        pnlSideBarLayout.setHorizontalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHoiVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThietBi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThongTin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSideBarLayout.setVerticalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHoiVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabHoiVien.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblHoiVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MaHV", "Họ tên", "Giới tính", "Số điện thoại", "Gói tập", "Ngày hết hạn"
            }
        ));
        tblHoiVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoiVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoiVien);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Mã hội viên:");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Họ và tên:");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Giới tính:");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Số điện thoại:");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Gói tập:");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Ngày hết hạn:");

        txtMaHV.setEditable(false);

        txtNgayHetHan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        btnLuuHV.setBackground(new java.awt.Color(129, 106, 226));
        btnLuuHV.setForeground(new java.awt.Color(0, 0, 0));
        btnLuuHV.setText("Lưu");
        btnLuuHV.setBorder(null);
        btnLuuHV.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayHetHan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHV)
                            .addComponent(txtHoTen)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtSDT)
                            .addComponent(txtGoiTap)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLuuHV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtGoiTap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnLuuHV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setBackground(new java.awt.Color(102, 0, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(129, 106, 226));
        jLabel12.setText("Danh sách hội viên");

        txtTimKiemHoiVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnTimKiemHV.setBackground(new java.awt.Color(129, 106, 226));
        btnTimKiemHV.setForeground(new java.awt.Color(0, 0, 0));
        btnTimKiemHV.setText("Tìm kiếm");
        btnTimKiemHV.setBorder(null);
        btnTimKiemHV.setBorderPainted(false);
        btnTimKiemHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemHVActionPerformed(evt);
            }
        });

        btnThemHV.setBackground(new java.awt.Color(145, 129, 242));
        btnThemHV.setForeground(new java.awt.Color(0, 0, 0));
        btnThemHV.setText("Thêm");
        btnThemHV.setBorder(null);
        btnThemHV.setBorderPainted(false);
        btnThemHV.setPreferredSize(new java.awt.Dimension(75, 25));
        btnThemHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHVActionPerformed(evt);
            }
        });

        btnXoaHV.setBackground(new java.awt.Color(145, 129, 242));
        btnXoaHV.setForeground(new java.awt.Color(0, 0, 0));
        btnXoaHV.setText("Xoá");
        btnXoaHV.setBorder(null);
        btnXoaHV.setBorderPainted(false);
        btnXoaHV.setPreferredSize(new java.awt.Dimension(75, 25));
        btnXoaHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHVActionPerformed(evt);
            }
        });

        btnSuaHV.setBackground(new java.awt.Color(145, 129, 242));
        btnSuaHV.setForeground(new java.awt.Color(0, 0, 0));
        btnSuaHV.setText("Sửa");
        btnSuaHV.setBorder(null);
        btnSuaHV.setBorderPainted(false);
        btnSuaHV.setPreferredSize(new java.awt.Dimension(75, 25));

        btnClearHV.setBackground(new java.awt.Color(145, 129, 242));
        btnClearHV.setForeground(new java.awt.Color(0, 0, 0));
        btnClearHV.setText("Clear");
        btnClearHV.setBorder(null);
        btnClearHV.setBorderPainted(false);
        btnClearHV.setPreferredSize(new java.awt.Dimension(75, 25));
        btnClearHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearHVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabHoiVienLayout = new javax.swing.GroupLayout(tabHoiVien);
        tabHoiVien.setLayout(tabHoiVienLayout);
        tabHoiVienLayout.setHorizontalGroup(
            tabHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHoiVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(tabHoiVienLayout.createSequentialGroup()
                        .addComponent(btnThemHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSuaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabHoiVienLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabHoiVienLayout.createSequentialGroup()
                        .addComponent(txtTimKiemHoiVien, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiemHV, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tabHoiVienLayout.setVerticalGroup(
            tabHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHoiVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabHoiVienLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiemHoiVien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiemHV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabHoiVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", tabHoiVien);

        tabSanPham.setBackground(new java.awt.Color(255, 255, 255));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Loại", "Ngày nhập", "Số lượng", "Đơn giá", "Hãng"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Mã sản phẩm");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Tên sản phẩm");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Loại");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Ngày nhập");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Số lượng");

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Đơn giá");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Hãng SX");

        txtMaSP.setEditable(false);

        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        txtNgayNhapSP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        btnTimKiemSP.setBackground(new java.awt.Color(129, 106, 226));
        btnTimKiemSP.setForeground(new java.awt.Color(0, 0, 0));
        btnTimKiemSP.setText("Tìm kiếm");
        btnTimKiemSP.setBorder(null);
        btnTimKiemSP.setBorderPainted(false);
        btnTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSPActionPerformed(evt);
            }
        });

        btnThemSP.setBackground(new java.awt.Color(145, 129, 242));
        btnThemSP.setForeground(new java.awt.Color(0, 0, 0));
        btnThemSP.setText("Thêm");
        btnThemSP.setBorder(null);
        btnThemSP.setBorderPainted(false);
        btnThemSP.setPreferredSize(new java.awt.Dimension(75, 25));
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnXoaSP.setBackground(new java.awt.Color(145, 129, 242));
        btnXoaSP.setForeground(new java.awt.Color(0, 0, 0));
        btnXoaSP.setText("Xoá");
        btnXoaSP.setBorder(null);
        btnXoaSP.setBorderPainted(false);
        btnXoaSP.setPreferredSize(new java.awt.Dimension(75, 25));
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        btnSuaSP.setBackground(new java.awt.Color(145, 129, 242));
        btnSuaSP.setForeground(new java.awt.Color(0, 0, 0));
        btnSuaSP.setText("Sửa");
        btnSuaSP.setBorder(null);
        btnSuaSP.setBorderPainted(false);
        btnSuaSP.setPreferredSize(new java.awt.Dimension(75, 25));
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnClearSP.setBackground(new java.awt.Color(145, 129, 242));
        btnClearSP.setForeground(new java.awt.Color(0, 0, 0));
        btnClearSP.setText("Clear");
        btnClearSP.setBorder(null);
        btnClearSP.setBorderPainted(false);
        btnClearSP.setPreferredSize(new java.awt.Dimension(75, 25));
        btnClearSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSP)
                    .addComponent(txtTenSP)
                    .addComponent(txtLoaiSP)
                    .addComponent(txtHangSXSP, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayNhapSP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuongSP)
                            .addComponent(txtDonGiaSP))))
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiemSP, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtTimKiemSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtNgayNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(txtSoLuongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtDonGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtHangSXSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout tabSanPhamLayout = new javax.swing.GroupLayout(tabSanPham);
        tabSanPham.setLayout(tabSanPhamLayout);
        tabSanPhamLayout.setHorizontalGroup(
            tabSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabSanPhamLayout.setVerticalGroup(
            tabSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", tabSanPham);

        tabThanhToan.setBackground(new java.awt.Color(255, 255, 255));

        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Đơn giá", "Số lượng"
            }
        ));
        jScrollPane4.setViewportView(tblCTHD);

        tblHoiVien_ChuaTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã HV", "Họ tên", "Ngày hết hạn"
            }
        ));
        jScrollPane5.setViewportView(tblHoiVien_ChuaTT);

        btnTaoHoaDon.setBackground(new java.awt.Color(129, 106, 226));
        btnTaoHoaDon.setForeground(new java.awt.Color(0, 0, 0));
        btnTaoHoaDon.setText("Tạo hoá đơn");
        btnTaoHoaDon.setBorder(null);
        btnTaoHoaDon.setBorderPainted(false);

        btnThanhToan.setBackground(new java.awt.Color(129, 106, 226));
        btnThanhToan.setForeground(new java.awt.Color(0, 0, 0));
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setBorder(null);
        btnThanhToan.setBorderPainted(false);

        btnXoaSP_GH.setBackground(new java.awt.Color(129, 106, 226));
        btnXoaSP_GH.setForeground(new java.awt.Color(0, 0, 0));
        btnXoaSP_GH.setText("Xoá sản phẩm");
        btnXoaSP_GH.setBorder(null);
        btnXoaSP_GH.setBorderPainted(false);

        lblMaHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaHD.setForeground(new java.awt.Color(0, 0, 255));
        lblMaHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaHD.setText("1001");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Mã HD:");

        buttonGroup1.add(rdoTraThe);
        rdoTraThe.setForeground(new java.awt.Color(0, 0, 0));
        rdoTraThe.setText("Tra thẻ");

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Phương thức thanh toán");

        buttonGroup1.add(rdoTienMat);
        rdoTienMat.setForeground(new java.awt.Color(0, 0, 0));
        rdoTienMat.setText("Tiền mặt");

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Tổng thành tiền");

        lblTongTien.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(153, 0, 0));
        lblTongTien.setText("100.000");

        pnlBangSP.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBangSPLayout = new javax.swing.GroupLayout(pnlBangSP);
        pnlBangSP.setLayout(pnlBangSPLayout);
        pnlBangSPLayout.setHorizontalGroup(
            pnlBangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        pnlBangSPLayout.setVerticalGroup(
            pnlBangSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(pnlBangSP);

        javax.swing.GroupLayout tabThanhToanLayout = new javax.swing.GroupLayout(tabThanhToan);
        tabThanhToan.setLayout(tabThanhToanLayout);
        tabThanhToanLayout.setHorizontalGroup(
            tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabThanhToanLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6))
                    .addGroup(tabThanhToanLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabThanhToanLayout.createSequentialGroup()
                                .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaSP_GH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabThanhToanLayout.createSequentialGroup()
                                .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabThanhToanLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoTraThe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoTienMat))
                                    .addGroup(tabThanhToanLayout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTongTien)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        tabThanhToanLayout.setVerticalGroup(
            tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabThanhToanLayout.createSequentialGroup()
                        .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37)
                                .addComponent(lblMaHD))
                            .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoaSP_GH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(rdoTraThe)
                            .addComponent(rdoTienMat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(lblTongTien)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab5", tabThanhToan);

        tabThongTin.setBackground(new java.awt.Color(192, 186, 223));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(129, 106, 226));
        jLabel41.setText("ĐỒ ÁN CUỐI KỲ");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Môn: Thực hành phân tích thiết kế hệ thống thông tin");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Đề tài: QUẢN LÝ PHÒNG GYM");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("GVBM: Nguyễn Thị Thu Tâm");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Sinh viên thực hiện:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Lâm Anh Tú - 2001216271");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Lương Hoàng Tiến - 2001216210");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Nguyễn Thanh Phong - 2001207370");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Nguyễn Mai Ngọc Trân - 2001216230");

        javax.swing.GroupLayout tabThongTinLayout = new javax.swing.GroupLayout(tabThongTin);
        tabThongTin.setLayout(tabThongTinLayout);
        tabThongTinLayout.setHorizontalGroup(
            tabThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThongTinLayout.createSequentialGroup()
                .addGroup(tabThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabThongTinLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(tabThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addGroup(tabThongTinLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(tabThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49)))))
                    .addGroup(tabThongTinLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel41)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        tabThongTinLayout.setVerticalGroup(
            tabThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThongTinLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addGap(12, 12, 12)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", tabThongTin);

        tabThietBi.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Mã thiết bị");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Tên thiết bị");

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Loại:");

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Hãng SX:");

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Số lượng");

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Tình trạng");

        btnTimKiemTB.setBackground(new java.awt.Color(129, 106, 226));
        btnTimKiemTB.setForeground(new java.awt.Color(0, 0, 0));
        btnTimKiemTB.setText("Tìm kiếm");
        btnTimKiemTB.setBorder(null);
        btnTimKiemTB.setBorderPainted(false);
        btnTimKiemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemTBActionPerformed(evt);
            }
        });

        btnThemTB.setBackground(new java.awt.Color(145, 129, 242));
        btnThemTB.setForeground(new java.awt.Color(0, 0, 0));
        btnThemTB.setText("Thêm");
        btnThemTB.setBorder(null);
        btnThemTB.setBorderPainted(false);
        btnThemTB.setPreferredSize(new java.awt.Dimension(75, 25));
        btnThemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTBActionPerformed(evt);
            }
        });

        btnXoaTB.setBackground(new java.awt.Color(145, 129, 242));
        btnXoaTB.setForeground(new java.awt.Color(0, 0, 0));
        btnXoaTB.setText("Xoá");
        btnXoaTB.setBorder(null);
        btnXoaTB.setBorderPainted(false);
        btnXoaTB.setPreferredSize(new java.awt.Dimension(75, 25));
        btnXoaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTBActionPerformed(evt);
            }
        });

        btnSuaTB.setBackground(new java.awt.Color(145, 129, 242));
        btnSuaTB.setForeground(new java.awt.Color(0, 0, 0));
        btnSuaTB.setText("Sửa");
        btnSuaTB.setBorder(null);
        btnSuaTB.setBorderPainted(false);
        btnSuaTB.setPreferredSize(new java.awt.Dimension(75, 25));
        btnSuaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTBActionPerformed(evt);
            }
        });

        btnClearTB.setBackground(new java.awt.Color(145, 129, 242));
        btnClearTB.setForeground(new java.awt.Color(0, 0, 0));
        btnClearTB.setText("Clear");
        btnClearTB.setBorder(null);
        btnClearTB.setBorderPainted(false);
        btnClearTB.setPreferredSize(new java.awt.Dimension(75, 25));
        btnClearTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTBActionPerformed(evt);
            }
        });

        lbMaTB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMaTB.setForeground(new java.awt.Color(0, 0, 0));
        lbMaTB.setText("Mã thiết bị");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel35))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTinhTrangTB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenTB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHangSXTB)
                                    .addComponent(txtLoaiTB)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuongTB, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTimKiemThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(txtSoLuongTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(lbMaTB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtHangSXTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTinhTrangTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MaTB", "Tên thiết bị", "Số lượng", "Loại", "Hãng SX", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThietBi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThietBiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblThietBi);

        javax.swing.GroupLayout tabThietBiLayout = new javax.swing.GroupLayout(tabThietBi);
        tabThietBi.setLayout(tabThietBiLayout);
        tabThietBiLayout.setHorizontalGroup(
            tabThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThietBiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 698, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabThietBiLayout.setVerticalGroup(
            tabThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThietBiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", tabThietBi);

        jPanel7.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -36, 710, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void pnlSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSanPhamMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        fillDataToTableSanPham();
    }//GEN-LAST:event_pnlSanPhamMouseClicked

    private void pnlHoiVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoiVienMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        fillDataToTableHoiVien();
    }//GEN-LAST:event_pnlHoiVienMouseClicked

    private void pnlThietBiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThietBiMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
        fillDataToTableThietBi();
    }//GEN-LAST:event_pnlThietBiMouseClicked

    private void pnlThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Chưa thực hiện!");
    }//GEN-LAST:event_pnlThongKeMouseClicked

    private void pnlThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongTinMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_pnlThongTinMouseClicked

    private void pnlThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThanhToanMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_pnlThanhToanMouseClicked

    private void btnTimKiemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemTBActionPerformed
        String matb = txtTimKiemThietBi.getText();
        try {
            ThietBiDAO nccdao = new ThietBiDAO();
            ThietBi tb = nccdao.searchThietBi(matb);
            DefaultTableModel model = (DefaultTableModel) tblThietBi.getModel();
            model.setRowCount(0);
            if (tb != null) {
                Object[] row = new Object[]{tb.getMaTB(), tb.getTenTB(), tb.getLoai(), tb.getSoLuong(), tb.getHangSX(), tb.getTinhTrang()};
                model.addRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thiết bị với mã thiết bị : " + matb, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi tìm kiếm nhà cung cấp", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemTBActionPerformed

    private void btnThemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTBActionPerformed
        ThietBiDAO cddao = new ThietBiDAO();
        ThietBi sp = new ThietBi();

        if (txtTenTB.getText() != null && !txtTenTB.getText().trim().isEmpty()) {
            sp.setTenTB(txtTenTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Tên thiết bị!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtLoaiTB.getText() != null && !txtLoaiTB.getText().trim().isEmpty()) {
            sp.setLoai(txtLoaiTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Loại thiết bị!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int soluong = Integer.parseInt(txtSoLuongTB.getText());
            if (soluong >= 0) {
                sp.setSoLuong(soluong);
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng Sản phẩm không thể âm !", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtHangSXTB.getText() != null && !txtHangSXTB.getText().trim().isEmpty()) {
            sp.setHangSX(txtHangSXTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống hãng sản xuất !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtTinhTrangTB.getText() != null && !txtTinhTrangTB.getText().trim().isEmpty()) {
            sp.setTinhTrang(txtTinhTrangTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống tình trạng !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int x = cddao.addThietBi(sp);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            fillDataToTableThietBi();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemTBActionPerformed

    private void btnXoaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTBActionPerformed
        try {
            ThietBiDAO cddao = new ThietBiDAO();

            int selectedRow = tblThietBi.getSelectedRow();
            int columnIndex = 0;
            String cellValue = null;
            if (selectedRow != -1) {
                Object value = tblThietBi.getValueAt(selectedRow, columnIndex);
                cellValue = value.toString();
            }

            if (cellValue != null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá Thiết bị này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    int x = cddao.removeThietBi(cellValue);
                    if (x > 0) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công!");
                        fillDataToTableThietBi();
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn một thiết bị để xóa!");
                }
            }
            lbMaTB.setText("");
            txtTenTB.setText("");
            txtLoaiTB.setText("");
            txtHangSXTB.setText("");
            txtSoLuongTB.setText("");
            txtTinhTrangTB.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaTBActionPerformed

    private void btnSuaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTBActionPerformed
        ThietBiDAO cddao = new ThietBiDAO();
        ThietBi sp = new ThietBi();

        try {
            sp.setMaTB(Integer.parseInt(lbMaTB.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã thiết bị hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (txtTenTB.getText() != null && !txtTenTB.getText().trim().isEmpty()) {
            sp.setTenTB(txtTenTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Tên thiết bị!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtLoaiTB.getText() != null && !txtLoaiTB.getText().trim().isEmpty()) {
            sp.setLoai(txtLoaiTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Loại thiết bị!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int soluong = Integer.parseInt(txtSoLuongTB.getText());
            if (soluong >= 0) {
                sp.setSoLuong(soluong);
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng Sản phẩm không thể âm !", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtHangSXTB.getText() != null && !txtHangSXTB.getText().trim().isEmpty()) {
            sp.setHangSX(txtHangSXTB.getText());    
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống hãng sản xuất !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtTinhTrangTB.getText() != null && !txtTinhTrangTB.getText().trim().isEmpty()) {
            sp.setTinhTrang(txtTinhTrangTB.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống tình trạng !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int x = cddao.updateThietBi(sp);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
            fillDataToTableThietBi();
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaTBActionPerformed

    private void btnClearTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTBActionPerformed
        lbMaTB.setText("");
        txtTenTB.setText("");
        txtLoaiTB.setText("");
        txtHangSXTB.setText("");
        txtSoLuongTB.setText("");
        txtTinhTrangTB.setText("");
    }//GEN-LAST:event_btnClearTBActionPerformed

    private void tblThietBiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThietBiMouseClicked
        try {
            int dong = tblThietBi.getSelectedRow();
            if (dong >= 0) {
                Object idObj = tblThietBi.getValueAt(dong, 0); // Lấy giá trị từ cột ID
                String idString = idObj.toString(); // Chuyển đổi thành chuỗi
                int id = Integer.parseInt(idString); // Chuyển đổi chuỗi thành số nguyên
                lbMaTB.setText(idString); // Hiển thị giá trị của ID dưới dạng chữ
                ThietBiDAO dao = new ThietBiDAO();
                ThietBi tb = dao.timTheoID(id);
                if (tb != null) {
                    txtTenTB.setText(tb.getTenTB());
                    txtLoaiTB.setText(tb.getLoai());
                    txtHangSXTB.setText(tb.getHangSX());
                    txtSoLuongTB.setText(String.valueOf(tb.getSoLuong()));
                    txtTinhTrangTB.setText(tb.getTinhTrang());
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy Thiết bị với ID: " + id, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn một dòng nào trong bảng", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Xử lý ngoại lệ NumberFormatException nếu không thể chuyển đổi chuỗi thành số nguyên
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblThietBiMouseClicked

    private void btnThemHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHVActionPerformed
        HoiVienDao cddao = new HoiVienDao();
        HoiVien hv = new HoiVien();

        if (txtHoTen.getText() != null && !txtHoTen.getText().trim().isEmpty()) {
            hv.setHoTen(txtHoTen.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống tên hội viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtGioiTinh.getText() != null && !txtGioiTinh.getText().trim().isEmpty()) {
            hv.setGioiTinh(txtGioiTinh.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtSDT.getText() != null && !txtSDT.getText().trim().isEmpty()) {
            hv.setSdt(txtSDT.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống số điện thoại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtGoiTap.getText() != null && !txtGoiTap.getText().trim().isEmpty()) {
            hv.setGoiTap(txtGoiTap.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống gói tập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
//            Date ngayHetHan = parseDate(txtNgayHetHan.getText(), "dd/MM/yyyy");
//            hv.setNgayHetHan(ngayHetHan);
            hv.setNgayHetHan(new SimpleDateFormat("dd/MM/yyyy").parse(txtNgayHetHan.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;

        }

        int x = cddao.addHoiVien(hv);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            fillDataToTableHoiVien();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemHVActionPerformed

    private void btnXoaHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHVActionPerformed
        try {
            HoiVienDao cddao = new HoiVienDao();

            int selectedRow = tblHoiVien.getSelectedRow();
            int columnIndex = 0;
            String cellValue = null;
            if (selectedRow != -1) {
                Object value = tblHoiVien.getValueAt(selectedRow, columnIndex);
                cellValue = value.toString();
            }

            if (cellValue != null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá hội viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    int x = cddao.XoaHoiVien(cellValue);
                    if (x > 0) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công!");
                        fillDataToTableHoiVien();
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn một hội viên để xóa!");
                }
            }
            txtMaHV.setText("");
            txtHoTen.setText("");
            txtGioiTinh.setText("");
            txtSDT.setText("");
            txtGoiTap.setText("");
            txtNgayHetHan.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaHVActionPerformed

    private void btnClearHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearHVActionPerformed
        txtMaHV.setText("");
        txtHoTen.setText("");
        txtGioiTinh.setText("");
        txtSDT.setText("");
        txtGoiTap.setText("");
        txtNgayHetHan.setText("");
    }//GEN-LAST:event_btnClearHVActionPerformed

    private void btnTimKiemHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemHVActionPerformed
        String mahv = txtTimKiemHoiVien.getText();
        try {
            HoiVienDao hvcdao = new HoiVienDao();
            HoiVien hv = hvcdao.searchHoiVien(mahv);
            DefaultTableModel model = (DefaultTableModel) tblHoiVien.getModel();
            model.setRowCount(0);
            if (hv != null) {
                Object[] row = new Object[]{hv.getMaHV(), hv.getHoTen(), hv.getGioiTinh(), hv.getSdt(), hv.getGoiTap(), hv.getNgayHetHan()};
                model.addRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy hội viên và tên hội viên : " + mahv, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi tìm kiếm hội viên", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemHVActionPerformed

    private void tblHoiVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoiVienMouseClicked
        try {
            int dong = tblHoiVien.getSelectedRow();
            if (dong >= 0) {
                Object idObj = tblHoiVien.getValueAt(dong, 0); // Lấy giá trị từ cột ID
                String idString = idObj.toString(); // Chuyển đổi thành chuỗi
                int id = Integer.parseInt(idString); // Chuyển đổi chuỗi thành số nguyên
                txtMaHV.setText(idString); // Hiển thị giá trị của ID dưới dạng chữ
                HoiVienDao dao = new HoiVienDao();
                HoiVien hv = dao.timTheoID(id);
                if (hv != null) {
                    txtHoTen.setText(hv.getHoTen());
                    txtGioiTinh.setText(hv.getGioiTinh());
                    txtSDT.setText(hv.getSdt());
                    txtGoiTap.setText(hv.getGoiTap());
                    txtNgayHetHan.setText(hv.getNgayHetHan().toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy hội viên với ID: " + id, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn một dòng nào trong bảng", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Xử lý ngoại lệ NumberFormatException nếu không thể chuyển đổi chuỗi thành số nguyên
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblHoiVienMouseClicked

    private void btnTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSPActionPerformed
        String masp = txtTimKiemSP.getText();
        try {
            SanPhamDAO spdao = new SanPhamDAO();
            SanPham sp = spdao.searchSanPham(masp);
            DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
            model.setRowCount(0);
            if (sp != null) {
                Object[] row = new Object[]{
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getLoai(),
                    sp.getNgayNhap(),
                    sp.getSoLuong(),
                    sp.getDonGia(),
                    sp.getHangSX()
                };
                model.addRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm với mã sản phẩm: " + masp, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi tìm kiếm sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemSPActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        SanPhamDAO spdao = new SanPhamDAO();
        SanPham sp = new SanPham();

        if (txtTenSP.getText() != null && !txtTenSP.getText().trim().isEmpty()) {
            sp.setTenSP(txtTenSP.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Tên sản phẩm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtLoaiSP.getText() != null && !txtLoaiSP.getText().trim().isEmpty()) {
            sp.setLoai(txtLoaiSP.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Loại sản phẩm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int soluong = Integer.parseInt(txtSoLuongSP.getText());
            if (soluong >= 0) {
                sp.setSoLuong(soluong);
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng Sản phẩm không thể âm !", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtHangSXSP.getText() != null && !txtHangSXSP.getText().trim().isEmpty()) {
            sp.setHangSX(txtHangSXSP.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống hãng sản xuất !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDonGiaSP.getText() != null && !txtDonGiaSP.getText().trim().isEmpty()) {
            try {
                double dongia = Double.parseDouble(txtDonGiaSP.getText());
                sp.setDonGia(dongia);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn giá hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống đơn giá !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtNgayNhapSP.getText() != null && !txtNgayNhapSP.getText().trim().isEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date ngayNhap = dateFormat.parse(txtNgayNhapSP.getText());
                sp.setNgayNhap(ngayNhap);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày nhập hợp lệ (dd/MM/yyyy)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống ngày nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int x = spdao.addSanPham(sp);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            fillDataToTableSanPham();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        try {
            SanPhamDAO spdao = new SanPhamDAO();

            int selectedRow = tblSanPham.getSelectedRow();
            int columnIndex = 0;
            String cellValue = null;
            if (selectedRow != -1) {
                Object value = tblSanPham.getValueAt(selectedRow, columnIndex);
                cellValue = value.toString();
            }

            if (cellValue != null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    int x = spdao.removeSanPham(cellValue);
                    if (x > 0) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công!");
                        fillDataToTableSanPham();
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn một sản phẩm để xóa!");
                }
            }
            txtMaSP.setText("");
            txtTenSP.setText("");
            txtLoaiSP.setText("");
            txtHangSXSP.setText("");
            txtSoLuongSP.setText("");
            txtDonGiaSP.setText("");
            txtNgayNhapSP.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        SanPhamDAO spdao = new SanPhamDAO();
        SanPham sp = new SanPham();

        try {
            sp.setMaSP(Integer.parseInt(txtMaSP.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtTenSP.getText() != null && !txtTenSP.getText().trim().isEmpty()) {
            sp.setTenSP(txtTenSP.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Tên sản phẩm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtLoaiSP.getText() != null && !txtLoaiSP.getText().trim().isEmpty()) {
            sp.setLoai(txtLoaiSP.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Loại sản phẩm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int soluong = Integer.parseInt(txtSoLuongSP.getText());
            if (soluong >= 0) {
                sp.setSoLuong(soluong);
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm không thể âm !", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtHangSXSP.getText() != null && !txtHangSXSP.getText().trim().isEmpty()) {
            sp.setHangSX(txtHangSXSP.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống hãng sản xuất !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDonGiaSP.getText() != null && !txtDonGiaSP.getText().trim().isEmpty()) {
            try {
                double dongia = Double.parseDouble(txtDonGiaSP.getText());
                sp.setDonGia(dongia);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn giá hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống đơn giá !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtNgayNhapSP.getText() != null && !txtNgayNhapSP.getText().trim().isEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date ngayNhap = dateFormat.parse(txtNgayNhapSP.getText());
                sp.setNgayNhap(ngayNhap);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày nhập hợp lệ (dd/MM/yyyy)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống ngày nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int x = spdao.updateSanPham(sp);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
            fillDataToTableSanPham();
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnClearSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSPActionPerformed
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtLoaiSP.setText("");
        txtHangSXSP.setText("");
        txtSoLuongSP.setText("");
        txtDonGiaSP.setText("");
        txtNgayNhapSP.setText("");
    }//GEN-LAST:event_btnClearSPActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        try {
            int dong = tblSanPham.getSelectedRow();
            if (dong >= 0) {
                Object idObj = tblSanPham.getValueAt(dong, 0); // Lấy giá trị từ cột ID
                String idString = idObj.toString(); // Chuyển đổi thành chuỗi
                int id = Integer.parseInt(idString); // Chuyển đổi chuỗi thành số nguyên
                txtMaSP.setText(idString); // Hiển thị giá trị của ID dưới dạng chữ
                SanPhamDAO dao = new SanPhamDAO();
                SanPham sp = dao.timTheoID(id);
                if (sp != null) {
                    txtTenSP.setText(sp.getTenSP());
                    txtLoaiSP.setText(sp.getLoai());
                    txtHangSXSP.setText(sp.getHangSX());
                    txtSoLuongSP.setText(String.valueOf(sp.getSoLuong()));
                    txtDonGiaSP.setText(String.valueOf(sp.getDonGia()));

                    // Convert Date to String
                    Date ngayNhap = sp.getNgayNhap();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // specify your date format
                    String ngayNhapString = sdf.format(ngayNhap);

                    txtNgayNhapSP.setText(ngayNhapString);
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy Sản phẩm với ID: " + id, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn một dòng nào trong bảng", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Xử lý ngoại lệ NumberFormatException nếu không thể chuyển đổi chuỗi thành số nguyên
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearHV;
    private javax.swing.JButton btnClearSP;
    private javax.swing.JButton btnClearTB;
    private javax.swing.JButton btnLuuHV;
    private javax.swing.JButton btnSuaHV;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnSuaTB;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemHV;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnThemTB;
    private javax.swing.JButton btnTimKiemHV;
    private javax.swing.JButton btnTimKiemSP;
    private javax.swing.JButton btnTimKiemTB;
    private javax.swing.JButton btnXoaHV;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JButton btnXoaSP_GH;
    private javax.swing.JButton btnXoaTB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMaTB;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnlBangSP;
    private javax.swing.JPanel pnlHoiVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlSideBar;
    private javax.swing.JPanel pnlThanhToan;
    private javax.swing.JPanel pnlThietBi;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JRadioButton rdoTienMat;
    private javax.swing.JRadioButton rdoTraThe;
    private javax.swing.JPanel tabHoiVien;
    private javax.swing.JPanel tabSanPham;
    private javax.swing.JPanel tabThanhToan;
    private javax.swing.JPanel tabThietBi;
    private javax.swing.JPanel tabThongTin;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTable tblHoiVien;
    private javax.swing.JTable tblHoiVien_ChuaTT;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblThietBi;
    private javax.swing.JTextField txtDonGiaSP;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtGoiTap;
    private javax.swing.JTextField txtHangSXSP;
    private javax.swing.JTextField txtHangSXTB;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLoaiSP;
    private javax.swing.JTextField txtLoaiTB;
    private javax.swing.JTextField txtMaHV;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JFormattedTextField txtNgayHetHan;
    private javax.swing.JFormattedTextField txtNgayNhapSP;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuongSP;
    private javax.swing.JTextField txtSoLuongTB;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenTB;
    private javax.swing.JTextField txtTimKiemHoiVien;
    private javax.swing.JTextField txtTimKiemSP;
    private javax.swing.JTextField txtTimKiemThietBi;
    private javax.swing.JTextField txtTinhTrangTB;
    // End of variables declaration//GEN-END:variables
}
