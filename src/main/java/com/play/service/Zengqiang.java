package com.play.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Zengqiang {

    @Around(value = "execution(* com.play.*.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("前校验");
        proceedingJoinPoint.proceed();
        System.out.println("后校验");

    }

}
