package com.www.javapractice.concurrentprograming.aqsandcas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Application Name : CASDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.24 20:05
 * @Version : v1.0
 */
public class CASDemo {

    private volatile static int m = 0;

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void increase() {
        m++;
    }

    public static void increase2() {
        atomicInteger.incrementAndGet();
    }


    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread() {
                @Override
                public void run() {
                    increase();
                }
            };
        }


        Thread[] threads2 = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads2[i] = new Thread() {
                @Override
                public void run() {
                    increase2();
                }
            };
        }

        for (int i = 0; i < 20; i++) {
            threads[i].start();

            // join方法，  加入到当前的线程组group  main  join线程有了交互性
            threads[i].join();
            threads2[i].start();
            threads2[i].join();
        }

        System.out.println(m);

        System.out.println(atomicInteger.get());

    }


}
