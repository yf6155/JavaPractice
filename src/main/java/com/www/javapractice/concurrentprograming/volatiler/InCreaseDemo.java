package com.www.javapractice.concurrentprograming.volatiler;

/**
 * <p>Application Name : InCreaseDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 17:54
 * @Version : v1.0
 */
public class InCreaseDemo {

    static volatile int m = 0;
    static Object object = new Object();

    public synchronized static void inCrease() {
        m++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    inCrease();
                }
            }).start();
        }

        System.out.println(m);
    }

}
