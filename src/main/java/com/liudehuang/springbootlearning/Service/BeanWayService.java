package com.liudehuang.springbootlearning.Service;

/**
 * bean的初始化和销毁
 * java配置方式
 * 使用bean的initMethod和destoryMethod(相当于xml配置的init-method和destory-method)
 */
public class BeanWayService {
    /**
     * 在构造函数之后执行
     */
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    /**
     * 在bean销毁之前执行
     */
    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
