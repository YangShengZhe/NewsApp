package com.yangsz.newsapp;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yangsz.newsapp.R;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {
    private BottomBar bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //为底部导航栏设置监听
        bottomBar=(BottomBar)this.findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                switch (tabId){
                    case R.id.page:
                        Toast.makeText(MainActivity.this,"page",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.search:
                        Toast.makeText(MainActivity.this,"search",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.topic:
                        Toast.makeText(MainActivity.this,"topic",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.account:
                        Toast.makeText(MainActivity.this,"account",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
