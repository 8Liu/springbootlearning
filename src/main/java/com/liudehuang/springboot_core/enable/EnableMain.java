package com.liudehuang.springboot_core.enable;

import com.liudehuang.springboot_core.enable.config.AppConfig;
import com.liudehuang.springboot_core.enable.config.EnableConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liudehuang
 * @date 2018/12/9 9:40
 */
public class EnableMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnableConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String bean:beanDefinitionNames){
            System.out.println(bean);
        }
    }
}
