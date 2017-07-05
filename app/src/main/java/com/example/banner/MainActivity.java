package com.example.banner;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

import me.maxwin.view.XListView;

public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener{

    private String urlpath = "http://api.kkmh.com/v1/topic_new/discovery_list?gender=0&sa_event=eyJwcm9qZWN0Ijoia3VhaWthbl9hcHAiLCJ0aW1lIjoxNDg3ODM5MDM5MzE1LCJwcm9wZXJ0aWVzIjp7IkhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIlZDb21tdW5pdHlUYWJOYW1lIjoi54Ot6ZeoIiwiJG9zX3ZlcnNpb24iOiI0LjIuMiIsIkdlbmRlclR5cGUiOiLlpbPniYgiLCJGcm9tRmluZENhdGVnb3J5VGFiTmFtZSI6IuWFqOmDqCIsIklzQXV0b0xvYWQiOmZhbHNlLCIkbGliX3ZlcnNpb24iOiIxLjYuMzQiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsIiR3aWZpIjp0cnVlLCIkbWFudWZhY3R1cmVyIjoic2Ftc3VuZyIsIkZyb21GaW5kVGFiTmFtZSI6IuaOqOiNkCIsIiRzY3JlZW5faGVpZ2h0Ijo1NzYsIkNhdGVnb3J5Ijoi5peg5rOV6I635Y-WIiwiSG9tZXBhZ2VVcGRhdGVEYXRlIjowLCJQcm9wZXJ0eUV2ZW50IjoiUmVhZEZpbmRQYWdlIiwiRmluZFRhYk5hbWUiOiLmjqjojZAiLCJhYnRlc3RfZ3JvdXAiOjQ2LCIkc2NyZWVuX3dpZHRoIjoxMDI0LCJGaW5kQ2F0ZWdvcnlUYWJOYW1lIjoi5YWo6YOoIiwiJG9zIjoiQW5kcm9pZCIsIlRyaWdnZXJQYWdlIjoiSG9tZVBhZ2UiLCIkY2FycmllciI6IkNNQ0MiLCIkbW9kZWwiOiJHVC1QNTIxMCIsIiRhcHBfdmVyc2lvbiI6IjMuOC4xIn0sInR5cGUiOiJ0cmFjayIsImRpc3RpbmN0X2lkIjoiQTo5MDUxMDQyNzYzNzU1MTA5Iiwib3JpZ2luYWxfaWQiOiJBOjkwNTEwNDI3NjM3NTUxMDkiLCJldmVudCI6IlJlYWRGaW5kUGFnZSJ9";
    private Banner banner;
    private List<Data.DataBean.InfosBean.BannersBean> list=new ArrayList<>();
    private int page=0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            Gson gson=new Gson();
            Data data = gson.fromJson(msg.obj.toString(), Data.class);
            List<Data.DataBean.InfosBean.BannersBean> listbean=data.getData().getInfos().get(0).getBanners();
            list.addAll(listbean);
            List<String> image=new ArrayList<>();
            stop();
            for (Data.DataBean.InfosBean.BannersBean bannerbean:list){
                image.add(bannerbean.getPic());
            }
            banner.setImages(image);
            banner.start();
        }
    };
    private XListView xlv;
    private MyAdapter adapter;

    private void stop() {
        xlv.stopLoadMore();
        xlv.stopRefresh();
        xlv.setRefreshTime("刚刚");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xlv = (XListView) findViewById(R.id.xlv);
        initview();
        loadData();
        adapter = new MyAdapter(this,list);
        xlv.setAdapter(adapter);
        xlv.setPullLoadEnable(true);
        xlv.setPullRefreshEnable(true);
        xlv.setXListViewListener(this);
    }

    private void initview() {
        banner=(Banner) findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new BannerImageLoader(this));
        //设置显示样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置圆点位置
        banner.setIndicatorGravity(BannerConfig.LEFT);
        banner.setBannerAnimation(Transformer.ScaleInOut);

    }

    private void loadData() {
        new Thread(){
            @Override
            public void run() {
                String result = UrlUtils.getUrlConnect(urlpath);
                Message msg = Message.obtain();
                msg.what = 1;
                msg.obj = result;
                handler.sendMessage(msg);
            }
        }.start();
    }

    @Override
    public void onRefresh() {
        page=0;
        list.clear();
        loadData();
    }

    @Override
    public void onLoadMore() {
        page++;
        loadData();
    }
}
