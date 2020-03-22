package com.www.javapractice.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>Application Name : ThreadDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 09:21
 * @Version : v1.0
 */
public class ThreadDemo {

    static ReentrantLock lock = new ReentrantLock(false);

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                callM();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                callM();
            }
        };
        t1.setName("t1");
        t2.setName("t2");

        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main");

        t2.interrupt();

    }

    public static void callM() {
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {

            System.out.println(Thread.currentThread().getName() + " is interupted.");

            e.printStackTrace();
        }

        try {
            Thread.sleep(200000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.unlock();
    }

}
