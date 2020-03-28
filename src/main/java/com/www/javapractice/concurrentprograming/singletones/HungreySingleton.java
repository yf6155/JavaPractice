package com.www.javapractice.concurrentprograming.singletones;

/**
 * <p>Application Name : HungreySingleton </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 19:49
 * @Version : v1.0
 */
public class HungreySingleton {
    // 加载的时候就产生了实例对象，Classloader
    private static HungreySingleton instance = new HungreySingleton();

    public static HungreySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(HungreySingleton.getInstance());
                }
            }).start();
        }
    }
}
