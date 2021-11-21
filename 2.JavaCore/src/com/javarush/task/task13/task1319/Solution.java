package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(line));
            while (!(line = reader.readLine()).equals("exit")) {
                writer.write(line + "\n");
            }
            writer.write(line + "\n");
            writer.close();
            reader.close();
        } catch (FileNotFoundException e){
            e.getStackTrace();
        }
    }
}





