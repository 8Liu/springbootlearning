package com.liudehuang.springbootlearning.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 原型bean实例
 *
 * sington：一个spring容器中只有一个Bean实例，spring默认配置，全容器共享一个实例
 * prototype:每次调用新建一个Bean实例
 * Request:每一个http request新建一个bean实例
 * Session：每一个http session新建一个Bean实例
 * GlobalSession:这个只在portal应用中有用，给每一个global http session新建一个Bean实例
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
