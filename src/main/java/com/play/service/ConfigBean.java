package com.play.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.play.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigBean {

    public ConfigBean() {
    }
}
