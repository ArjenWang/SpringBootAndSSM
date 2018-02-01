package com.arjen.demo.controller;

import com.arjen.demo.domain.User;
import com.arjen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018/2/1.
 */
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.arjen.demo.service"})//添加的注解
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/select/{name}",method = RequestMethod.GET)
    public List<User> getUserByName(@PathVariable String name, HttpServletResponse httpServletResponse){
        List<User> userList=userService.selectUserByName(name);
        return userList;
    }
}
