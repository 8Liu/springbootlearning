package com.liudehuang.springboot_core.enable.config;

import com.liudehuang.springboot_core.enable.entity.Food;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liudehuang
 * @date 2018/12/9 10:22
 * 动态注册bean
 */
public class PersonBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata:获取当前配置类上的注解
     * BeanDefinitionRegistry:向容器中注入bean
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean person = registry.containsBeanDefinition("person");
        if(person){
            RootBeanDefinition beanDefinition = new RootBeanDefinition();
            beanDefinition.setBeanClass(Food.class);
            registry.registerBeanDefinition("food",beanDefinition);
        }

    }
}
