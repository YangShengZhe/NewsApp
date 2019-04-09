package com.yangsz.newsapp.News.Presenter;
//P层任务是把M层和V层任务连接起来
public interface INewsPresenter {
    void loadNews(int type,int startPage);
}
