/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Repository;

import backend.DTO.ThongTinDatPhongDTO;
import backend.utils.JDBCUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vy
 */
public class ThongTinDatPhong implements IThongTinDatPhong{
    
    private JDBCUtils jDBCUtils;

    public ThongTinDatPhong() throws IOException {
        jDBCUtils = new JDBCUtils();
    }
    
    

    @Override
    public List<ThongTinDatPhongDTO> getAll() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
        List<ThongTinDatPhongDTO> listDTO = new ArrayList<>();

		String sqlSelect = "SELECT k.MaKhachHang, k.TenKhachHang,k.SDT, k.CCCD, dk.CheckIn, dk.CheckOut, dk.MaPhong, d.MaDichVu from khachhang k\n" +
                                    "join HoaDon h on k.MaKhachHang = h.MaKhachHang\n" +
                                    "join DangKiPhong dk on h.MaHoaDon = dk.MaHoaDon\n" +
                                    "join DangKiDichVu d on d.MaDangKiPhong= dk.MaDangKiPhong\n" +
                                    "join DichVu dv on dv.MaDichVu = d.MaDichVu;  ";
		ResultSet resultSet = jDBCUtils.executeQuery(sqlSelect);
		while (resultSet.next()) {
			ThongTinDatPhongDTO dto = new ThongTinDatPhongDTO();
                        dto.setMaKH(resultSet.getString(1));
			dto.setTenKH(resultSet.getString(2));
                        dto.setSdt(resultSet.getString(3));
			dto.setCccd(resultSet.getString(4));
			dto.setCheckIn(resultSet.getString(5));
                        dto.setCheckOut(resultSet.getString(6));
			dto.setMaPhong(resultSet.getString(7));
                        dto.setMaDV(resultSet.getString(8));
			listDTO.add(dto);
		}
        
       return  listDTO;
    }
    
    
    
}
