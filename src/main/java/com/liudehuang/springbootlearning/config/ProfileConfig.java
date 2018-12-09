package com.liudehuang.springbootlearning.config;

import com.liudehuang.springbootlearning.entity.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
public class ProfileConfig {
    /**
     * 当profile为dev实例化下面bean
     * @return
     */
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    /**
     * 当环境为prod时实例化一下bean
     * @return
     */
    @Bean
    @Profile("prod")
    public DemoBean proDemoBean(){
        return new DemoBean("from production profile");
    }
}
