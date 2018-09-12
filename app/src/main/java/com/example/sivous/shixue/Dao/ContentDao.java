package com.example.sivous.shixue.Dao;

import java.util.List;
import java.util.Map;

public interface ContentDao {
    public Map<String,String> getImgAndDes();
    public List<Map<String,String>> getTitleDes();
}
