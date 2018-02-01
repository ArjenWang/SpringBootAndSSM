package com.arjen.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/2/1.
 */
@Controller
public class PageController {
    @RequestMapping("/index")
    public static String index(){
        return "index";
    }
}
