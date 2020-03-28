package com.www.javapractice.concurrentprograming.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * <p>Application Name : ScheduledThreadPoolDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 10:32
 * @Version : v1.0
 */
public class ScheduledThreadPoolDemo {

    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);

        //创建线程
        for (int i = 0; i < 10; i++) {
            //创建任务
            Runnable task = new TaskDemo();

            //把任务交给线程池
            pool.execute(task);
        }
    }

}
