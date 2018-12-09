package com.liudehuang;

import com.liudehuang.springboot_core.annotation.AnnotationService;
import com.liudehuang.springboot_core.annotation.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoConfig config = context.getBean("com.liudehuang.springboot_core.annotation",DemoConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        annotationService.outputResult();
        config.hello();
        context.close();
    }
}
