package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if ((array.length % 2) != 0) {
                System.out.println(array[i]);
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if ((array.length % 2) == 0) {
                System.out.println(array[i]);
            }
        }
    }
}


//        for (int i = 0; i<num; i++) {
//            if ((array.length % 3) == 0) {
//                System.out.println(array[i]);
//            }
//        }
//        for (int j = num; j >= 0; j--) {
//            System.out.println(i);
//        }




