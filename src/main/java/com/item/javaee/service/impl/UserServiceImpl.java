package com.item.javaee.service.impl;

import com.item.javaee.entity.User;
import com.item.javaee.repository.UserRepository;
import com.item.javaee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName: UserServiceImpl
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-06 12:31
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository ;

    @Override
    public boolean saveUser(User user) {
        userRepository.save(user) ;
        return true ;
    }

    @Override
    public User login(User user) {
        User u = findByUserName(user.getUsername()) ;
        if(u != null) {
            if(u.getPassword().equals(user.getPassword())) {
                return u ;
            }
        }
        return null ;
    }

    @Override
    public User findByUserName(String userName) {
        Specification<User> specification = (root, query, queryBuilder) -> {
            return queryBuilder.equal(root.get("username"), userName) ;
        } ;

        List<User> userList = userRepository.findAll(specification) ;

        if(userList != null)
            return userList.get(0) ;
        return null ;
    }
}
