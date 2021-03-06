package com.ryu.controller;

import com.ryu.entities.Article;
import com.ryu.entities.User;
import com.ryu.service.ArticleService;
import com.ryu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    private static final  String PAGE = "blank";
    public static final String INDEX = "index";
    public static final String LOGIN = "login";
    private static Logger LOGGER = Logger.getLogger("ArticleController");

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @RequestMapping("/jsp")
    public String ValidatePage(){
        LOGGER.info("Method ValidatePage() running successful");
        return PAGE ;
    }

    @RequestMapping("/html")
    public String htmlPage(){
        LOGGER.info("Method htmlPage() running successful");
        return LOGIN;
    }

    @RequestMapping("/getArticle")
    public String getArticle(Map model){
        List<Article> articleList = articleService.selectAll();
        model.put("articleList",articleList);
        LOGGER.info("Method getArticle() running successful");
        return INDEX;
    }

    @RequestMapping("/addArticle")
    public String addArticle(Article article, HttpServletRequest httpServletRequest){
        int a = articleService.addArticle(article);
        User user = new User();
        user.setUsername("aaa");
        user.setPassword("aaa");
        httpServletRequest.getSession().setAttribute("user",user);
        if(a > 0){
            return INDEX;
        }else{
            return INDEX;
        }
    }

    @RequestMapping("/addUser")
    public String addText(@RequestBody User user,Model model){
        Integer a = userService.addUser(user);
        if(a > 0){
            model.addAttribute("msg", "插入成功");
            return LOGIN;
        }else{
            model.addAttribute("msg", "插入失败");
            return INDEX;
        }
    }

    @RequestMapping("/login")
    public String login(@RequestBody User user, HttpServletRequest servletRequest){
        User loginUser = userService.Login(user.getUsername(),user.getPassword());
        if(loginUser != null){
            servletRequest.getSession().setAttribute("user", loginUser);
            System.out.println("all finished");
            return INDEX;
        }else{
            System.out.println("all failed");
            return LOGIN;
        }
    }

}
