/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.DTO;

import backend.entity.DangKiPhong;
import backend.entity.DichVu;
import backend.entity.KhachHang;

/**
 *
 * @author Vy
 */
// DTO laf cai se hien thi ow front end
public class ThongTinDatPhongDTO {

    private String maKH;
    private String maPhong;
    private String tenKH;
    private String sdt;
    private String cccd;
    private String checkIn;
    private String checkOut;
     private String maDV;
     private boolean isTrangThai;

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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }
  public boolean isTrangThai(){
      return this.isTrangThai;
  }
  public void setTrangThai(boolean isTrangThai){
      this.isTrangThai =isTrangThai;
  }
    
}
