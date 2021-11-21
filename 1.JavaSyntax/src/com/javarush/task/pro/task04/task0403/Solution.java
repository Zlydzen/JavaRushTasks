package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int sum = scanner.nextInt();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
        }
        while (!isExit) {
            String stopWord = scanner.nextLine();
            isExit = stopWord.equals("ENTER");
        }
        System.out.println(sum);
    }
}