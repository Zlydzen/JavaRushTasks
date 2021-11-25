package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
//        System.out.println(intArray[0]);
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int minValue = ints[0];   // Finding minimum value in Array
        for (int num : ints) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }


    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = console.nextInt();
        }
        return Array;
    }
}
