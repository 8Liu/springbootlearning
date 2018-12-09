package com.liudehuang.springboot_core.condition.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Conditional注解里的参数Condition的实现类
 * 为了
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String osName = context.getEnvironment().getProperty("os.name");
        if(osName.contains("Windows")){
            return true;
        }
        return false;
    }
}
