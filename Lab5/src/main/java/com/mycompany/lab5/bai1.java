/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while (true) {
            System.out.print("\nNhap so thuc: ");
            double x = sc.nextDouble();
            list.add(x);

            System.out.print("Nhap tiep ko (Y/N)? : ");
            sc.nextLine();
            String n = sc.nextLine();
            if (n.equalsIgnoreCase("n")) {
                break;
            }
        }
        double tong = 0;
        System.out.println("\nDs so vua nhap : ");
        for (Double so : list) {
            System.out.println(so);
            tong += so;
        }
        System.out.println("\n=> Tong = " + tong);
    }
}
