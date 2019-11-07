package com.item.javaee.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Comment
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:56
 * @Version: 1.0
 **/
@Entity
@Table(name = "comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer commentId ;

    @Column(name = "comment_content")
    private String commentContent ;

    @Column(name = "comment_time")
    private Date commentTime ;

    @Column(name = "comment_fid")
    private Integer commentFid ;

    protected Comment() { }

    public Comment(String commentContent, Date commentTime, Integer commentFid) {
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.commentFid = commentFid;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getCommentFid() {
        return commentFid;
    }

    public void setCommentFid(Integer commentFid) {
        this.commentFid = commentFid;
    }
}
