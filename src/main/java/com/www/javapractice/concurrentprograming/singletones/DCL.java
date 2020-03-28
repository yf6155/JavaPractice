package com.www.javapractice.concurrentprograming.singletones;

/**
 * <p>Application Name : DCL </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 20:18
 * @Version : v1.0
 */
public class DCL {

    private static DCL instance = null;

    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

}
