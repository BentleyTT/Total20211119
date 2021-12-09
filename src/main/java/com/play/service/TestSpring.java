package com.play.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "com.play.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class TestSpring {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
        UserSer userService = (UserSer) applicationContext.getBean("userService",UserService.class);
        userService.add();
        userService.update();

    }

}
