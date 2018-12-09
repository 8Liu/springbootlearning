package com.liudehuang.springboot_core.annotation;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获取的bean");
    }
}
