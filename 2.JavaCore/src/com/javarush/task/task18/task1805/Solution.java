package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(nameFile);
        Set<Integer> list = new TreeSet<>();

        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            list.add(read);
        }
        String collect = list.stream().map(integer -> " " + integer).collect(Collectors.joining());
        System.out.println(collect);
        fileInputStream.close();
        reader.close();
    }
}
