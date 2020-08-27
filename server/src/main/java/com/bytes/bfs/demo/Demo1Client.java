package com.bytes.bfs.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "bfs-demo",url = "${bfs.server.bfs-demo.url:}")
public interface Demo1Client {

    @PostMapping("/demo/test1")
     String test1();

}