package com.www.javapractice.concurrentprograming.concurrentc;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * <p>Application Name : BlockingDequeDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.27 08:23
 * @Version : v1.0
 */
public class BlockingDequeDemo {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<String> list = new LinkedBlockingDeque<>();

        Thread t = new Thread(() ->{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    String s = new String(j+"");

                    try {
                        list.put(s);
                        System.out.println(s + new String(String.valueOf(new Date())));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t.start();


        System.out.println("================");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                String s = list.take();
            }
        }


        System.out.println("End");

    }

}
