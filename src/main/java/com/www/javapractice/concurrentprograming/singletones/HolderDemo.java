package com.www.javapractice.concurrentprograming.singletones;

/**
 * <p>Application Name : HolderDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 20:33
 * @Version : v1.0
 */
public class HolderDemo {

    private static class Holder {
        private static HolderDemo instance = new HolderDemo();
    }

    public static HolderDemo getInstance() {
        return Holder.instance;
    }

}
