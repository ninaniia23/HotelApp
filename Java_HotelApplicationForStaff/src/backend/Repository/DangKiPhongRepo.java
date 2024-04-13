/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Repository;

import backend.entity.DangKiPhong;
import backend.entity.KhachHang;
import backend.utils.JDBCUtils;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vy
 */
public class DangKiPhongRepo {

    private JDBCUtils jDBCUtils;

    public DangKiPhongRepo() throws IOException {
        jDBCUtils = new JDBCUtils();
    }

    public void createDangKiPhong(DangKiPhong dkp) {

        try {
            String sql = "INSERT INTO `doan_cnpm`.`dangkiphong` (`MaDangKiPhong`, `MaPhong`, `MaHoaDon`, `CheckIn`, `CheckOut`) VALUES (?, ?,  ?, ?, ?);";
            Connection connection = jDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dkp.getMaDKPhong());
            preparedStatement.setString(2, "201");
            preparedStatement.setString(3, dkp.getMaHoaDon().getMaHD());
            preparedStatement.setString(4, dkp.getCheckIn());
            preparedStatement.setString(5, dkp.getCheckOut());
            int a = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
