package com.liudehuang.springbootlearning.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Bean的初始化和销毁
 * 注解方式：利用jsr-250的@PostConstruct和@PreDestroy
 */
public class JSR250WayService {
    /**
     * 在构造函数之后执行
     */
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-jsr250WayService");
    }

    /**
     * 在bean销毁之前执行
     */
    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
