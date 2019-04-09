package com.yangsz.newsapp.News.View;

import com.yangsz.newsapp.Bean.NewsBean;

public interface INewsView {
    void showNews(NewsBean newsBean);
    void hideDialog();
    void showDialog();
    void showErrorMsg(String error);
}
