package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int[] allBytes = new int[256];
        while (fileInputStream.available() > 0) {
            allBytes[fileInputStream.read()]++;
        }
        bufferedReader.close();
        fileInputStream.close();
        int minByteFreq = Integer.MAX_VALUE;
        for (int i = 0; i < allBytes.length; i++) {
            if (allBytes[i] > 0 && allBytes[i] < minByteFreq){
                minByteFreq = allBytes[i];
            }
        }
        for (int i = 0; i < allBytes.length; i++) {
            if (allBytes[i]==minByteFreq){
                System.out.print(i + " ");
            }
        }
    }
}
