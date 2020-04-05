package com.www.javapractice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>Application Name : Test </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.03 08:41
 * @Version : v1.0
 */
public class Test {

    public static void main(String[] args) {
//        OrderDao proxy = (OrderDao) ProxyUtil.newInstance(new OrderDaoImpl());
//        proxy.update("AAA");

        OrderDao jdkProxy = (OrderDao) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{OrderDao.class}, new MyInvocationHandler(new OrderDaoImpl()));
        jdkProxy.update("query");

    }

}
