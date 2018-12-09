package com.liudehuang.springbootlearning.listener;

import com.liudehuang.springbootlearning.event.DemoEvent;
import org.springframework.context.ApplicationListener;

/**
 * 定义事件监听器，实现ApplicationListener
 * 实现ApplicationListener接口，并指定监听的事件类型
 * 使用onApplicationEvent对消息进行接受处理
 */
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMessage();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息："+msg);
    }
}
