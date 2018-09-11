package com.example.sivous.shixue.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

//普通工厂模式
public class AdapterFactory {
    private static AdapterFactory adapterFactory;

    private AdapterFactory() { }

    public static AdapterFactory getFactory() throws IllegalAccessException, InstantiationException {
        if (adapterFactory == null){
            adapterFactory = AdapterFactory.class.newInstance();
        }
        return adapterFactory;
    }

    public MainAcAdapter getMainAcAdapter(FragmentManager fm, List<Fragment> fragmentList){
        return new MainAcAdapter(fm,fragmentList);
    }
}
