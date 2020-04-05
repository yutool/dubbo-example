package com.ankoye.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ankoye.dubbo.service.ProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

@Service // com.alibaba.dubbo.config.annotation.Service
@Component
public class ProviderServiceImpl implements ProviderService {
    @Override
    @HystrixCommand
    public String sayHello() {
        if (Math.random() > 0.5) {
            throw new RuntimeException("模拟异常");
        }
        return "boot-provider say hello";
    }
}
