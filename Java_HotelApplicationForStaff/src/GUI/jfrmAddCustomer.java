/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import backend.DTO.ThongTinDatPhongDTO;
import backend.Repository.DangKiDichVuRepo;
import backend.Repository.DangKiPhongRepo;
import backend.Repository.HoaDonRepo;
import backend.Repository.IKhachHangRepo;
import backend.Repository.KhachHangRepo;
import backend.entity.DangKiDichVu;
import backend.entity.DangKiPhong;
import backend.entity.HoaDon;
import backend.entity.KhachHang;
import backend.entity.NhanVien;
import com.sun.xml.internal.ws.encoding.xml.XMLMessage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import static java.util.concurrent.ThreadLocalRandom.current;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vy
 */
public class jfrmAddCustomer extends javax.swing.JFrame {

    ArrayList<KhachHang> listKH = new ArrayList<>();
    int current = 0;
    String userName = "root";
    String password = "root";
    String url = "dbc:mysql://localhost:3306/doan_cnpm?autoReconnect=true&useSSL=false&characterEncoding=latin1";

    public jfrmAddCustomer() {
        initComponents();

//        KhachHangController controller =new KhachHangController(btnAdd, txt_maDV, txt_maPhong, txt_maDV, txt_hoten, txt_sdt, txt_cccd, txt_Checkin, txt_checkout, jbc_trangthai);
//        controller.setView(DTO);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_cccd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbc_trangthai = new javax.swing.JCheckBox();
        txt_maKH = new javax.swing.JTextField();
        txt_maPhong = new javax.swing.JTextField();
        txt_maDV = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkIn = new com.toedter.calendar.JDateChooser();
        checkOut = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 245, 240));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 111, 50));
        jLabel1.setText("THÔNG TIN KHÁCH HÀNG");

        jLabel2.setText("Mã khách hàng:");

        jLabel3.setText("Mã phòng:");

        jLabel4.setText("Mã dịch vụ:");

        jLabel5.setText("Họ và tên*:");

        jLabel6.setText("Số điện thoại *:");

        jLabel7.setText("CCCD/CMND*:");

        txt_cccd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cccdActionPerformed(evt);
            }
        });

        jLabel8.setText("Check-in*:");

        jLabel9.setText("Check-out*:");

        jPanel2.setBackground(new java.awt.Color(251, 245, 240));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 111, 50), 1, true));

        jLabel10.setText("Trạng thái thanh toán:");

        jLabel11.setForeground(new java.awt.Color(243, 111, 50));
        jLabel11.setText("|");

        jbc_trangthai.setBackground(new java.awt.Color(251, 245, 240));
        jbc_trangthai.setPreferredSize(new java.awt.Dimension(40, 40));
        jbc_trangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbc_trangthaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(127, 127, 127)
                .addComponent(jbc_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbc_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt_maKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maKHActionPerformed(evt);
            }
        });

        txt_maPhong.setText("201");
        txt_maPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maPhongActionPerformed(evt);
            }
        });

        txt_maDV.setText("DV001");
        txt_maDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maDVActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(243, 111, 50));
        btnAdd.setText("Thêm");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 111, 50), 0, true));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(243, 111, 50));
        jButton2.setText("Sửa");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 111, 50), 0, true));

        jButton3.setBackground(new java.awt.Color(243, 111, 50));
        jButton3.setText("Xóa");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 111, 50), 0, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_hoten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                        .addComponent(txt_sdt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_cccd, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(38, 38, 38)
                                            .addComponent(checkOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(46, 46, 46)
                                            .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_maDV, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbc_trangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbc_trangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbc_trangthaiActionPerformed

    private void txt_maPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maPhongActionPerformed

    private void txt_maKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maKHActionPerformed

    private void txt_cccdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cccdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cccdActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // them khach hang
        KhachHang kh = new KhachHang();
        kh.setCccd(txt_cccd.getText());
        kh.setSdt(txt_sdt.getText());
        kh.setTenKH(txt_hoten.getText());
        kh.setMaKH(txt_maKH.getText());
        KhachHangRepo khachHangRepo = null;
        try {
            khachHangRepo = new KhachHangRepo();
        } catch (IOException ex) {
            Logger.getLogger(jfrmAddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        khachHangRepo.createKH(kh);
        
        //them hoadon
        HoaDon hd = new HoaDon();
        hd.setKhangHang(kh);
        Date date = Calendar.getInstance().getTime();  
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd ");
        String strDate = dateFormat.format(date); 
        hd.setMaHD(strDate);//YYYYMMDDhhmmss
        hd.setNhanVien(new NhanVien());
        if (jbc_trangthai.isSelected()) {
            hd.setTrangThaiThanhToan(1);
        }else{
            hd.setTrangThaiThanhToan(0);
        }
        hd.setThanhTien("7.625.000 đ");
        HoaDonRepo hdr = null;
        try {
            hdr = new HoaDonRepo();
        } catch (IOException ex) {
            Logger.getLogger(jfrmAddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        hdr.createHoaDon(hd);
        
        //them dang ki phong
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        DangKiPhong dkp = new DangKiPhong();
         System.out.println(checkIn.getDate());
         System.out.println(checkOut.getDate());
        dkp.setCheckIn( dateFormat1.format(checkIn.getDate()));
        dkp.setCheckOut(dateFormat1.format(checkOut.getDate()));
        dkp.setMaDKPhong(strDate);
        dkp.setMaHoaDon(hd);
        
        DangKiPhongRepo dangKiPhongRepo = null;
        try {
            dangKiPhongRepo = new DangKiPhongRepo();
        } catch (IOException ex) {
            Logger.getLogger(jfrmAddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        dangKiPhongRepo.createDangKiPhong(dkp);
        
        // them dki dijh vu
        DangKiDichVu dangKiDichVu= new DangKiDichVu();
        dangKiDichVu.setMaDKDV(strDate);
        dangKiDichVu.setMaDKPhong(dkp);
//        dangKiDichVu.setMaDV(maDV);
        DangKiDichVuRepo dangKiDichVuRepo = null;
        try {
            dangKiDichVuRepo = new DangKiDichVuRepo();
        } catch (IOException ex) {
            Logger.getLogger(jfrmAddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        dangKiDichVuRepo.createDangKiPhong(dangKiDichVu);
      
        JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng thành công !!!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        


    }//GEN-LAST:event_btnAddActionPerformed

    private void txt_maDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maDVActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmAddCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmAddCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmAddCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmAddCustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmAddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private com.toedter.calendar.JDateChooser checkIn;
    private com.toedter.calendar.JDateChooser checkOut;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jbc_trangthai;
    private javax.swing.JTextField txt_cccd;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_maDV;
    private javax.swing.JTextField txt_maKH;
    private javax.swing.JTextField txt_maPhong;
    private javax.swing.JTextField txt_sdt;
    // End of variables declaration//GEN-END:variables

}
