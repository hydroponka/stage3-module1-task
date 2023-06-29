package com.mjc.school.repository.utils;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.repository.model.data.AuthorData;
import com.mjc.school.repository.model.data.NewsData;

import java.util.List;

public class DataSource {
    private List<NewsModel> news;
    private DataSource(){
        List<AuthorModel> authors = AuthorData.getAuthorData().getAuthorList();
        this.news = NewsData.getNewsData(authors).getNewsList();
    }
    public static DataSource getInstance(){
        return LazyDataSource.INSTANCE;
    }
    public List<NewsModel> getNews(){
        return this.news;
    }
    static class LazyDataSource{
        static final DataSource INSTANCE = new DataSource();
        private LazyDataSource() {
        }
    }
}
