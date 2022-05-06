package com.edu.mns.eval.evaluation_dfsr_spring.controller;


import com.edu.mns.eval.evaluation_dfsr_spring.model.Article;
import com.edu.mns.eval.evaluation_dfsr_spring.repository.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ArticleController {

    private ArticleDao articleDao;

    @Autowired
    public ArticleController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    // ***********  METHODE POST  **************************

    @PostMapping("/article")
    public void ajouterArticle(@RequestBody Article ajoutArticle) {
        articleDao.save(ajoutArticle);
    }
}
