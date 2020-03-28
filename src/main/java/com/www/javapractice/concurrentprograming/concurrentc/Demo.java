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
public class Demo {

    private int m = 0;

    public int next() {

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return m++;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        Thread[] t = new Thread[20];

        for (int i = 0; i < 20; i++) {
            t[i] = new Thread(() -> {
                System.out.println(demo.next());
            });

            t[i].start();
        }

    }

}
