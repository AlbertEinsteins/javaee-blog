package com.item.javaee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: MainController
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-05 20:30
 * @Version: 1.0
 **/
@Controller
public class MainController {

    //返回首页
    @RequestMapping("/")
    public String indexPage() {
        return "index" ;
    }
}
