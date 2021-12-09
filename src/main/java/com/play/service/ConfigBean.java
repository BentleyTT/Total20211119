package com.play.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.play.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigBean {

    public ConfigBean() {
        System.out.println("2");
        System.out.println("hot-fix");
        System.out.println("zhuxina1");
        System.out.println("hot-fix2");
        System.out.println("66666666666");
        System.out.println("77777777");
    }
}
