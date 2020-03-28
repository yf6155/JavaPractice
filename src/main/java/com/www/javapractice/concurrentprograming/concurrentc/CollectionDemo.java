package com.www.javapractice.concurrentprograming.concurrentc;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * <p>Application Name : CollectionDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.27 08:12
 * @Version : v1.0
 */
public class CollectionDemo {


    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedDeque<String> list = new ConcurrentLinkedDeque();

        Thread[] add = new Thread[100];
        for (int i = 0; i < 100; i++) {
            add[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add(Thread.currentThread().getName() + " Element " + j);
                }
            }, "Thread  add " + i);

            add[i].start();
            add[i].join();
        }

        System.out.println("Before list size " + list.size());

        Thread[] poll = new Thread[100];
        for (int i = 0; i < 100; i++) {
            poll[i] = new Thread(() -> {
                for (int j = 0; j < 500; j++) {
                    list.pollLast();
                    list.pollFirst();
                }
            }, "Thread Poll " + i);

            poll[i].start();
            poll[i].join();
        }

        System.out.println("After list size " + list.size());

    }

}
