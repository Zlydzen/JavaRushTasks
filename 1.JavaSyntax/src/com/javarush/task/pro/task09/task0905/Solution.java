package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int i = 0;
        int numOctal = 0;
        while (decimalNumber >0) {
            numOctal = (numOctal + (decimalNumber % 8) * (int) (Math.pow(10, i)));
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return numOctal;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int i = 0;
        int numDecimal = 0;
        while (octalNumber > 0) {
            numDecimal = (numDecimal + (octalNumber % 10) * (int) (Math.pow(8, i)));
            octalNumber = octalNumber / 10;
            i++;
        }
        return numDecimal;
    }
}
