package com.www.javapractice.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Application Name : IndexService </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 21:09
 * @Version : v1.0
 */
@Service("service")
public class IndexService {


    @Autowired
    private IndexDao dao2;


    public void query() {
        dao2.test();
    }

}
