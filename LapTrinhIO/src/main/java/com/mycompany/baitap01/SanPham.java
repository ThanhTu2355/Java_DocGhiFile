/*
 */
package com.mycompany.baitap01;

import java.io.Serializable;


public class SanPham implements Serializable{
    private String maso;
    private String ten;
    private double donGia;

    public SanPham(String maso, String ten, double donGia) {
        this.maso = maso;
        this.ten = ten;
        this.donGia = donGia;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", donGia=" + donGia + '}';
    }
    
}
