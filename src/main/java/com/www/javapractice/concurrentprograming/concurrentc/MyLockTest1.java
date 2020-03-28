package com.www.javapractice.concurrentprograming.concurrentc;

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
public class MyLockTest1 {

    private MyLock myLock = new MyLock();

    private int m = 0;

    private void a() {
        myLock.lock();
        System.out.println("a");
        b();
        myLock.unlock();
    }

    private void b() {
        myLock.lock();
        System.out.println("b");
        myLock.unlock();
    }

    public static void main(String[] args) {
        MyLockTest1 demo = new MyLockTest1();

        new Thread(() -> {
            demo.a();
        }).start();

    }

}
