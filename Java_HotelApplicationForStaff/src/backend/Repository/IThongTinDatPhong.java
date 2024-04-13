/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Repository;

import backend.DTO.ThongTinDatPhongDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Vy
 */
public interface IThongTinDatPhong {
    List<ThongTinDatPhongDTO> getAll() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException;
    
}
