package com.wyy.slyder_adventures.controller;

import com.wyy.slyder_adventures.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: ChenZhongjun
 * @desc:
 * @Date: Created in 2021/6/25
 */
@Controller
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, @RequestParam(value = "name", required = false, defaultValue = "springboot-thymeleaf") String name, @RequestParam(value = "id") Integer id) {
        LOGGER.info("hello invoked. name:{}, id:{}", name, id);
        request.setAttribute("name", userService.getUserInfo(id).getUsername());
        return "hello";
    }


}
