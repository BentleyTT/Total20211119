package com.play.service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserSer {

    public void add(){
        System.out.println("add方法执行了");
    }

    public void update(){
        System.out.println("update方法执行了");
    }

}
