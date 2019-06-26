package com.demo.controller;

import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author dinghy
 * @date
 */
@RestController
public class UserController {
    @Autowired
    private ConcurrentHashMap<Long, User> concurrentHashMap;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User user = concurrentHashMap.get(id);
        if(user==null){
            user=new User(100l,"李四",89,100.00);
        }
        return user;
    }
}
