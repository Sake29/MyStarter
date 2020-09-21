package com.sake.starter;

/**
 * 业务类，用于执行一些业务方法
 *
 */
public class HelloWorld {

    private HelloProperties properties;

    //get、set方法用于自动注入
    public HelloProperties getProperties() {
        return properties;
    }

    public void setProperties(HelloProperties properties) {
        this.properties = properties;
    }

    //业务逻辑
    public String sayHelloWorld(String name){
        return properties.getBefore()+":"+name+","+properties.getAfter();
    }
}
