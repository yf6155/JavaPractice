package com.www.javapractice.concurrentprograming.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>Application Name : SinglePoolDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 10:31
 * @Version : v1.0
 */
public class SinglePoolDemo {

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        //创建线程
        for (int i = 0; i < 10; i++) {
            //创建任务
            Runnable task = new TaskDemo();

            //把任务交给线程池
            es.execute(task);
        }
    }
}
