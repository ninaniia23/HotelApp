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
public class DangKiDichVu {
    private String maDKDV;
    private DichVu maDV;
    private DangKiPhong maDKPhong;
    private LocalDate ngayThucHien ;

    public String getMaDKDV() {
        return maDKDV;
    }

    public void setMaDKDV(String maDKDV) {
        this.maDKDV = maDKDV;
    }

    public DichVu getMaDV() {
        return maDV;
    }

    public void setMaDV(DichVu maDV) {
        this.maDV = maDV;
    }

    public DangKiPhong getMaDKPhong() {
        return maDKPhong;
    }

    public void setMaDKPhong(DangKiPhong maDKPhong) {
        this.maDKPhong = maDKPhong;
    }

    public LocalDate getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(LocalDate ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }
    
    
}
