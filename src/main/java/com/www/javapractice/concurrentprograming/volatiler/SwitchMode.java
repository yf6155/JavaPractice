package com.www.javapractice.concurrentprograming.volatiler;

/**
 * <p>Application Name : SwitchMode </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 18:13
 * @Version : v1.0
 */
public class SwitchMode extends Thread {
    private volatile boolean flag = false;

    @Override
    public void run() {
        while (flag) {
            // TO DO JOB
        }
    }

    public void shutDown() {
        flag = false;
    }
}
