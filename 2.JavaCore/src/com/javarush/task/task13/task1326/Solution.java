package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //reading file name from console
             BufferedReader fileSource = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) { //reading content from this.file (line by line)

            List<Integer> list = new ArrayList<>();
            String line;
            while ((line = fileSource.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (num % 2 == 0) {
                    list.add(num);
                }
            }
            Collections.sort(list);
            for (Integer i : list) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }
}
