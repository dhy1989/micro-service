package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dinghy
 * @date 2019/9/16 16:16
 */
@RestController
public class SessionDemo {
    @GetMapping("/session")
    public String session(HttpServletRequest request) {
        return "session: " + request.getSession().getId() + "  port: " + request.getServerPort();
    }
}
