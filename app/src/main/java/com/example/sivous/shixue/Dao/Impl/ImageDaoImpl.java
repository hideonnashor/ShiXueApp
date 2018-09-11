package com.example.sivous.shixue.Dao.Impl;

import com.example.sivous.shixue.Dao.ImageDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageDaoImpl implements ImageDao {
    Map<String, String> imgAndDes;

    @Override
    public Map<String, String> getImgAndDes() {
//        模拟获取数据
        imgAndDes = new HashMap<>();
        imgAndDes.put("https://img3.sycdn.imooc.com/szimg/595067d5000132a105400300.jpg","JS进阶教程");
        imgAndDes.put("https://img2.sycdn.imooc.com/szimg/5abe148300014c3305400300.jpg","ios系统");
        imgAndDes.put("https://climg.mukewang.com/5acd69bb000103d706000338.jpg","spring+mybatis快速搭建服务");
        imgAndDes.put("https://img3.sycdn.imooc.com/szimg/5ac2dfe100014a9005400300.jpg","Vue.js初探");
        imgAndDes.put("https://img4.sycdn.imooc.com/szimg/5959a60f0001cfd305400300.jpg","Android系列");
        return imgAndDes;
    }
}
