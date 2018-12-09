package com.liudehuang.springbootlearning.Service;

import org.springframework.stereotype.Service;

/**
 * 单例bean实例
 * 默认是single，相当于@Scope("singleton")
 * sington：一个spring容器中只有一个Bean实例，spring默认配置，全容器共享一个实例
 * prototype:每次调用新建一个Bean实例
 * Request:每一个http request新建一个bean实例
 * Session：每一个http session新建一个Bean实例
 * GlobalSession:这个只在portal应用中有用，给每一个global http session新建一个Bean实例
 */
@Service
public class DemoSingletonService {
}
