package com.yangsz.newsapp.News.Model;

import com.yangsz.newsapp.Bean.NewsBean;

public interface IOnLoadListener {
    void success(NewsBean newsBean);
    void fail(String error);
}
