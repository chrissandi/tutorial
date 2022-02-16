package com.xtremax.tutorial.service;

import com.xtremax.tutorial.dao.NewsRepository;
import com.xtremax.tutorial.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceBean implements NewsService {

    @Autowired
    private NewsRepository repository;

    @Override
    public List<News> listNews() {
        return repository.findAllByOrderByPublishedDateDesc();
    }

    @Override
    public News getNews(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public boolean createNews(News news) {
        News result = repository.save(news);
        return result != null;
    }
}
