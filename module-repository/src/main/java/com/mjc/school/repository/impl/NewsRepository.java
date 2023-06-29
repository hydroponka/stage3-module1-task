package com.mjc.school.repository.impl;

import com.mjc.school.repository.interfaces.Repository;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.repository.utils.DataSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NewsRepository implements Repository<NewsModel>{
    private DataSource dataSource = DataSource.getInstance();

    @Override
    public List<NewsModel> readAll() {
        return dataSource.getNews();
    }

    @Override
    public NewsModel readById(Long id) {
        return dataSource.getNews().stream().filter(news -> id.equals(news.getId()))
                .findFirst().get();
    }

    @Override
    public NewsModel create(NewsModel news) {
        List<NewsModel> newsList = DataSource.getInstance().getNews();
        newsList.sort(Comparator.comparing(NewsModel::getId));
        if (!newsList.isEmpty()){
            news.setId(newsList.size()+1L);
        }else {
            news.setId(1L);
        }
        newsList.add(news);
        return news;
    }

    @Override
    public NewsModel update(NewsModel news) {
        NewsModel newsModel = readById(news.getId());
        newsModel.setContent(news.getContent());
        newsModel.setAuthorId(news.getAuthorId());
        newsModel.setLastUpdateDate(news.getLastUpdateDate());
        newsModel.setTitle(news.getTitle());
        return newsModel;
    }

    @Override
    public Boolean deleteById(Long id) {
        List<NewsModel> deleteList = new ArrayList<>();
        deleteList.add(readById(id));
        return dataSource.getNews().removeAll(deleteList);
    }

    @Override
    public Boolean ifExistById(Long id) {
        return dataSource.getNews().stream().anyMatch(newsModel -> newsModel.getId().equals(id));
    }
}
