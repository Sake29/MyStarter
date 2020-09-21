package com.sake.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//声明该类为配置类，替代xml配置文件
@ConditionalOnWebApplication//注解仅在Spring的web服务中生效
@EnableConfigurationProperties(HelloProperties.class)//让使用 @ConfigurationProperties 注解的类生效。
public class HelloWorldAutoConfiguration {

    @Autowired
    private HelloProperties properties;

    @Bean//用于创建一个bean对象
    public HelloWorld helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setProperties(properties);
        return helloWorld;
    }
}
