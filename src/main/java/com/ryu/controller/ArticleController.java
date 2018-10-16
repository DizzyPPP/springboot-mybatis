package com.ryu.controller;

import com.ryu.entities.Article;
import com.ryu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * controller
 *
 * @author Administrator
 * @create 2018-07-19 12:17
 */

@Controller
public class ArticleController {

    private static final  String PAGE = "page";
    private static final  String SUCCESS = "success";
    public static final String INDEX = "index";
    private static Logger LOGGER = Logger.getLogger("ArticleController");

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/jsp")
    public String ValidatePage(){
        LOGGER.info("Method ValidatePage() running successful");
        return SUCCESS ;
    }

    @RequestMapping("/html")
    public String htmlPage(){
        LOGGER.info("Method htmlPage() running successful");
        return PAGE;
    }

    @RequestMapping("/getArticle")
    public String getArticle(Map model){
        List<Article> articleList = articleService.selectAll();
        model.put("articleList",articleList);
        LOGGER.info("Method getArticle() running successful");
        return INDEX;
    }

    @RequestMapping("/addArticle")
    public String addArticle(Article article, Model model){
        int a = articleService.addArticle(article);
        if(a > 0){
            return INDEX;
        }else{
            model.addAttribute("error", "插入失败");
            return INDEX;
        }
    }

}
