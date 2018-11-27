package com.xin.jump.feign;

import com.xin.jump.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author wangxin
 * @version 1.0
 * @description 回退类FeignClientFallback需实现Feign Client接口
 *                FeignClientFallback也可以是public class，没有区别
 * @date Created in 2018/11/27 20:37
 * @see com.xin.jump.feign
 */
@Service
public class FeignClientFallback implements UserFeignClient {

    @Override
    public User findById(String id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }
}
