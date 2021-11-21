package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            if (num1 < min1) {
                min2 = min1;
                min1 = num1;
            } else {
                if (num1 < min2 && num1 != min1) {
                    min2 = num1;
                }
            }
        }
        if (min2 != Integer.MAX_VALUE) {
            System.out.println(min2);
        }

    }
}
