package com.xin.jump.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author wangxin
 * @version 1.0
 * @description 禁用Hystrix的引用
 * @date Created in 2018/11/28 20:03
 * @see com.xin.jump.feign
 */
@FeignClient(name = "microservice-provider-user", configuration = FeignDisableHystrixConfiguration.class)
public interface UserDisableFeignClient {
}
