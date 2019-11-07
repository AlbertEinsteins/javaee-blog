package com.item.javaee.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName: ArticleTagRepository
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:57
 * @Version: 1.0
 **/
@Entity
@Table(name = "article_tag")
public class ArticleTag implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id ;

    @Column(name = "article_id")
    private Integer articleId ;

    @Column(name = "tag_id")
    private Integer tag_id ;
}
