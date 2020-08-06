package com.bytes.bfs.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class Config implements InitializingBean {

    @Value("${ns.name:}")
    private String name;

    private String age;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("配置信息 ：{}",this);
    }
}
