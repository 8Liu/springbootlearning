package com.liudehuang.springbootlearning.aop.aspectj;

import com.liudehuang.springbootlearning.aop.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspectj {
    @Pointcut("@annotation(com.liudehuang.springbootlearning.aop.annotation.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        //获取方法签名
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截："+annotation.name());
    }

    /**
     * execution 方法拦截
     * @param joinPoint
     */
    @Before("execution(* com.liudehuang.springbootlearning.Service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截："+method.getName());
    }


}
