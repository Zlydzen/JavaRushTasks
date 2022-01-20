package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader1.readLine();
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        String fileName2 = bufferedReader2.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            int readAllBytes = fileInputStream.read(buffer);
            for (byte i = 0; i < buffer.length / 2; i++) {
                byte temp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = temp;
            }
            fileOutputStream.write(buffer, 0, readAllBytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
        bufferedReader2.close();
        bufferedReader1.close();
    }

}
