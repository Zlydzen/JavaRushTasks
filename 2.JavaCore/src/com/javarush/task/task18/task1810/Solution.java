package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int[] buffer = new int[1000];
        while (true) {
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
            if (fileInputStream.available() > 1000) {
                bufferedReader.readLine();
            }
            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                bufferedReader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {
    }
}
