package com.xin.jump.controller;

import com.xin.jump.entity.User;
import com.xin.jump.feign.UserFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class MovieController {

    @Resource
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable String id) {
        return userFeignClient.findById(id);
    }

    /**
     * @param user
     * @return com.xin.jump.entity.User
     * @author wangxin
     * @description 测试URL：http://localhost:8010/user/get0?id=1&username=张三
     * @date Created in 2018/11/20 23:05
     */
    @GetMapping(value = "/user/get0")
    public User get0(User user) {
        return userFeignClient.get0(user);
    }

    /**
     * @param user
     * @return com.xin.jump.entity.User
     * @author wangxin
     * @description 测试URL：http://localhost:8010/user/get1?id=1&username=张三
     * @date Created in 2018/11/20 23:05
     */
    @GetMapping(value = "/user/get1")
    public User get1(User user) {
        return userFeignClient.get1(user.getId(), user.getUsername());
    }

    /**
     * @param user
     * @return com.xin.jump.entity.User
     * @author wangxin
     * @description 测试URL：http://localhost:8010/user/get2?id=1&username=张三
     * @date Created in 2018/11/20 23:05
     */
    @GetMapping(value = "/user/get2")
    public User get2(User user) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", user.getId());
        map.put("username", user.getUsername());
        return userFeignClient.get2(map);
    }

    /**
     * @param user
     * @return com.xin.jump.entity.User
     * @author wangxin
     * @description 测试URL：http://localhost:8010/user/post?id=1&username=张三
     * @date Created in 2018/11/20 23:05
     */
    @GetMapping(value = "/user/post")
    public User post(User user) {
        return userFeignClient.post(user);
    }

}
