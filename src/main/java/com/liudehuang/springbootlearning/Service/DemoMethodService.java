package com.liudehuang.springbootlearning.Service;

import org.springframework.stereotype.Service;

/**
 * 方法式切面实例
 */
@Service
public class DemoMethodService {

    public void add(){
        System.out.println("demoMethodService的add方法");
    }
}
