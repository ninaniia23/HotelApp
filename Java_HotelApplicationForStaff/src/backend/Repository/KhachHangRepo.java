/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Repository;

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
public class KhachHangRepo implements IKhachHangRepo {

    private JDBCUtils jDBCUtils;

    public KhachHangRepo() throws IOException {
        jDBCUtils = new JDBCUtils();
    }

    @Override
    public void createKH(KhachHang kh) {

        try {
            String sql = "INSERT INTO `khachhang` (`MaKhachHang`, `TenKhachHang`, `CCCD`, `SDT`) VALUES (?, ?, ?, ?);";
            Connection connection = jDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kh.getMaKH());
            preparedStatement.setString(2, kh.getTenKH());
            preparedStatement.setString(3, kh.getCccd());
            preparedStatement.setString(4, kh.getSdt());
            int a = preparedStatement.executeUpdate();
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
