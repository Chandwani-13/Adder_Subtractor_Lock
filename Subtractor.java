package com.AdderSubtractor_Lock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (long i = 0; i < 1000000; i++) {
            this.count.value -= 1;
        }
        lock.unlock();
    }

}
