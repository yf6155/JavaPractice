package com.www.javapractice.concurrentprograming.executors;

import java.util.concurrent.TimeUnit;

/**
 * <p>Application Name : TaskDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 10:21
 * @Version : v1.0
 */
public class TaskDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Running.");
        try {

            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
