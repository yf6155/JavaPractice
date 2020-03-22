package com.www.javapractice.concurrentprograming.syncronized;


import java.util.concurrent.TimeUnit;

/**
 * <p>Application Name : SyncronDemo01 </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.21 19:03
 * @Version : v1.0
 */
public class SyncronDemo01 {

    // syncronized修改静态方法
    public synchronized static void accessResourece() {
        try {
            TimeUnit.SECONDS.sleep(2);

            System.out.println(Thread.currentThread().getName() + " is running");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void accessResourece1() {
        try {
            TimeUnit.MINUTES.sleep(2);

            System.out.println(Thread.currentThread().getName() + " is running");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void accessResourece2() {
        synchronized (this) {
            try {
                TimeUnit.MINUTES.sleep(2);

                System.out.println(Thread.currentThread().getName() + " is running");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SyncronDemo01 demo01 = new SyncronDemo01();
        for (int i = 0; i < 5; i++) {
            new Thread(demo01::accessResourece1).start();
        }
    }

}

