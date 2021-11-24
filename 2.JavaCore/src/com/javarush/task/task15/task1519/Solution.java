package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while (!(line = reader.readLine()).equals("exit")) {

            try {
                if (line.contains(".")) {
                    Double aDouble = Double.valueOf(line);
                    print(aDouble);
                } else if (Integer.parseInt(line) <= 0 || Integer.parseInt(line) >= 128) {
                    print(Integer.parseInt(line));
                } else if (Short.parseShort(line) > 0 || Short.parseShort(line) < 128) {
                    print(Short.parseShort(line));
                } else {
                    print(line);
                }
            } catch (NumberFormatException e) {
                print(line);
                continue;
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
