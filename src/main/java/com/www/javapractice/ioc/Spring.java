package com.www.javapractice.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>Application Name : Spring </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.29 11:26
 * @Version : v1.0
 */
@Configuration
@ComponentScan(basePackages = "com.www.javapractice.ioc" /*,nameGenerator = BeanNameGeneratorDemo.class*/)
@ImportResource(locations = "classpath:spring.xml")
public class Spring {
}
