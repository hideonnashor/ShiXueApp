package com.example.sivous.shixue.service;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory(){}
    public static ServiceFactory getServiceFactory(){
        if (serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    public ImageService getImageService(){
        return new ImageService();
    }
}
