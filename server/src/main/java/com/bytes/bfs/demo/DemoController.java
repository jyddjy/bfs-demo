package com.bytes.bfs.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test")
    public String getDate( ){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @RequestMapping("/test2")
    public String getDate2( ){
        return "hello";
    }
}
