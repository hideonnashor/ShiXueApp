package com.example.sivous.shixue.Dao;

import com.example.sivous.shixue.Dao.Impl.ContentDaoImpl;

//普通工厂模式
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){}
    public static DaoFactory getDaoFactory(){
        if (daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    public ContentDao getImageDao(){
        return new ContentDaoImpl();
    }
}
