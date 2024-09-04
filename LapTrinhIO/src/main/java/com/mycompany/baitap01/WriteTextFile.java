/*

 */
package com.mycompany.baitap01;

import java.io.*;
import java.util.ArrayList;

public class WriteTextFile {

    public static void main(String[] args) throws IOException {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gao", 25000));
        ds.add(new SanPham("SP02", "Duong", 22000));
        ds.add(new SanPham("SP03", "Keo", 20000));

        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for (SanPham sp : ds) {
                fw.write(sp.getMaso() + ";" + sp.getTen() + ";" + sp.getDonGia() + "\n");
            }
            fw.close();
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }

    }
}
