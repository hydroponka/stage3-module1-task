package com.mjc.school.repository.model.data;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.repository.utils.Utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewsData {
    private static final String CONTENT_FILE_NAME = "content";
    private static final String NEWS_FILE_NAME = "news";
    private static NewsData newsData;
    private List<NewsModel> newsList;
    private NewsData(List<AuthorModel> authorList){
        this.init(authorList);
    }
    public static NewsData getNewsData(List<AuthorModel> authorList) {
        if (newsData == null) {
            newsData = new NewsData(authorList);
        }

        return newsData;
    }

    private void init(List<AuthorModel> authorList) {
        this.newsList = new ArrayList<>();
        Random random = new Random();
        for (long id = 1L; id<20L; id++){
            LocalDateTime date = Utils.getRandomDate();
            this.newsList.add(new NewsModel(id, Utils.getRandomContentByFilePath("news"),Utils.getRandomContentByFilePath("content"),
                    date,date,authorList.get(random.nextInt(authorList.size())).getId()));
        }
    }
    public List<NewsModel> getNewsList(){
        return this.newsList;
    }
}
