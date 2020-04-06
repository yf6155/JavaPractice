package com.www.javapractice.beanfandfbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Application Name : TestDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 21:36
 * @Version : v1.0
 */
public class TestDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        // getBean("beanName")返回的是getObject()方法返回的对象
        System.out.println(annotationConfigApplicationContext.getBean("serviceFactoryBean"));

        // getBean("&beanName")返回的是当前对象
        System.out.println(annotationConfigApplicationContext.getBean("&serviceFactoryBean"));


        RealFactoryBean temp = (RealFactoryBean) annotationConfigApplicationContext.getBean("serviceFactoryBean");
        System.out.println(temp.getMsg1());

    }
}
