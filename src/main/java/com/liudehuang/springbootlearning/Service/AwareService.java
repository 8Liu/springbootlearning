package com.liudehuang.springbootlearning.Service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * spring aware的目的是为了让Bean获得spring容器的服务
 * BeanNameAware ——>获取到容器中Bean的名称
 * BeanFactoryAware ———>获取当前的bean Factory,这样可以调用容器的服务
 * ApplicationContextAware ——>当前的applicationContext,这样可以调用服务
 * MessageSourceAware ——>获得message source,这样可以获得文本信息
 * ApplicationEventPublisherAware ——>应用时间发布器，可以发布事件
 * ResourceLoaderAware ——>获得资源加载器，可以获得外部资源文件
 */
@Component
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称是："+beanName);
        Resource resource = resourceLoader.getResource("classpath:test.properties");
        try{
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
