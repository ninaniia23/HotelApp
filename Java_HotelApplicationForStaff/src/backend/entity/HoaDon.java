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
public class HoaDon {

    private String maHD;
    private KhachHang khangHang;
    private NhanVien nhanVien;
    private String maPhong;
    private String maDangKiDV;
    private int trangThaiThanhToan;
    private String thanhTien;

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    
    
    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int isTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(int trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public KhachHang getKhangHang() {
        return khangHang;
    }

    public void setKhangHang(KhachHang khangHang) {
        this.khangHang = khangHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaDangKiDV() {
        return maDangKiDV;
    }

    public void setMaDangKiDV(String maDangKiDV) {
        this.maDangKiDV = maDangKiDV;
    }

}
