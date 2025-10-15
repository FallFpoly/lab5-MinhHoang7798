/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    static ArrayList<String> list = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    static void menu() {
        System.out.println("1. Nhap ds ho va ten SV");
        System.out.println("2. Xuat ds SV vua nhap");
        System.out.println("3. Xuat ds SV ngau nhien");
        System.out.println("4. Sap xep ds SV giam dan va xuat ds SV");
        System.out.println("5. Tim va xoa ho ten DS SV nhap tu ban phim");
        System.out.println("6. Ket thuc");
        System.out.print("Chon: ");
        int chon = scanner.nextInt();
        scanner.nextLine(); 

        switch (chon) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                ngaunhien();
                break;
            case 4:
                sapxep();
                break;
            case 5:
                xoa();
                break;
            case 6:
                System.exit(0);
        }
    }

    static void nhap() {
        System.out.print("Nhap SL ho ten SV : ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten SV : " + (i + 1) + ": ");
            String hoten = scanner.nextLine();
            list.add(hoten);
        }
    }

    static void xuat() {
        for (String hoten : list) {
            System.out.println(hoten);
        }
    }

    static void ngaunhien() {
        Collections.shuffle(list);
        xuat();
    }

    static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }

    static void xoa() {
        System.out.print("Nhap ho ten SV can xoa: ");
        String hoten = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(hoten)) {
                list.remove(i);
                break;
            }
        }
    }
}
