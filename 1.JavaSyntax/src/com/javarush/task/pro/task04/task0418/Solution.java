package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean num = scanner.nextBoolean();
        int optimist = (int) Math.ceil(glass);
        int pessimist = (int) Math.floor(glass);
        if (num)
            System.out.println(optimist);
        else {
            System.out.println(pessimist);
        }
    }
}