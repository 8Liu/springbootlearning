package com.liudehuang.springboot_core.enable.annotation;

import com.liudehuang.springboot_core.enable.config.PersonSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author liudehuang
 * @date 2018/12/9 10:06
 * 自定义注解实现Enable功能
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(PersonSelector.class)
public @interface EnableSpringPerson {
}
