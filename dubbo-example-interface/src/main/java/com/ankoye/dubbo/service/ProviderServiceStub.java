package com.ankoye.dubbo.service;

public class ProviderServiceStub implements ProviderService{
    public final ProviderService providerService;

    public ProviderServiceStub(ProviderService providerService) {
        super();
        this.providerService = providerService;
    }

    @Override
    public String sayHello() {
        // 参数验证等，这
        System.out.println("进入本地存根");
        if(/* 验证通过 */ true) {
            return providerService.sayHello();
        }
        return null;
    }
}
