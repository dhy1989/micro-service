package com.demo.feignclient;

import com.demo.entity.User;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dinghy
 * @date 2019/6/27 15:56
 */
@FeignClient("micro-provider")
public interface UserFeignClient {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
     User findById(@PathVariable("id") Long id);
}
