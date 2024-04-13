/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Repository;

import backend.entity.HoaDon;
import backend.entity.KhachHang;
import backend.utils.JDBCUtils;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vy
 */
public class HoaDonRepo {
    
    private JDBCUtils jDBCUtils;

    public HoaDonRepo() throws IOException {
        jDBCUtils = new JDBCUtils();
    }

    public void createHoaDon(HoaDon hd) {

        try {
            String sql = "INSERT INTO `hoadon` (`MaHoaDon`, `MaKhachHang`, `MaNhanVien`, `ThanhTien`, `trangThaiThanhToan`) VALUES (?, ?, ?, ?,?);";
            Connection connection = jDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hd.getMaHD());
            preparedStatement.setString(2, hd.getKhangHang().getMaKH());
            preparedStatement.setString(3, "NV001");
            preparedStatement.setString(4, hd.getThanhTien());
            preparedStatement.setInt(5, hd.isTrangThaiThanhToan());
            int a = preparedStatement.executeUpdate();
           

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
