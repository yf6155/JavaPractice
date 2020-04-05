package com.www.javapractice.ioc;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.beans.Introspector;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * <p>Application Name : BeanNameGeneratorDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.29 12:48
 * @Version : v1.0
 */
public class BeanNameGeneratorDemo implements BeanNameGenerator {
    @Override
    public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
        if (beanDefinition instanceof AnnotatedBeanDefinition) {
            String beanName = this.determineBeanNameFromAnnotation((AnnotatedBeanDefinition)beanDefinition);
            if (StringUtils.hasText(beanName)) {
                return beanName;
            }
        }
        return "my"+buildDefaultBeanName(beanDefinition);
    }

    protected String determineBeanNameFromAnnotation(AnnotatedBeanDefinition annotatedDef) {
        AnnotationMetadata amd = annotatedDef.getMetadata();
        Set<String> types = amd.getAnnotationTypes();
        String beanName = null;
        Iterator var5 = types.iterator();

        while(var5.hasNext()) {
            String type = (String)var5.next();
            AnnotationAttributes attributes =  AnnotationAttributes.fromMap(amd.getAnnotationAttributes(type, false));
            if (attributes != null && this.isStereotypeWithNameValue(type, amd.getMetaAnnotationTypes(type), attributes)) {
                Object value = attributes.get("value");
                if (value instanceof String) {
                    String strVal = (String)value;
                    if (StringUtils.hasLength(strVal)) {
                        if (beanName != null && !strVal.equals(beanName)) {
                            throw new IllegalStateException("Stereotype annotations suggest inconsistent component names: '" + beanName + "' versus '" + strVal + "'");
                        }

                        beanName = strVal;
                    }
                }
            }
        }

        return "my"+beanName;
    }

    protected boolean isStereotypeWithNameValue(String annotationType, Set<String> metaAnnotationTypes, @Nullable Map<String, Object> attributes) {
        boolean isStereotype = annotationType.equals("org.springframework.stereotype.Component") || metaAnnotationTypes.contains("org.springframework.stereotype.Component") || annotationType.equals("javax.annotation.ManagedBean") || annotationType.equals("javax.inject.Named");
        return isStereotype && attributes != null && attributes.containsKey("value");
    }

    protected String buildDefaultBeanName(BeanDefinition definition) {
        String beanClassName = definition.getBeanClassName();
        Assert.state(beanClassName != null, "No bean class name set");
        String shortClassName = ClassUtils.getShortName(beanClassName);
        return Introspector.decapitalize(shortClassName);
    }
}
