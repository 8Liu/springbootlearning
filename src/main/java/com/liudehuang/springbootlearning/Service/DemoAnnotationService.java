package com.liudehuang.springbootlearning.Service;

import com.liudehuang.springbootlearning.aop.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * 注解式切面实例
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){
        System.out.println("demoAnnotationService的add方法");
    }
}
