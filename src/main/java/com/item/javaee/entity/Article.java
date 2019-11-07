package com.item.javaee.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Article
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:30
 * @Version: 1.0
 **/
@Entity
@Table(name = "article")
public class Article implements Serializable {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articleId ;

    @Column(name = "article_title", length = 128)
    private String articleTitle ;

    @Column(name = "article_imgurl", length = 128)
    private String imgUrl ;

    @Column(name = "article_content")
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String content ;

    @Column(name = "article_html")
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String html ;           //md 转化为 html

    @Column(name = "article_comment_num")
    private Integer commentNum ;

    @Column(name = "article_lookup_num")
    private Integer lookupNum ;

    @Column(name = "article_publishtime")
    private Date publishTime ;



    protected Article() { }

    public Article(String articleTitle, String imgUrl, String content, String html, Integer commentNum, Integer lookupNum, Date publishTime) {
        this.articleTitle = articleTitle;
        this.imgUrl = imgUrl;
        this.content = content;
        this.html = html;
        this.commentNum = commentNum;
        this.lookupNum = lookupNum;
        this.publishTime = publishTime;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getLookupNum() {
        return lookupNum;
    }

    public void setLookupNum(Integer lookupNum) {
        this.lookupNum = lookupNum;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
