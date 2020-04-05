package com.www.javapractice.proxy;

/**
 * <p>Application Name : OrderDaoImpl </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.03 08:10
 * @Version : v1.0
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void query() {
        System.out.println("模拟查询数据库");
    }

    @Override
    public String update(String str) {
        System.out.println("模拟更新数据库");
        return str;
    }
}
