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
        ArrayList<Double> list = new ArrayList<Double>();
        while (true) {
            System.out.print("Nhap so thuc: ");
            Double x = sc.nextDouble();
            list.add(x);
            System.out.print("Nhap them (Y/N)? ");
            sc.nextLine();
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        }

        double tong = 0;
        for (Double d : list) {
            System.out.println("Gia tri: " + d);
            tong += d;
        }
        System.out.println("Tong = " + tong);
    }
}
