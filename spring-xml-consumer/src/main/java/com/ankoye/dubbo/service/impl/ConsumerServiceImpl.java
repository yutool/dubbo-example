package com.ankoye.dubbo.service.impl;

import com.ankoye.dubbo.service.ConsumerService;
import com.ankoye.dubbo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    /**
     * 注入步骤：
     * 1.将服务提供者注册到注册中心
     *  引入Dubbo依赖 2.6.5
     *  引入Dubbo zookeeper的连接jar
     * 2.让服务消费者去注册中心订阅服务提供者的服务地址
     */
    @Autowired
    ProviderService providerService;

    @Override
    public String testHello() {
        return providerService.sayHello();
    }
}
