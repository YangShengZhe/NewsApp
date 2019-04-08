package com.yangsz.newsapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FgNewsListFragment extends Fragment {
    private int type;
    private TextView tv_news;

    public static FgNewsListFragment newInstance(int type){
        Bundle args=new Bundle();
        FgNewsListFragment fragment=new FgNewsListFragment();
        args.putInt("type",type);
        fragment.setArguments(args);
        return fragment;
    }



    public FgNewsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fg_news_list, container, false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInsanceState){
        super.onViewCreated(view,savedInsanceState);
        type=getArguments().getInt("type");
        tv_news=view.findViewById(R.id.tv_news);
        switch (type){
            case Page.NEWS_TYPE_TOP:
                tv_news.setText("top");
                break;
            case Page.NEWS_TYPE_NBA:
                tv_news.setText("nba");
                break;
            case Page.NEWS_TYPE_JOKES:
                tv_news.setText("joke");
                break;

        }
    }

}
