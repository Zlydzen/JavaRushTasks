package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte [] listAllBytes = new byte [256];

        while (fileInputStream.available() > 0) {
            listAllBytes[fileInputStream.read()]++;
        }

        byte maxRepeat = 0;
        for (int i = 0; i <listAllBytes.length  ; i++) {
            if (listAllBytes[i]>maxRepeat) maxRepeat = listAllBytes[i];
        }
        for (int i = 0; i <listAllBytes.length ; i++) {
            if (listAllBytes[i]==maxRepeat) System.out.print(i + " ");
        }

        bufferedReader.close();
        fileInputStream.close();
    }
}
