package com.www.javapractice.annot.entity;

import com.www.javapractice.annot.anno.Entity;

/**
 * <p>Application Name : City </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.31 21:41
 * @Version : v1.0
 */
@Entity(value = "city")
public class City {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
