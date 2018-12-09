package com.liudehuang.springboot_core.enable.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liudehuang
 * @date 2018/12/9 9:48
 */
public class PersonSelector implements ImportSelector, BeanFactoryAware {


    private BeanFactory beanFactory;
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     * 选择并返回哪个bean需要被注入到容器中，通过@{@link Configuration}注解
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
        System.out.println(beanFactory);
        return new String[]{EnableConfig.class.getName()};
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
