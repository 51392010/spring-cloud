package com.xin.jump.feign;

import com.xin.jump.config.MultipartSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wangxin
 * @version 1.0
 * @description 使用Feign上传文件
 * @date Created in 2018/11/26 22:06
 * @see com.xin.jump.feign
 */
@FeignClient(name = "microservice-provider-user-multiple-params", configuration = MultipartSupportConfig.class)
public interface UploadFeignClient {

    @PostMapping(value = "/upload", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    String handleFileUpload(@RequestPart("file") MultipartFile file);
}
