package com.www.javapractice.annot.util;


import com.www.javapractice.annot.anno.Entity;

import java.lang.annotation.Annotation;

/**
 * <p>Application Name : CommonUtil </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.31 21:42
 * @Version : v1.0
 */
public class CommonUtil {

    public static String buildSql(Object obj){

        Class clazz = obj.getClass();

        if(clazz.isAnnotationPresent(Entity.class)){
            Entity entity = (Entity) clazz.getAnnotation(Entity.class);
            System.out.println(entity.value());
        }

        return "";
    }

}
