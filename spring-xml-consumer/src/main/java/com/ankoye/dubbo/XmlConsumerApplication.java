package com.ankoye.dubbo;

import com.ankoye.dubbo.service.ConsumerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConsumerApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ConsumerService consumerService = context.getBean(ConsumerService.class); // 获取远程服务代理
        System.out.println( consumerService.testHello() ); // 显示调用结果
        System.in.read();
    }
}
