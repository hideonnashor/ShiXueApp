package com.example.sivous.shixue.service;

import com.example.sivous.shixue.Dao.DaoFactory;
import com.example.sivous.shixue.Dao.ImageDao;

import java.util.*;

public class ImageService {
    Map<String,String> imgAndDes;
    List<String> images;
    List<String> descriptions;

    public Map<List<String>,List<String>> getImgAndDes(){
        ImageDao imageDao = DaoFactory.getDaoFactory().getImageDao();
        imgAndDes = imageDao.getImgAndDes();
        images = new ArrayList<>();
        descriptions = new ArrayList<>();
        for (Map.Entry entry:imgAndDes.entrySet()){
            images.add((String) entry.getKey());
            descriptions.add((String) entry.getValue());
        }
        Map<List<String>,List<String>> map = new HashMap<>();
        map.put(images,descriptions);
        return map;
    }
}
