package com.AdderSubtractor_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.Inheritance.A;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();// Share Count Variable.
        Lock lock = new ReentrantLock();// This is Lock Created.

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + count.value);
    }

}
