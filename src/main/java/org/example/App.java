package org.example;

public class App {
    public static void main( String[] args ) {
        ThreadGroup group = new ThreadGroup("Группа потоков");

        Thread thread1 = new Thread((group), new MyThread("1", 2000));
        Thread thread2 = new Thread((group), new MyThread("2", 1000));
        Thread thread3 = new Thread((group), new MyThread("3", 500));
        Thread thread4 = new Thread((group), new MyThread("4", 1500));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Прекращаю работу потоков!");
        group.interrupt();
    }
}