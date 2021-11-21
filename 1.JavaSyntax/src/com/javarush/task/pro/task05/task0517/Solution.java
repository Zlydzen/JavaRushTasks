package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        //напишите тут ваш код
        if ((array.length % 2) != 0) {
            int[] array1 = Arrays.copyOfRange(array, 0, ((array.length) / 2) + 1);
            int[] array2 = Arrays.copyOfRange(array, (array.length / 2) + 1, array.length);
            result[0] = array1;
            result[1] = array2;
            System.out.println(Arrays.deepToString(result));
        } else {
            if ((array.length % 2) == 0) {
                int[] array1 = Arrays.copyOfRange(array, 0, (array.length) / 2);
                int[] array2 = Arrays.copyOfRange(array, array.length / 2, array.length);
                result[0] = array1;
                result[1] = array2;
            }
            System.out.println(Arrays.deepToString(result));
        }
    }
}

