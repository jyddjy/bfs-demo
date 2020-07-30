package com.bytes.bfs.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@ConfigurationProperties(prefix = "ns")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Configuration
public class Config implements InitializingBean, ApplicationListener {

    @Value("${ns.name:}")
    private String name;

    private String age;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getName() + "  " + getAge());
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(getName() + "  " + getAge());
    }
}
