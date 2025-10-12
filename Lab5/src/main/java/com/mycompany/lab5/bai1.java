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
            System.out.print("Nhap so thuc: ");
            double x = sc.nextDouble();
            list.add(x);
            System.out.print("Nhap tiep (Y/N)? ");
            sc.nextLine();
            String tl = sc.nextLine();
            if (tl.equalsIgnoreCase("N")) {
                break;
            }
        }
        double tong = 0;
        System.out.println("Ds vua nhap:");
        for (Double d : list) {
            System.out.println(d);
            tong += d;
        }
        System.out.println("Tong = " + tong);
    }
}
