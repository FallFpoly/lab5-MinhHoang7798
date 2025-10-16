/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
class SanPham {

    String ten;
    Double gia;

    public SanPham(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }
}

public class bai3 {

    static ArrayList<SanPham> list = new ArrayList<SanPham>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        while (true) {

            System.out.println("\n----------Danh sach chuc nang--------------");
            System.out.println("1.Nhap ds SP tu ban phim");
            System.out.println("2.Sap xep giam dan theo gia va xuat ra");
            System.out.println("3.Tim va xoa SP theo ten nhap tu ban phim");
            System.out.println("4.Xuat gia TB cua cac SP");
            System.out.println("\n-------------------------------------------");
            System.out.print("Chon chuc nang : ");
            int chon = scanner.nextInt();
            scanner.nextLine(); 

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    trungbinh();
                    break;
            }
        }
    }

    static void nhap() {
        System.out.print("\nNhap SL SP : ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap Ten SP " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhap Gia(VND)SP " + (i + 1) + ": ");
            Double gia = scanner.nextDouble();
            scanner.nextLine(); 
            list.add(new SanPham(ten, gia));
        }
    }

    static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.gia.compareTo(o2.gia);
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        for (SanPham sp : list) {
            System.out.println(sp.ten + " " + sp.gia);
        }
    }

    static void xoa() {
        System.out.print("\nNhap SP can xoa : ");
        String ten = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).ten.equals(ten)) {
                list.remove(i);
                break;
            }
        }
    }

    static void trungbinh() {
        double tong = 0;
        for (SanPham sp : list) {
            tong += sp.gia;
        }
        System.out.println("\nGia TB = " + (tong / list.size()));
    }
}
