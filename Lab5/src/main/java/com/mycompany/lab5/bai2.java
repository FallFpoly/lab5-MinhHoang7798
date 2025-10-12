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

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Nhap ds ho ten");
            System.out.println("2. Xuat ds");
            System.out.println("3. Xuat ds ngau nhien");
            System.out.println("4. Sap xep giam dan");
            System.out.println("5. Tim va xoa ho ten");
            System.out.println("6. Ket thuc");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    nhap(sc);
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
                    xoa(sc);
                    break;

                case 6:
                    System.out.println("Thoat");
                    break;

                default:
                    System.out.println("Sai chuc nang");
            }
        } while (chon != 6);
    }

    public static void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        String ten = sc.nextLine();
        list.add(ten);
    }

    public static void xuat() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void ngaunhien() {
        Collections.shuffle(list);
        xuat();
    }

    public static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }

    public static void xoa(Scanner sc) {
        System.out.print("Nhap ten can xoa: ");
        String ten = sc.nextLine();
        for (String s : list) {
            if (s.equalsIgnoreCase(ten)) {
                list.remove(s);
                System.out.println("Da xoa " + ten);
                break;
            }
        }
    }
}
