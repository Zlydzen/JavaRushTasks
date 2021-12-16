package com.javarush.task.task16.task1632;

public class Thread4 extends Thread implements Message {

    private boolean isAlive = false;

    @Override
    public void run() {
        while (!isAlive) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void showWarning() {
        isAlive = true;
    }
}
