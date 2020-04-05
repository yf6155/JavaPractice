package com.www.javapractice.springioc.service;

import com.www.javapractice.springioc.dao.IndexDao;

/**
 * <p>Application Name : ServiceImpl </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 13:51
 * @Version : v1.0
 */
public class ServiceImpl {

    private IndexDao indexDao;

    public void query(){
        indexDao.query();
    }

}
