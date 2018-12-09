package com.liudehuang.springbootlearning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 通过@EnableScheduling注解开启对计划任务的支持
 */
@Configuration
@ComponentScan("com.liudehuang.springbootlearning")
@EnableScheduling
public class TaskSchedulerConfig {
}
