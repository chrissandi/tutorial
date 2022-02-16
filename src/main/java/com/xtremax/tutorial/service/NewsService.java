package com.xtremax.tutorial.service;

import com.xtremax.tutorial.entity.News;

import java.util.List;

public interface NewsService {

    public List<News> listNews();

    public News getNews(Long id);

    public boolean createNews(News news);
}