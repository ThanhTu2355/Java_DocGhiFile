/*
 */
package com.mycompany.laptrinhio.baitap02;

import com.mycompany.baitap01.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {

    public static void main(String[] args) {
        ArrayList<SanPham> ds;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds= (ArrayList<SanPham>) ois.readObject();
            // In danh sách sản phẩm ra màn hình
            System.out.println("Danh sach san pham:");
            for (SanPham sp : ds) {
                System.out.println(sp);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
