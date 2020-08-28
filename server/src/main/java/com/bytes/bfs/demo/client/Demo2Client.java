package com.bytes.bfs.demo.client;

import com.alibaba.fastjson.JSONObject;
import com.bytes.bfs.support.common.box.response.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "bfs-demo2",url = "${bfs.server.bfs-demo2.url:}")
public interface Demo2Client {

    @PostMapping("/demo2/test2")
    ApiResult test2(@RequestBody JSONObject object);
}
