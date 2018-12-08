package com.xin.jump.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xin.jump.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import javax.annotation.Resource;

/**
 * @author wangxin
 * @version 1.0
 * @description AggregationService类
 * @date Created in 2018/12/8 10:59
 * @see com.xin.jump.service
 */
@Service
public class AggregationService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getUserId(Long id) {
        // 创建一个被观察者
        return Observable.create(observer -> {
            // 请求用户微服务的/{id}端点
            User user = restTemplate.getForObject("http://microservice-provider-user/{id}", User.class, id);
            observer.onNext(user);
            observer.onCompleted();
        });
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getMovieUserByUserId(Long id) {
        return Observable.create(observer -> {
            // 请求电影微服务的/user/{id}端点
            User movieUser = restTemplate.getForObject("http://microservice-consumer-movie/user/{id}", User.class, id);
            observer.onNext(movieUser);
            observer.onCompleted();
        });
    }

    // 异常回退方法
    public User fallback(Long id) {
        User user = new User();
        user.setId(-1L);
        return user;
    }
}
