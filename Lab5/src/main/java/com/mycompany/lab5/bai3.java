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

    static ArrayList<SanPham> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Nhap ds san pham");
            System.out.println("2. Sap xep giam dan theo gia");
            System.out.println("3. Tim va xoa san pham theo ten");
            System.out.println("4. Xuat gia TB");
            System.out.println("5. Ket thuc");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    nhap(sc);
                    break;

                case 2:
                    sapxep();
                    break;

                case 3:
                    xoa(sc);
                    break;

                case 4:
                    trungbinh();
                    break;

                case 5:
                    System.out.println("Thoat");
                    break;

                default:
                    System.out.println("Sai chuc nang");
            }
        } while (chon != 5);
    }

    public static void nhap(Scanner sc) {
        System.out.print("Nhap ten sp: ");
        String ten = sc.nextLine();
        System.out.print("Nhap gia: ");
        double gia = sc.nextDouble();
        list.add(new SanPham(ten, gia));
    }

    public static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {

            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.gia.compareTo(o1.gia);
            }
        };
        Collections.sort(list, comp);
        for (SanPham sp : list) {
            System.out.println(sp.ten + " - " + sp.gia);
        }
    }

    public static void xoa(Scanner sc) {
        System.out.print("Nhap ten sp can xoa: ");
        String ten = sc.nextLine();
        for (SanPham sp : list) {
            if (sp.ten.equalsIgnoreCase(ten)) {
                list.remove(sp);
                System.out.println("Da xoa " + ten);
                break;
            }
        }
    }

    public static void trungbinh() {
        double tong = 0;
        for (SanPham sp : list) {
            tong += sp.gia;
        }
        double tb = tong / list.size();
        System.out.println("Gia trung binh = " + tb);
    }
}
