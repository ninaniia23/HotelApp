/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.entity;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Vy
 */
public class DangKiPhong {
    private String maDKPhong;
    private TrangThaiPhong maPhong;
    private HoaDon maHoaDon;
    private String checkIn;
    private String checkOut;

    public String getMaDKPhong() {
        return maDKPhong;
    }

    public void setMaDKPhong(String maDKPhong) {
        this.maDKPhong = maDKPhong;
    }

    public TrangThaiPhong getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(TrangThaiPhong maPhong) {
        this.maPhong = maPhong;
    }

    public HoaDon getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(HoaDon maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getCheckIn(){
        return checkIn;
    }  
    public void setCheckIn(String checkIn){
        this.checkIn= checkIn;
    }
       public String getCheckOut(){
        return checkOut;
    }  
    public void setCheckOut(String checkOut){
        this.checkOut= checkOut;
    }
    
    
}
