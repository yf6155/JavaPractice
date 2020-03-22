package com.www.javapractice.concurrentprograming.jvmandjmm;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>Application Name : TickyGenerator </p>
 * <p>Application Description : 叫号程序 </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.21 17:43
 * @Version : v1.0
 */
public class TickyGenerator {

    private static volatile int tickyNo = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("t1 call no is " + callNo());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("t2 call no is " + callNo());
                }
            }
        });

        t1.start();
        t2.start();

    }

    private static int callNo() {
        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        tickyNo++;
        lock.unlock();
        return tickyNo;
    }


}
