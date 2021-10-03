package com.viplav.learn;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorsExample {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

        Lock lock = new ReentrantLock();

        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("Hello World " + new Date() + " " + Thread.currentThread().getName());
                lock.unlock();
            }
        }, 1000, 1000, TimeUnit.MILLISECONDS);
    }
}
