package com.www.javapractice.concurrentprograming.volatiler;

import java.util.concurrent.TimeUnit;

/**
 * <p>Application Name : ReaderAndUpdater </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 16:59
 * @Version : v1.0
 */
public class ReaderAndUpdater {

    private final static int MAX = 50;

    private static /*volatile*/ int init = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            int l = init;
            while (l < MAX) {
                if (l != init) {
                    System.out.println("Reader==============:" + init);
                    l = init;
                }
            }
        }, "Reader").start();


        new Thread(() -> {
            int l = init;
            while (l < MAX) {
                if (l < MAX) {
                    l++;
                    System.out.println("Update==============:" + l);
                    init = l;
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Update").start();
    }

}
