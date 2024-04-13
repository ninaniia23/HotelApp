/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Repository;

import backend.entity.DangKiDichVu;
import backend.entity.DangKiPhong;
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
public class DangKiDichVuRepo {
    
    private JDBCUtils jDBCUtils;

    public DangKiDichVuRepo() throws IOException {
        jDBCUtils = new JDBCUtils();
    }

    public void createDangKiPhong(DangKiDichVu dkdv) {

        try {
            String sql = "INSERT INTO `doan_cnpm`.`dangkidichvu` (`MaDangKiDichVu`, `MaDichVu`, `MaDangKiPhong`) VALUES (?, ?, ?);";
            Connection connection = jDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dkdv.getMaDKDV());
            preparedStatement.setString(2, "DV001");
            preparedStatement.setString(3, dkdv.getMaDKPhong().getMaDKPhong());
        
            int a = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
