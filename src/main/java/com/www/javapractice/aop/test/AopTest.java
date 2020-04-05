package com.www.javapractice.aop.test;

import com.www.javapractice.aop.config.AppConfig;
import com.www.javapractice.aop.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Application Name : AopTest </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.01 08:57
 * @Version : v1.0
 */
public class AopTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(AppConfig.class);

        IndexDao indexDao = a.getBean(IndexDao.class);

        indexDao.query(1);
    }

}
