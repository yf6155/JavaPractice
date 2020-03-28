package com.www.javapractice.concurrentprograming.singletones;

/**
 * <p>Application Name : EnumSingletone </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 20:46
 * @Version : v1.0
 */
public class EnumSingletone {

    private enum EnumSingletoneHolder {
        INSTANCE;
        private EnumSingletone instance;

        EnumSingletoneHolder() {
            instance = new EnumSingletone();
        }
    }

    private static EnumSingletone getInstance() {
        return EnumSingletoneHolder.INSTANCE.instance;
    }

}
