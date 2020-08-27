package com.bytes.bfs.demo;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.bytes.bfs.support.common.box.utils.FastJsonUtils;
import com.google.common.collect.Lists;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;

public class HttpMessageConvert  extends FastJsonHttpMessageConverter {

    public HttpMessageConvert(){
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(FastJsonUtils.SERIALIZER_FEATURES);
        // 支持Actuator. Actuator返回的数据content-type是application/vnd.spring-boot.actuator.v2+json
        MediaType application = new MediaType("application", "*+json");
        setSupportedMediaTypes(Lists.newArrayList(MediaType.APPLICATION_JSON_UTF8, application));
        setFastJsonConfig(fastJsonConfig);
    }


    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return super.readInternal(clazz, inputMessage);
    }

    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        super.writeInternal(object, outputMessage);
    }
}
