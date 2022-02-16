package com.xtremax.tutorial.dao;

import com.xtremax.tutorial.entity.News;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NewsRepository extends JpaRepository<News, Long>, JpaSpecificationExecutor<News> {

    List<News> findAll();

    List<News> findAllByOrderByPublishedDateDesc();

    Optional<News> findById(Long id);

    News save(News persisted);
}
