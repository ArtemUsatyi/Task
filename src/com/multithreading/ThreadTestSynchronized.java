package com.multithreading;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ThreadTestSynchronized {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {
    Object lock1 = new Object();
    Object lock2 = new Object();
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addList1();
            addList2();
        }
    }

    public void main() {
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(this::work);
        Thread thread2 = new Thread(this::work);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения работы: " + (end - start) + " mc.");
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}