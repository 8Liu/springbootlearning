package com.liudehuang.springbootlearning.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 1、利用EnableAsync注解开启异步任务支持
 * 2、配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor,
 *   这样我们就获得了一个基于线程池的TaskExecutor
 */
@Configuration
@ComponentScan("com.liudehuang.springbootlearning")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(5);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
