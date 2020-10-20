package org.example;

public class MyThread extends Thread {
    private final long time;

    public MyThread(String name, long time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(time);
                System.out.printf("Поток %s работает\n", getName());
            }
        } catch (InterruptedException e) {
            System.out.printf("Поток %s прерван\n" , getName());
        }
    }
}