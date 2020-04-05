package com.ankoye.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlProviderApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
