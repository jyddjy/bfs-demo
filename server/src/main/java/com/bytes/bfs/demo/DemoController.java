package com.bytes.bfs.demo;

import com.alibaba.fastjson.JSONObject;
import com.bytes.bfs.support.common.box.response.ApiResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;


@RestController
@RequestMapping("/demo2")
public class DemoController {

    @Autowired
    private Demo1Client demo1Client;

    @PostMapping("/test1")
    public ApiResult test1(){
        return ApiResult.success("demo2-test1: "+ demo1Client.test1());
    }

    @PostMapping("/test2")
    public ApiResult<ResponseObject> test2(){
        return ApiResult.success(ResponseObject.builder().id("12").name("hel").build());
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static class ResponseObject implements Serializable{

        private String id;

        private String name;
    }

}
