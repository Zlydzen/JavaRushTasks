package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread{

    @Override
    public void run() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int sum=0;
        while (true) {
            try {
                if ((line=reader.readLine()).equals("N")) break;
                sum += Integer.parseInt(line);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e){
                System.out.println("Numbers only allowed");
            }
        }
        System.out.println(sum);

    }
}
