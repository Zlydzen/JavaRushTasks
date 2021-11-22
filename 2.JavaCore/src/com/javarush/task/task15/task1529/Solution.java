package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            if (line.equals("helicopter")) {
                result = new Helicopter();
            } else if (line.equals("plane")) {
                result = new Plane(reader.read());
            } else
                reader.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
