package com.www.javapractice.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Application Name : Test </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 21:11
 * @Version : v1.0
 */
public class Test {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dao2");
        context.register(Spring.class);
        context.refresh();

//        IndexService service = (IndexService) context.getBean("myservice");

        //IndexService service = (IndexService) context.getBean(IndexService.class);

//        service.query();

        System.out.println(context.getBean(IndexDao.class).getClass().getName());
    }

}
