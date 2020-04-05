package com.www.javapractice.aop.proxy;

import com.www.javapractice.aop.dao.Dao;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * <p>Application Name : ProxyTest </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.01 16:16
 * @Version : v1.0
 */
public class ProxyTest {
    public static void main(String[] args) throws IOException {
        Class clazz[] = new Class[]{Dao.class};
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                "proxyClass", clazz);

        File f = new File("E:\\Proxy.class");

        FileOutputStream fs = new FileOutputStream(f);
        fs.write(proxyClassFile);
        fs.flush();
        fs.close();
    }

}
