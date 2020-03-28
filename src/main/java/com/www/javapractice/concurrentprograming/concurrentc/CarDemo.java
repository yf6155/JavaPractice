package com.www.javapractice.concurrentprograming.concurrentc;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * <p>Application Name : CarDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.26 21:01
 * @Version : v1.0
 */
public class CarDemo {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(5);

        Thread[] car = new Thread[10];

        for (int i = 0; i < 10; i++) {

            // 申请资源
            car[i] = new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(2);

                    s.acquire();

                    System.out.println(Thread.currentThread() + " 进人停车场");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                // 使用资源
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //释放资源
                s.release();
                System.out.println(Thread.currentThread() + " 离开停车场");

            },"car"+i);

            car[i].start();
        }

    }




}
