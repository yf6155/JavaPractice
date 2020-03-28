package com.www.javapractice.concurrentprograming.aqsandcas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

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
public class CASDemo2 {

    private volatile static int m = 0;

    private static AtomicInteger atomicInteger = new AtomicInteger(100);

    private static AtomicStampedReference asr = new AtomicStampedReference(100, 1);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            atomicInteger.compareAndSet(100, 110);
            System.out.println("T1 " + atomicInteger.get());
        });
        t1.start();


        Thread t2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            atomicInteger.compareAndSet(110, 100);
            System.out.println("T2 " + atomicInteger.get());
        });
        t2.start();


        Thread t3 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            atomicInteger.compareAndSet(100, 120);
            System.out.println("T3 " + atomicInteger.get());
        });
        t3.start();

        System.out.println("=======================");


        Thread t4 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            boolean b1 = asr.compareAndSet(100, 110, asr.getStamp(), asr.getStamp() + 1);
            System.out.println("T4 b1 " + b1 + asr.getStamp());
            boolean b2 = asr.compareAndSet(110, 100, asr.getStamp(), asr.getStamp() + 1);
            System.out.println("T4 b2 " + b2 + asr.getStamp());
        });
        t4.start();

        Thread t5 = new Thread(() -> {
            int stamp = asr.getStamp();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            boolean b5 = asr.compareAndSet(100, 120, stamp, stamp + 1);
            System.out.println("T5 b5 " + b5 + asr.getStamp());
        });
        t5.start();

    }


}
