package com.liudehuang.springbootlearning.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件，继承ApplicationEvent
 */
public class DemoEvent extends ApplicationEvent {

    private String message;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source,String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
