package com.bytes.bfs.demo;

import com.alibaba.fastjson.JSONObject;
import com.bytes.bfs.demo.client.Demo2Client;
import com.bytes.bfs.support.common.box.response.ApiResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @Autowired
    private Demo2Client demo2Client;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class Request {
        private String name;

        private String id;
    }

    @PostMapping("/test1")
    public ApiResult test1(){
        return ApiResult.success("demo-test1");
    }

    @PostMapping("/test2")
    public ApiResult test2(){
        ApiResult apiResult = demo2Client.test2(new JSONObject());
        return ApiResult.success("demo-test2:  "+apiResult.getData());
    }
}
