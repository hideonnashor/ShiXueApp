package com.example.sivous.shixue.Dao.Impl;

import com.example.sivous.shixue.Dao.ContentDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentDaoImpl implements ContentDao {
    Map<String, String> imgAndDes;
    List<Map<String,String>> imaTitleDes;

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

    @Override
    public List<Map<String,String>> getTitleDes() {
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("title","提问：关于JS的几个问题");
        map1.put("description", "JavaScript 是属于网络的脚本语言！\n" +
                "\n" +
                "JavaScript 被数百万计的网页用来改进设计、验证表单、检测浏览器、创建cookies，以及更多的应用。");

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("title","学习：ios学习(一)");
        map2.put("description","iOS是由苹果公司开发的移动操作系统。苹果公司最早于2007年1月9日的Macworld大会上公布这个系统，最初是设计给iPhone使用的");

        HashMap<String,String> map3 = new HashMap<>();
        map3.put("title","学习：spring源码解析");
        map3.put("description","Spring的整体架构Spring框架是一个分层架构,它包含一系列的功能要素,并被分为大约20个模块");

        HashMap<String,String> map4 = new HashMap<>();
        map4.put("title","学习：Vue.js的前世今生");
        map4.put("description","不断繁荣的生态系统，可以在一个库和一套完整框架之间自如伸缩");

        HashMap<String,String> map5 = new HashMap<>();
        map5.put("title","提问：Android中的ListAdapter");
        map5.put("description","如何选用合适的ListAdapter");

        HashMap<String,String> map6 = new HashMap<>();
        map6.put("title","学习：十九大报告");
        map6.put("description","决胜全面建成小康社会 夺取新时代中国特色社会主义伟大胜利");

        HashMap<String,String> map7 = new HashMap<>();
        map7.put("title","关于本论坛社区");
        map7.put("description","");

        HashMap<String,String> map8 = new HashMap<>();
        map8.put("title","提问：关于JS的几个问题（二）");
        map8.put("description", "JavaScript是属于网络的脚本语言！\n" +
                "\n" +
                "JavaScript 被数百万计的网页用来改进设计、验证表单、检测浏览器、创建cookies，以及更多的应用。");

        HashMap<String,String> map9 = new HashMap<>();
        map9.put("title","学习：ios学习(二)");
        map9.put("description","iOS系统是由苹果公司开发的移动操作系统。苹果公司最早于2007年1月9日的Macworld大会上公布这个系统，最初是设计给iPhone使用的");

        HashMap<String,String> map10 = new HashMap<>();
        map10.put("title","学习：spring源码解析（二）");
        map10.put("description","Spring的整体架构Spring框架是一个分层架构,它包含一系列的功能要素");

        HashMap<String,String> map11 = new HashMap<>();
        map11.put("title","学习：Vue.js的未来");
        map11.put("description","Vue究竟要何去何从");

        HashMap<String,String> map12 = new HashMap<>();
        map12.put("title","提问：Android中的ListAdapter详解");
        map12.put("description","如何选用合适的ListAdapter种类");

        HashMap<String,String> map13 = new HashMap<>();
        map13.put("title","学习：十九大报告（二）");
        map13.put("description","决胜全面建成小康社会 夺取新时代中国特色社会主义伟大胜利");

        HashMap<String,String> map14 = new HashMap<>();
        map14.put("title","关于本论坛社区");
        map14.put("description","");

        imaTitleDes = new ArrayList<>();
        imaTitleDes.add(map1);
        imaTitleDes.add(map2);
        imaTitleDes.add(map3);
        imaTitleDes.add(map4);
        imaTitleDes.add(map5);
        imaTitleDes.add(map6);
        imaTitleDes.add(map7);
        imaTitleDes.add(map8);
        imaTitleDes.add(map9);
        imaTitleDes.add(map10);
        imaTitleDes.add(map11);
        imaTitleDes.add(map12);
        imaTitleDes.add(map13);
        imaTitleDes.add(map14);

        return imaTitleDes;
    }
}
