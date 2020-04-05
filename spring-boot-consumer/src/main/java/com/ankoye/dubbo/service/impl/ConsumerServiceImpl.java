package com.ankoye.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ankoye.dubbo.service.ConsumerService;
import com.ankoye.dubbo.service.ProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    /**
     * url = "127.0.0.1:20881" 直连方式，可以避开注册中心
     * loadbalance = "xxx", 负载均衡方式
     * timeout 超时
     * retries 1 重试1次
     *  幂等性（删、改、查）可以开启重试
     *  非幂等性（增）不可以开启重试
     */
    @Reference(timeout = 1000, retries = 1)
    ProviderService providerService;

    @Override
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String testHello() {
        return providerService.sayHello();
    }

    public String helloFallback() {
        return "出错了，兜底方法";
    }
}
