package com.item.javaee.controller;

import com.item.javaee.entity.User;
import com.item.javaee.service.UserService;
import com.item.javaee.utils.JsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName: UserController
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-06 00:41
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService ;

    @RequestMapping("/login")
    public String login(HttpServletRequest req, User user) {
        User existUser = userService.login(user) ;
        if(existUser == null) { //登陆失败
            req.setAttribute("errorMsg", "登陆失败,账号或密码不正确") ;
            return "login/login" ;
        }

        req.getSession().setAttribute("curUser", existUser) ;
        return "redirect:/" ;
    }

    //注册成功，返回注册页面，返回注册码
    //0 -- 成功
    //1 -- 失败
    @RequestMapping("/registry")
    @ResponseBody
    public Map registry(User user, HttpSession session, String code) {
        //检验验证码的正确性
        String existCode = (String) session.getAttribute("code") ;

        //existcode有可能为空
        if(code.equals(existCode)) {
            userService.saveUser(user) ;
            return JsonBuilder.buildJson(user, 0, null) ;
        }
        //登陆失败
        return JsonBuilder.buildJson(user, -1, null) ;
    }
}
