package com.bytes.bfs.demo;

import com.bytes.bfs.support.common.box.annocation.EnableBox;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan(value = {"com.bytes.bfs"})
@SpringCloudApplication
@EnableFeignClients(value = {"com.bytes.bfs"})
@EnableBox(encrypt = true,feignEncrypt = true)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
