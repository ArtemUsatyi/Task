package com.multithreading;

public class ThreadTest {
    private int count;

    public static void main(String[] args) throws InterruptedException {
        //MyThread myThread = new MyThread();
        //myThread.start();
        //Thread thread = new Thread(new Runner());
        //thread.start();
        ThreadTest myTest = new ThreadTest();
        myTest.doWork();
    }

    public void increment() {
        synchronized (this) {
            count++;
        }
    }
    // public synchronized void increment(){count++;} одинаковые выражения

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(this::run);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(count);
    }

    private void run() {
        for (int i = 0; i < 10000; i++) increment();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner " + i);
        }
    }
}

class MyThread extends Thread {
    public volatile boolean type = true; // для обеспечения когерентности кэша

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + i);
        }
    }
}