package com.liudehuang.springbootlearning.publisher;

import com.liudehuang.springbootlearning.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 注入ApplicationContext用来发布事件
 * 使用ApplicationContext的publishEvent方法来发布
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

}
