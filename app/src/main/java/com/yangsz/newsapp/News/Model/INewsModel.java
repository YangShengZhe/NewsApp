package com.yangsz.newsapp.News.Model;

public interface INewsModel {
    void loadNews(String hostType,int stratPage,String id,IOnLoadListener iOnLoadListener);
}
