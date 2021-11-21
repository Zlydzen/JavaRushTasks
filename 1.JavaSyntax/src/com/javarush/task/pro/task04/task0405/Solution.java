package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int bUp = 0;
        while (bUp < 20) {
            System.out.print("Б");
            bUp++;
        }
        System.out.println();
        int i = 0;
        while (i < 8) {
            int s = 0;
            while (s < 1) {
                System.out.print("Б");
                s++;
            }
            System.out.println("                  Б"); //19 пробелов
            i++;
        }
        int bDown = 0;
        while (bDown < 20) {
            System.out.print("Б");
            bDown++;
        }
    }
}