package com.liudehuang.springbootlearning;

import com.liudehuang.springboot_core.annotation.AnnotationService;
import com.liudehuang.springboot_core.annotation.DemoConfig;
import com.liudehuang.springboot_core.condition.config.ConditionConfig;
import com.liudehuang.springboot_core.condition.service.ListService;
import com.liudehuang.springbootlearning.Service.*;
import com.liudehuang.springbootlearning.config.*;
import com.liudehuang.springbootlearning.entity.DemoBean;
import com.liudehuang.springbootlearning.publisher.DemoPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootlearningApplicationTests {
    @Autowired
    private DemoAnnotationService demoAnnotationService;
    @Autowired
    private DemoMethodService demoMethodService;

    @Test
    public void testAop() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }

    @Test
    public void testScope(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println("s1与s2是否相等："+s1.equals(s2));
        System.out.println("p1与p2是否相等："+p1.equals(p2));
        context.close();
    }

    @Test
    public void testElConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }

    @Test
    public void testPrePostConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }

    @Test
    public void testProfileConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //先将活动的profile设置为prod
        context.getEnvironment().setActiveProfiles("prod");
        //后置注册Bean配置类
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }

    @Test
    public void testEventConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }

    @Test
    public void testAwareConfig(){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
       AwareService awareService = context.getBean(AwareService.class);
       awareService.outputResult();
       context.close();
    }

    @Test
    public void testAsyncConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }

    @Test
    public void testTaskSchedulerCondig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }

    @Test
    public void testConditionConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+listService.shwoListCmd());
    }

    /**
     * 测试组合注解和源注解
     */
    @Test
    public void testDemoConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        DemoConfig demoConfig = context.getBean("demoConfig",DemoConfig.class);
        demoConfig.hello();
        annotationService.outputResult();
        context.close();
    }
}
