package com.www.javapractice.concurrentprograming.volatiler;

/**
 * <p>Application Name : Singletone </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 18:16
 * @Version : v1.0
 */
public class Singletone {

    private volatile static Singletone singletone;

    public static Singletone getInstance() {
        if (singletone == null) {
            synchronized (Singletone.class) {
                if (singletone == null) {
                    singletone = new Singletone();
                }
            }
        }
        return singletone;
    }
}
