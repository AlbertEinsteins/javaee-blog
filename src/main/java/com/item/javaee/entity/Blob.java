package com.item.javaee.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Blob
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:51
 * @Version: 1.0
 **/
@Entity
@Table(name = "blog")
public class Blob implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Integer blogId ;

    @Column(name = "blog_name", length = 32)
    private String blogName ;
    @Column(name = "blog_motto", length = 32)
    private String blogMotto ;
    @Column(name = "blog_notice", length = 256)
    private String blogNotice ;         //公告，使用,号分开
    @Column(name = "blog_imgurls", length = 256)
    private String blogImgUrls ;        //轮播图，使用,号分隔开
    @Column(name = "blog_title", length = 32)
    private String blogTitle ;
    @Column(name = "blog_desc", length = 128)
    private String blogDesc ;

    protected Blob() { }

    public Blob(String blogName, String blogMotto, String blogNotice, String blogImgUrls, String blogTitle, String blogDesc) {
        this.blogName = blogName;
        this.blogMotto = blogMotto;
        this.blogNotice = blogNotice;
        this.blogImgUrls = blogImgUrls;
        this.blogTitle = blogTitle;
        this.blogDesc = blogDesc;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogMotto() {
        return blogMotto;
    }

    public void setBlogMotto(String blogMotto) {
        this.blogMotto = blogMotto;
    }

    public String getBlogNotice() {
        return blogNotice;
    }

    public void setBlogNotice(String blogNotice) {
        this.blogNotice = blogNotice;
    }

    public String getBlogImgUrls() {
        return blogImgUrls;
    }

    public void setBlogImgUrls(String blogImgUrls) {
        this.blogImgUrls = blogImgUrls;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogDesc() {
        return blogDesc;
    }

    public void setBlogDesc(String blogDesc) {
        this.blogDesc = blogDesc;
    }
}
