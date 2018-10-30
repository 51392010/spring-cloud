package com.xin.jump.controller;

import com.xin.jump.entity.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MovieController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }

    /**
     * 查询microservice-provider-user-my-metadata服务的信息并返回
     * <font color='red'>microservice-provider-user-my-metadata名称对应 该工程的 spring.application.name 属性设置的值</font>
     * @return microservice-provider-user-my-metadata服务的信息
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {

        return this.discoveryClient.getInstances("microservice-provider-user-my-metadata");
    }

}
