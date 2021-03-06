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

        int maxByte = 0;

        while (inputStream.available() > 0) {
            int readByte = inputStream.read();
            if (readByte > maxByte) {
                maxByte = readByte;
            }
        }
        System.out.println(maxByte);
        inputStream.close();
        reader.close();
    }
}

