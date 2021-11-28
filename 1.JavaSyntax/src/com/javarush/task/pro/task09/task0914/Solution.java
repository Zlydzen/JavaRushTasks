package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int index = path.indexOf("/");
        int index2 = path.indexOf("/", index+2);
        int index3 = path.indexOf("/", index2+2);
        int index4 = path.indexOf("/", index3+2);
        String first = path.substring(0, index3+1);
        String second = path.substring(index4);
        String newPatch = first + jdk +second;
        return newPatch;
    }
}
