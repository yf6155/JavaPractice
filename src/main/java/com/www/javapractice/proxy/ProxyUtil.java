package com.www.javapractice.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * <p>Application Name : ProxyUtil </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.03 08:06
 * @Version : v1.0
 */
public class ProxyUtil {

    /**
     * 内容
     * .java
     * .class
     * new
     */
    public static Object newInstance(Object target) {

        Class targetInf = target.getClass().getInterfaces()[0];

        String line = "\n";
        String tab = "\t";

        String packageInfo = "package com.www;" + line;
        String importInfo = "import " + targetInf.getName() + ";" + line;
        String classFirstLineInfo = "public class $Proxy implements " + targetInf.getSimpleName() + "{" + line;
        String fieldInfo = tab + "private " + targetInf.getSimpleName() + " target;" + line;
        String construInfo = tab + "public $Proxy(" + targetInf.getSimpleName() + " target){" + line
                + tab + tab + "this.target = target;" + line
                + tab + "}" + line;

        Method[] methods = target.getClass().getDeclaredMethods();
        String methodInfo = "";
        for (Method method : methods) {
            String returnTypeName = method.getReturnType().getSimpleName();
            String methodName = method.getName();

            Class[] args = method.getParameterTypes();
            String argsInfo = "";
            String paramsInfo = "";
            int pn = 0;
            for (Class arg : args) {
                String temp = arg.getSimpleName();

                argsInfo += temp + " p" + pn + ",";
                paramsInfo += "p" + pn + ",";
                pn++;
            }

            if (argsInfo.length() > 0) {
                argsInfo = argsInfo.substring(0, argsInfo.lastIndexOf(",") - 1);
                paramsInfo = paramsInfo.substring(0, paramsInfo.lastIndexOf(",") - 1);
            }

            methodInfo += tab + "public " + returnTypeName + " " + methodName + "(" + argsInfo + "){" + line
                    + tab + tab + "System.out.println(\"log\");" + line;
            if ("void".equals(returnTypeName)) {
                methodInfo += tab + tab + "target." + methodName + "(" + paramsInfo + ");" + line
                        + tab + "}" + line;
            } else {
                methodInfo += tab + tab + "return target." + methodName + "(" + paramsInfo + ");" + line
                        + tab + "}" + line;
            }
        }

        String content = packageInfo + importInfo + classFirstLineInfo + fieldInfo + construInfo + methodInfo + "}";

        File f = new File("D:\\com\\www\\$Proxy.java");

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f);
            fw.write(content);
            fw.flush();
            fw.close();


            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileManager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
            t.call();
            fileManager.close();

            URL[] urls = new URL[]{new URL("file:D:\\\\")};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class clazz = urlClassLoader.loadClass("com.www.$Proxy");
            Constructor constructor = clazz.getConstructor(targetInf);

            return constructor.newInstance(target);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }


}
