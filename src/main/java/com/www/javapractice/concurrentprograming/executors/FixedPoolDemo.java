package com.www.javapractice.concurrentprograming.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>Application Name : FixedPoolDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 10:21
 * @Version : v1.0
 */
public class FixedPoolDemo {
    public static void main(String[] args) {
        //创建固定大小的线程池
        ExecutorService es = Executors.newFixedThreadPool(5);

        //创建线程
        for (int i = 0; i < 10; i++) {
            //创建任务
            Runnable task = new TaskDemo();

            //把任务交给线程池
            es.execute(task);
        }

        //关闭
        es.shutdown();

        // 所有线程是否都运行完了
        while(!es.isTerminated()){
            // LOGIC
        }

        System.out.println("Finish");

    }

}
