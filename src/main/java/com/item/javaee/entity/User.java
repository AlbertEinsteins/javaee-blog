package com.item.javaee.entity;

import org.omg.PortableInterceptor.ServerRequestInfo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: User
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:57
 * @Version: 1.0
 **/
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId ;

    @Column(name = "user_username", length = 32)
    private String username ;

    @Column(name = "user_password", length = 32)
    private String password ;

    @Column(name = "user_name", length = 64)
    private String name ;

    @Column(name = "user_imgurl", length = 64)
    private String imgUrl ;

    @Column(name = "user_email", length = 32)
    private String email ;

    protected User() { }

    public User(String username, String password, String name, String imgUrl, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.imgUrl = imgUrl;
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
