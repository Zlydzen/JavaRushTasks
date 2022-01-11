package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        FileInputStream inputStream = new FileInputStream(nameFile);

        byte[] bytes = inputStream.readAllBytes();
        byte max = bytes[0];
        for (byte aByte : bytes) {
            if (aByte > max) {
                max = aByte;
            }
        }

        System.out.println(max);
    }
}

