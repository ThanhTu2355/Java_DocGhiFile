/*
 */
package com.mycompany.laptrinhio.baitap02;

import com.mycompany.baitap01.SanPham;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteObject {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < 3; i++) {
                System.out.println("Thong tin san pham thu " + (i + 1));
                System.out.print("Nhap ma so: ");
                String maso = sc.nextLine();
                System.out.print("Nhap ten: ");
                String ten = sc.nextLine();
                System.out.print("Nhap gia: ");
                float gia = sc.nextFloat();
                sc.nextLine();
                SanPham sp = new SanPham(maso, ten, gia);
                ds.add(sp);
            }

            oos.writeObject(ds);
            oos.close();

            System.out.println("\n Da ghi xong");

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }
    }
}
