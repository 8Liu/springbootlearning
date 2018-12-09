package com.liudehuang.springboot_core.enable.config;

import com.liudehuang.springboot_core.enable.entity.Animal;
import com.liudehuang.springboot_core.enable.entity.Person;
import org.springframework.context.annotation.*;

/**
 * @author liudehuang
 * @date 2018/12/9 9:38
 * @Enable*原理
 * 这些注解都通过@import注解来注入配置类，从而实现自动配置，有三种实现方式。
 * 1、直接导入配置类，通过@Import注解{@link Configuration}
 * 2、依据条件选择配置类{@link ImportSelector} 实现ImportSelector接口
 * 3、动态注入bean{@link ImportBeanDefinitionRegistrar}实现ImportBeanDefinitionRegistrar接口
 * 常用的@Enable*注解
 * @EnableAspectJAutoProxy:开启对AspectJ自动代理的支持
 * @EnbaleAsync:开启异步方法的支持
 * @EnableScheduling:开启计划任务的支持
 * @EnableWebMvc:开启web mvc的支持
 * @EnableConfigurationProperties:开启对@ConfigurationProperties注解配置Bean的支持
 * @EnableJpaRepositories:开启对Spring Date JPA Respository的支持
 * @EnableTransactionManagement开启注解式事务的支持
 * @EnableCaching:开启注解式的缓存支持
 */
@Configuration
@Import({PersonBeanDefinitionRegistrar.class})
public class EnableConfig {
    @Bean
    public Animal animal(){
        return new Animal();
    }

    @Bean
    public Person person(){
        return new Person();
    }
}
