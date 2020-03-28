package com.www.javapractice.concurrentprograming.concurrentc;

import java.util.concurrent.TimeUnit;

/**
 * <p>Application Name : Demo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.25 20:04
 * @Version : v1.0
 */
public class MyLockTest {

    private MyLock myLock = new MyLock();

    private int m = 0;

    public int next() {

        myLock.lock();
        try {
            return m++;
        } finally {
            myLock.unlock();
        }
    }

    public static void main(String[] args) {
        MyLockTest demo = new MyLockTest();

        Thread[] t = new Thread[2];

        for (int i = 0; i < 2; i++) {
            t[i] = new Thread(() -> {
                System.out.println(demo.next());
            });

            t[i].setName("Name" + i);

            t[i].start();
        }

    }

}
