package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int digitsNum = 0;
        for (int i = 0; i < string.length(); i++) {
            char digits = string.charAt(i);
            if (Character.isDigit(digits)) {
                digitsNum++;
            }
        }
        return digitsNum;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int lettersNum = 0;
        for (int i = 0; i < string.length(); i++) {
            char letters = string.charAt(i);
            if (Character.isAlphabetic(letters)) {
                lettersNum++;
            }
        }
        return lettersNum;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int spacecNum = 0;
        for (int i = 0; i < string.length(); i++) {
            char spaces = string.charAt(i);
            if (Character.isSpaceChar(spaces)){
                spacecNum++;
            }
        }
    return spacecNum;
    }
}
