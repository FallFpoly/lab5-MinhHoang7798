/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("PC08044", "Ly Chi Thanh");
        map.put("PC08122", "Nguyen Thanh Dat");
        map.put("PC08503", "Nguyen Nhat Tien");
        map.put("PC09014", "Nguyen Van Vi");

        System.out.println("PC08503: " + map.get("PC08503"));

        for (String key : map.keySet()) {
            if (map.get(key).equals("Nguyen Thanh Dat")) {
                System.out.println("Ma cua Nguyen Thanh Dat: " + key);
            }
        }

        boolean found = false;
        for (String value : map.values()) {
            if (value.equals("Nguyen Van Binh")) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Co Nguyen Van Binh");
        } else {
            System.out.println("Khong co Nguyen Van Binh");
        }
    }

}
