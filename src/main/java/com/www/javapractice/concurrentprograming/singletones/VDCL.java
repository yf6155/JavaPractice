package com.www.javapractice.concurrentprograming.singletones;

import java.net.Socket;
import java.sql.Connection;

/**
 * <p>Application Name : VDCL </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 20:29
 * @Version : v1.0
 */
public class VDCL {

    Connection connection;
    Socket socket;

    private static volatile VDCL instance = null;

    public static VDCL getInstance() {
        if (instance == null) {
            synchronized (VDCL.class) {
                if (instance == null) {
                    instance = new VDCL();
                }
            }
        }
        return instance;
    }

}
