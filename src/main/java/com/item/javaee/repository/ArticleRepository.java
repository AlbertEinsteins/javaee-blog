package com.item.javaee.repository;

import com.item.javaee.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: ArticleRepository
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 20:59
 * @Version: 1.0
 **/
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
