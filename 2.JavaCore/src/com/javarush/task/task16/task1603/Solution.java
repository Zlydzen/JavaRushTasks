package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
        SpecialThread list1 = new SpecialThread();
        SpecialThread list2 = new SpecialThread();
        SpecialThread list3 = new SpecialThread();
        SpecialThread list4 = new SpecialThread();
        SpecialThread list5 = new SpecialThread();

        Thread thread1 = new Thread(list1);
        Thread thread2 = new Thread(list2);
        Thread thread3 = new Thread(list3);
        Thread thread4 = new Thread(list4);
        Thread thread5 = new Thread(list5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
