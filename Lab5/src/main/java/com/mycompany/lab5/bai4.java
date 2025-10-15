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
        Map<String, String> map = new HashMap<String, String>();
        map.put("PC08044", "Ly Chi Thanh");
        map.put("PC08122", "Nguyen Thanh Dat");
        map.put("PC08503", "Nguyen Nhat Tien");
        map.put("PC09014", "Nguyen Van Vi");

        System.out.println("\nTen cua SV PC08503 : " + map.get("PC08503"));

        String ten = "Nguyen Thanh Dat";
        String ma = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(ten)) {
                ma = entry.getKey();
                break;
            }
        }
        System.out.println("\nMa SV cua Nguyen Thanh Dat : " + ma);

        if (map.containsValue("Nguyen Van Binh")) {
            System.out.println("\nCo SV ten : Nguyen Van Binh");
        } else {
            System.out.println("\nKo co SV ten : Nguyen Van Binh");
        }
    }
}
