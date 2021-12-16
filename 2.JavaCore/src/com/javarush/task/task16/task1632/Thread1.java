package com.javarush.task.task16.task1632;

public class Thread1 extends Thread {

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
