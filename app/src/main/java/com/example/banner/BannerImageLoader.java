package com.example.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * name:高爽
 * date:2017/6/21.
 * desc:
 */
public class BannerImageLoader extends com.youth.banner.loader.ImageLoader{

    private Context context;
    private final ImageLoader imageloader;
    private final DisplayImageOptions options;

    public BannerImageLoader(Context context){
        //创建默认的ImageLoader配置参数
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration
                .createDefault(context);

        //将configuration配置到imageloader中
        imageloader = ImageLoader.getInstance();
        imageloader.init(configuration);

        options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.ARGB_8888)
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher)
                .build();
    }

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        imageloader.displayImage((String) path,imageView,options);
    }
}
