/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import backend.DTO.ThongTinDatPhongDTO;
import backend.entity.KhachHang;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author Vy
 */
public class KhachHangController {
    private JButton btnAdd;
    private JTextField txt_maKH;
    private JTextField txt_maPhong;
    private JTextField txt_maDV ;
    private JTextField txt_hoten ;
    private JTextField txt_sdt ;
    private JTextField txt_cccd;
    private JTextField txt_Checkin ;
    private JTextField txt_checkout;
    private JCheckBox jcb_trangthai ;

    public KhachHangController(JButton btnAdd, JTextField txt_maKH, JTextField txt_maPhong, JTextField txt_maDV, JTextField txt_hoten, JTextField txt_sdt, JTextField txt_cccd, JTextField txt_Checkin, JTextField txt_checkout, JCheckBox jcb_trangthai) {
        this.btnAdd = btnAdd;
        this.txt_maKH = txt_maKH;
        this.txt_maPhong = txt_maPhong;
        this.txt_maDV = txt_maDV;
        this.txt_hoten = txt_hoten;
        this.txt_sdt = txt_sdt;
        this.txt_cccd = txt_cccd;
        this.txt_Checkin = txt_Checkin;
        this.txt_checkout = txt_checkout;
        this.jcb_trangthai = jcb_trangthai;
    }
    
    public void setView(ThongTinDatPhongDTO dto){
        txt_maKH.setText("#" + dto.getMaKH());
        txt_maPhong.setText(dto.getMaPhong());
        txt_maDV.setText(dto.getMaDV());
        txt_hoten.setText(dto.getTenKH());
        txt_sdt.setText(dto.getSdt());
        txt_cccd.setText(dto.getCccd());
       txt_Checkin.setText(dto.getCheckIn());
       txt_checkout.setText(dto.getCheckOut());
       jcb_trangthai.setSelected(dto.isTrangThai());
    }
    
}
