package com.ankoye.dubbo.service.impl;

import com.ankoye.dubbo.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl2 implements ProviderService {
    @Override
    public String sayHello() {
        return "xml-provider say hello version2 ";
    }
}
