/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.entity;

import java.time.LocalDate;

/**
 *
 * @author Vy
 */
public class KhachHang {
  
     private String maKH;
    private String tenKH;
    private String sdt;
    private String cccd;
    private TrangThaiPhong maPhong;
    private DichVu maDichVu;
    private DangKiPhong checkIn;
    private DangKiPhong checkOut;
    private boolean isTrangthai;
    
  

    public String getCheckOut() {
        return checkOut.getCheckOut();
    }

    public void setCheckOut(String checkOut) {
        this.checkOut.setCheckOut(checkOut);
    }

    public String getCheckIn() {
        return checkIn.getCheckIn();
    }

    public void setCheckIn(String checkIn) {
        this.checkIn.setCheckIn(checkIn);
    }

   
  
    
    public String getSdt(){
        return sdt;
    }
    public void setSdt(String sdt){
        this.sdt= sdt;
    }
    public String getMaDV() {
        return maDichVu.getMaDV();
    }

    public void setMaDV(String maDV) {
        maDichVu.setMaDV(maDV);
    }

    public String getMaPhong() {
        return maPhong.getMaPhong();
    }

    public void setMaPhong(String maPhong) {
        this.maPhong.setMaPhong(maPhong);
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    
    
      
    
}
