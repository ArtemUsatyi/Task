package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // создаем Pool потоки - кол-во 2
        for (int i = 0; i < 5; i++)
            executorService.submit(new WorkTest(i)); // submit передаем задания
        executorService.shutdown(); // начать выполнять задание, выполнение происходит по очередно
        executorService.awaitTermination(1, TimeUnit.HOURS); // ожидание пока не выполниться поток(и), по типу join
    }
}

class WorkTest implements Runnable {
    private int id = 0;

    public WorkTest(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Работа закончена: " + id);
    }
}
