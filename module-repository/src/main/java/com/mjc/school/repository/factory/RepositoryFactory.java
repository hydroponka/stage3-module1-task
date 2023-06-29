package com.mjc.school.repository.factory;

import com.mjc.school.repository.Repository;
import com.mjc.school.repository.impl.NewsRepository;
import com.mjc.school.repository.model.NewsModel;

public class RepositoryFactory {
    private static RepositoryFactory instance;
    private final Repository<NewsModel> newsRepository = new NewsRepository();

    private RepositoryFactory() {
    }

    public static RepositoryFactory getInstance() {
        if (instance == null) {
            instance = new RepositoryFactory();
        }

        return instance;
    }

    public Repository<NewsModel> getNewsRepository() {
        return this.newsRepository;
    }
}
