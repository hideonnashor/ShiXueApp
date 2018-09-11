package com.example.sivous.shixue.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.youth.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //Picasso 加载图片简单用法
        Picasso.with(context).load((String) path).into(imageView);
    }
}
