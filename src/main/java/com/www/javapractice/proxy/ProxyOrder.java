package com.www.javapractice.proxy;

/**
 * <p>Application Name : ProxyOrder </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.03 08:11
 * @Version : v1.0
 */
public class ProxyOrder {

    public OrderDao orderDao;

    public ProxyOrder(OrderDao orderDao){
        this.orderDao = orderDao;
    }



}
