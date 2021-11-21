package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine())) {
            while (fileInputStream.available() > 0) {
                char read = (char) fileInputStream.read();
                System.out.print(read);
            }
        } catch (IOException e) {
            System.out.println("Something wrong");
        }
    }
}