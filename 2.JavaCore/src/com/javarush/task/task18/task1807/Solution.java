package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int comma = 0;

        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            if (read == 44){
                comma +=1;
            }
        }
        System.out.println(comma);
        bufferedReader.close();
        fileInputStream.close();
    }
}
