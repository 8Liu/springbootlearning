package com.liudehuang.springbootlearning.aop.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)//注解在方法上使用
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
