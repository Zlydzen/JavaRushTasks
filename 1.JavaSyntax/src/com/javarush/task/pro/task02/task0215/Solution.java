package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int num3 = number.nextInt();
        
        int average = (num1+num2+num3)/3;
        
        System.out.println(average);

    }
}
