package com.ryu.service;

import com.ryu.entities.User;
import com.ryu.mapper.ArticleMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import com.ryu.entities.Article;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Resource
    private ArticleMapper articleMapper;

    public List<Article> selectAll(){
        return articleMapper.selectAll();
    }

    @Override
    public Integer addArticle(Article article) {
        Integer num = articleMapper.addArticle(article);
        return num;
    }

}
