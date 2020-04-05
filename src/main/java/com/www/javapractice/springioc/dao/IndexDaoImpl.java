package com.www.javapractice.springioc.dao;

/**
 * <p>Application Name : IndexDaoImpl </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 13:50
 * @Version : v1.0
 */
public class IndexDaoImpl implements IndexDao {
    @Override
    public void query() {
        System.out.println("IndexDaoImpl query method.");
    }
}
