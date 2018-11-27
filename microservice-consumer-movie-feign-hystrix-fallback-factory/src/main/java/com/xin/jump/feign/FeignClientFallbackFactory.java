package com.xin.jump.feign;

import com.xin.jump.entity.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author wangxin
 * @version 1.0
 * @description UserFeignClient的fallbackFactory类，该类需实现FallbackFactory接口，并覆写create方法
 * @date Created in 2018/11/27 21:25
 * @see com.xin.jump.feign
 */
@Slf4j
@Service
public class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

    // @FeignClient的属性fallbackFactory可以配置不同的异常访问不同的效果
    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(String id) {
                // 日志最好放在各个fallback方法中，而不要直接放在create方法中。
                // 否则在引用启动时，就会打印该日志。
                // 详见https://github.com/spring-cloud/spring-cloud-netflix/issues/1471
                log.info("fallback; reason was:", throwable);
                User user = new User();
                if (throwable instanceof NullPointerException) {
                    user.setId(-1L);
                    user.setUsername("空指针用户");
                } else {
                    user.setId(-2L);
                    user.setUsername("默认用户");
                }
                return user;
            }
        };
    }
}
