package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader1.readLine();
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        String fileName2 = bufferedReader2.readLine();
        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(System.in));
        String fileName3 = bufferedReader3.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);

        byte[] buffer = new byte[1000];
        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read(buffer);
            if (read % 2 != 0) {
                fileOutputStream2.write(buffer, 0, (read / 2) + 1);
                fileOutputStream3.write(buffer, read / 2 + read % 2, read / 2);
            }
            if (read % 2 == 0) {
                fileOutputStream2.write(buffer, 0, read / 2);
                fileOutputStream3.write(buffer, read / 2, read / 2);
            }

        }
        bufferedReader1.close();
        bufferedReader2.close();
        bufferedReader3.close();
        fileInputStream.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}
