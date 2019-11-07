package com.item.javaee.service;

import com.item.javaee.entity.User;

import java.util.List;

public interface UserService {
    //用户注册
    boolean saveUser(User user) ;

    /**
     * 用户输入账号密码进行登录，如果存在返回对象的所有属性；否则返回null
     * @param user 只包含有账号和密码属性
     * @return User | null
     */
    User login(User user) ;

    //根据用户名查号对象
    User findByUserName(String userName) ;
}
