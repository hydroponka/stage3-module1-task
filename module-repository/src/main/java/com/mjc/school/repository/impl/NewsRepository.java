package com.mjc.school.repository.impl;

import com.mjc.school.repository.interfaces.Repository;
import com.mjc.school.repository.model.NewsModel;

import java.util.List;

public class NewsRepository implements Repository<NewsModel>{

    @Override
    public List<NewsModel> readAll() {
        return null;
    }

    @Override
    public NewsModel readById(Long id) {
        return null;
    }

    @Override
    public NewsModel create(NewsModel var1) {
        return null;
    }

    @Override
    public NewsModel update(NewsModel var1) {
        return null;
    }

    @Override
    public Boolean deleteById(NewsModel var1) {
        return null;
    }

    @Override
    public Boolean ifExistById(NewsModel var1) {
        return null;
    }
}
