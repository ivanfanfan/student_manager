package com.ivan.service;

import com.ivan.dao.ArticleDao;
import com.ivan.entity.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService  {
    @Resource
    private ArticleDao articleDao;

    public List<Article> getAll(){
        return articleDao.selectList(null);
    }
}
