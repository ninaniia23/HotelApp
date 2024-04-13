/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.entity;

/**
 *
 * @author Vy
 */
public class ChiTietHoaDon {
    private HoaDon maHoaDon;
    private DangKiPhong checkIn;
    private DangKiPhong checkOut ;
    private String ngayXuatHoaDon;
    private String thanhTien;
    private boolean isTrangThai;

    public ChiTietHoaDon(HoaDon maHoaDon, DangKiPhong checkIn, DangKiPhong checkOut, String ngayXuatHoaDon, String thanhTien, boolean isTrangThai) {
        this.maHoaDon = maHoaDon;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.thanhTien = thanhTien;
        this.isTrangThai = isTrangThai;
    }

    public String getMaDKPhong() {
        return checkIn.getMaDKPhong();
    }

    public void setMaDKPhong(String maDKPhong) {
        checkIn.setMaDKPhong(maDKPhong);
    }

    public TrangThaiPhong getMaPhong() {
        return checkIn.getMaPhong();
    }

    public void setMaPhong(TrangThaiPhong maPhong) {
        checkIn.setMaPhong(maPhong);
    }

    public HoaDon getMaHoaDon() {
        return checkIn.getMaHoaDon();
    }

    public void setMaHoaDon(HoaDon maHoaDon) {
        checkIn.setMaHoaDon(maHoaDon);
    }

    public String getCheckIn() {
        return checkIn.getCheckIn();
    }

    public void setCheckIn(String checkIn) {
        this.checkIn.setCheckIn(checkIn);
    }

    public String getCheckOut() {
        return checkIn.getCheckOut();
    }

    public void setCheckOut(String checkOut) {
        checkIn.setCheckOut(checkOut);
    }
    
    
}
