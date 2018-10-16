package com.ryu.service;

import com.ryu.entities.Article;

import java.util.List;

public interface ArticleService {

    List<Article> selectAll();

    Integer addArticle(Article article);

}
