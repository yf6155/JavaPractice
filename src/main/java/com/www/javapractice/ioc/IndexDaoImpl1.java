package com.www.javapractice.ioc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>Application Name : IndexDaoImpl </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.28 21:08
 * @Version : v1.0
 */
@Component
@Profile("dao2")
public class IndexDaoImpl1 implements IndexDao {
    @Override
    public void test() {
        System.out.println("Impl1");
    }
}
