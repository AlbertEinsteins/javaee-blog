package com.item.javaee.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Tag
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:57
 * @Version: 1.0
 **/
@Entity
@Table(name = "tag")
public class Tag implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Integer tagId ;

    @Column(name = "tag_name", length = 32)
    private String tagName ;

    protected Tag() { }

    public Tag(Integer tagId, String tagName) {
        this.tagId = tagId;
        this.tagName = tagName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
