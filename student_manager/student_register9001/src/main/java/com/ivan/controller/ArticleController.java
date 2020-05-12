package com.ivan.controller;

import com.ivan.entity.Article;
import com.ivan.service.ArticleService;
import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:8080")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @GetMapping("/article")
    public Result getAll(){
        List<Article> list = articleService.getAll();
        return new Result(true, StatusCode.OK,"成功",list);
    }
}
