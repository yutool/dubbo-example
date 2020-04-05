package com.ankoye.dubbo.controller;

import com.ankoye.dubbo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/testSayHello")
    public String sayHello() {
        return consumerService.testHello();
    }
}
