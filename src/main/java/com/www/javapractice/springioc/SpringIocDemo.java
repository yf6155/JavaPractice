package com.www.javapractice.springioc;

import com.www.javapractice.springioc.service.ServiceImpl;
import com.www.javapractice.springioc.util.BeanFactory;

/**
 * <p>Application Name : SpringIocDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 13:54
 * @Version : v1.0
 */
public class SpringIocDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.parseXml("springioc.xml");

        ServiceImpl service = (ServiceImpl) beanFactory.getBean("service");

        service.query();
    }


}
