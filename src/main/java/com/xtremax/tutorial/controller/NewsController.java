package com.xtremax.tutorial.controller;

import com.xtremax.tutorial.entity.News;
import com.xtremax.tutorial.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService service;

    @GetMapping
    public String listNewsView(Model model) {
        List<News> newsList = service.listNews();
        if (newsList.isEmpty()) {
            model.addAttribute("newsNotFound", true);
        } else {
            model.addAttribute("newsList", newsList);
        }
        return "news/list-page";
    }

    @GetMapping(value = "/{newsId}")
    public String viewNewsView(@PathVariable Long newsId, Model model) {
        News news = service.getNews(newsId);

        if (news != null) {
            model.addAttribute("news", news);
            return "news/details-page";
        } else {
            return "redirect:/news/";
        }
    }

    @GetMapping(value = "/add")
    public String addNewsForm(Model model) {
        model.addAttribute("newsForm", new News());
        return "news/add-page";
    }

    @PostMapping(value = "/add")
    public String saveNews(@ModelAttribute("newsForm") News news, BindingResult result, Model model) {
        boolean success = false;
        try{
            if (result.hasErrors()){
                success = false;
            } else {
                success = service.createNews(news);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("TESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSZ");
        model.addAttribute("newsCreated", success);
        return success ? "redirect:/news?newsCreated" : "news/add-page";
    }
}