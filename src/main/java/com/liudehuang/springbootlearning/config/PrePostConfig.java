package com.liudehuang.springbootlearning.config;

import com.liudehuang.springbootlearning.Service.BeanWayService;
import com.liudehuang.springbootlearning.Service.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.liudehuang.springbootlearning")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
