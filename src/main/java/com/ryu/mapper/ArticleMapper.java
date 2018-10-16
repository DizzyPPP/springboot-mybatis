package com.ryu.mapper;

import java.util.List;
import com.ryu.entities.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    List<Article> selectAll();

    Integer addArticle(Article article);

}
