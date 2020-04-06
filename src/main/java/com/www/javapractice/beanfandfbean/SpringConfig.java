package com.www.javapractice.beanfandfbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>Application Name : SpringConfig </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 21:36
 * @Version : v1.0
 */
@Configuration
@ComponentScan("com.www.javapractice.beanfandfbean")
@ImportResource("classpath:springBean.xml")
public class SpringConfig {
}
