package com.www.javapractice.concurrentprograming.singletones;

/**
 * <p>Application Name : HongSingletone </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 20:02
 * @Version : v1.0
 */
public class HongSynSingletone01 {

    private static HongSynSingletone01 instance = null;

    public static HongSynSingletone01 getInstance() {
        if (instance == null) {
            synchronized (HongSynSingletone01.class) {
                if (instance == null) {
                    instance = new HongSynSingletone01();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(HongSynSingletone01.getInstance());
                }
            }).start();
        }

    }
}
