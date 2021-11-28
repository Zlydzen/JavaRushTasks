package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String [] HEXADECIMALS = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    private static final String [] BINARIES = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};

    public static void main(String[] args) {

        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder();
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[0-1]+")) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        for (int i = 0; i < binaryNumber.length(); i=i+4) {
            String group = binaryNumber.substring(i, i+4);
            for (int j = 0; j < BINARIES.length ; j++) {
                if (group.equals(BINARIES[j])){
                    stringBuilder.append(HEXADECIMALS[j]);
                    break;
                }
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder();
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            String group = hexNumber.substring(i+0,1+i);
            for (int j = 0; j < BINARIES.length; j++) {
                if (group.equals(HEXADECIMALS[j])){
                    stringBuilder.append(BINARIES[j]);
                    break;
                }
            }

        }

        return String.valueOf(stringBuilder);
    }
}
