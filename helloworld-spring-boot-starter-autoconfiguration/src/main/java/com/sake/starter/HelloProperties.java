package com.sake.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 该类与配置文件绑定，可以在application.properties中配置后交给Spring容器注入
 */
@ConfigurationProperties(prefix = "sake.hello")
public class HelloProperties {
    private String before;//对应application.properties文件中的sake.hello.before
    private String after;//对应application.properties文件中的sake.hello.after

    //get、set方法用于自动注入
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}
