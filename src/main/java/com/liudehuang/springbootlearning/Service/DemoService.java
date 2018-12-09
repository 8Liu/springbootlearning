package com.liudehuang.springbootlearning.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    /**
     * 注入普通字符串
     */
    @Value("其它类的属性")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
