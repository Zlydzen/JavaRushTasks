package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String substring = url.substring(url.lastIndexOf("?") + 1, url.lastIndexOf("="));
        String[] cycle1 = substring.split("&");
        ArrayList<String> list = new ArrayList<>();
        for (String param : cycle1) {
            String[] finalParam = param.split("=");
            if (!finalParam[0].equals("obj")) {
                System.out.print(finalParam[0] + " ");
            } else {
                System.out.print(finalParam[0] + " ");
                list.add(finalParam[1]);
            }

        }

        for (String params : list) {
            try {
                    double v = Double.parseDouble(params);
                    alert(v);
            } catch (Exception e) {
                alert(params);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}



