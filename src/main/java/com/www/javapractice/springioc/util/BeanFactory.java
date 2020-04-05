package com.www.javapractice.springioc.util;

import com.www.javapractice.lock.entity.Obj;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <p>Application Name : BeanFactory </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 13:55
 * @Version : v1.0
 */
public class BeanFactory {

    private Map<String, Object> map = new HashMap<String, Object>();

    public Object getBean(String beanName) {
        return map.get(beanName);
    }

    public void parseXml(String xml) {
        String path = this.getClass().getResource("/").getPath() + xml;
        //String path = "src/main/resources/springioc.xml";
        File f = new File(path);
        SAXReader reader = new SAXReader();
        try {
            // 读取xml
            Document document = reader.read(f);

            // 解析文件
            Element root = document.getRootElement();

            // iterate through child elements of root
            for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
                // bean
                Element element = it.next();
                Attribute attributeId = element.attribute("id");
                String beanName = attributeId.getValue();

                Attribute attributeClass = element.attribute("class");
                String beanClassName = attributeClass.getValue();

                // 实例化对象
                Object bean = null;
                try {
                    bean = Class.forName(beanClassName).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                // 判断是否还有子节点,属性注入
                for (Iterator<Element> beanInner = element.elementIterator(); beanInner.hasNext(); ) {
                    Element p = beanInner.next();
                    // <property name="indexDao" ref="indexDao"></property>
                    if (p.getName().equals("property")) {
                        Attribute APName = p.attribute("name");
                        String fName = APName.getValue();

                        Attribute APRef = p.attribute("ref");
                        String refName = APRef.getValue();

                        Object injectObj = map.get(refName);

                        Field filed = bean.getClass().getDeclaredField(fName);
                        filed.setAccessible(true);
                        filed.set(bean, injectObj);
                    }
                }

                map.put(beanName, bean);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(map);

    }

}
