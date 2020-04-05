package com.ankoye.dubbo.config;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.ankoye.dubbo.service.ProviderService;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

    /**
     * 一个dubbo:xxx 对应 xxxConfig
     */
    // @Bean
    ServiceConfig<ProviderService> providerServiceConfig(ProviderService providerService) {
        ServiceConfig<ProviderService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(ProviderService.class);
        serviceConfig.setRef(providerService);
        serviceConfig.setVersion("1.0.0");

        // 配置method属性
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("sayHello");
        methodConfig.setTimeout(1000);

        serviceConfig.setMethods(Lists.newArrayList(methodConfig));

        return serviceConfig;
    }
}
