/*
 */
package com.mycompany.baitap01;

import java.io.*;
import java.util.ArrayList;


public class ReadTextFile {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();

        try {
            FileReader rd = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(rd);
            String data;

            while ((data = br.readLine()) != null) {
                // Create a SanPham object from the data read and add it to the list
                String[] arr = data.split(";");
                ds.add(new SanPham(arr[0], arr[1], Float.parseFloat(arr[2])));
            }

            br.close();
            System.out.println("Da doc xong");
            System.out.println("Ket qua doc duoc:");
            for (SanPham x : ds) {
                System.out.println(x);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Doc file that bai");
        }
    }
}
