package com.liudehuang.springboot_core.condition.config;

import com.liudehuang.springboot_core.condition.service.LinuxListService;
import com.liudehuang.springboot_core.condition.service.ListService;
import com.liudehuang.springboot_core.condition.service.WindowListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxListService(){
        return new LinuxListService();
    }
}
