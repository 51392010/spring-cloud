package com.xin.jump.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xin.jump.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class MovieController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient loadBalancerClient;


    /**
     * @author wangxin
     * @description 可以使用@HystrixCommand的ignoreExceptions属性来配置不想执行回退的异常类
     * @date Created in 2018/11/27 20:10
     * @param id
     * @return com.xin.jump.entity.User
     */
    @HystrixCommand(fallbackMethod = "findByIdFallback", ignoreExceptions = {RuntimeException.class, IllegalArgumentException.class})
    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable String id) {
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }

    /**
     * 如果需要获取回退的原因，添加Throwable即可。(Throwable:表示获取回退的原因)
     * @param id
     * @param throwable
     * @return com.xin.jump.entity.User
     */
    public User findByIdFallback(String id, Throwable throwable) {
        log.error("进入回退方法，抛出异常:", throwable);
        User user = new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }

    @GetMapping(value = "/log-user-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
        // 打印当前选择的是哪个节点
        log.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }

}
