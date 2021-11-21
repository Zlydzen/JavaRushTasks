package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b && b != c)
            System.out.println(a + " " + b);
        else if (a != b && b == c)
            System.out.println(b + " " + c);
        else if (a == c && a != b)
            System.out.println(a + " " + c);
    }
}