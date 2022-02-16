package com.xtremax.tutorial.controller;

import com.xtremax.tutorial.entity.News;
import com.xtremax.tutorial.service.NewsService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsApiController {

    @Autowired
    private NewsService service;


    @GetMapping(value={"", "/", "/list"})
    public List<News> listNews() {
        return service.listNews();
    }

    @GetMapping(value = "/{newsId}")
    public News getNews(@PathVariable Long newsId) {
        return service.getNews(newsId);
    }

    @PostMapping(value={"", "/"})
    public boolean createNews(@RequestBody News news) {
        System.out.println(news.getPublishedDate());
        return service.createNews(news);
    }
}
