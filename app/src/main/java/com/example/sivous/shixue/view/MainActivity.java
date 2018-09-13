package com.example.sivous.shixue.view;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.astuetz.PagerSlidingTabStrip;
import com.example.sivous.shixue.R;
import com.example.sivous.shixue.view.adapter.AdapterFactory;
import com.example.sivous.shixue.view.fragment.ComFrag;
import com.example.sivous.shixue.view.fragment.HomeFrag;
import com.example.sivous.shixue.view.fragment.PersonFrag;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeFrag.OnFragmentInteractionListener
                                                , ComFrag.OnFragmentInteractionListener
                                                , PersonFrag.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//          get fragements and generate list
        HomeFrag homeFrag = new HomeFrag();
        ComFrag comFrag = new ComFrag();
        PersonFrag personFrag = new PersonFrag();
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(homeFrag);
        fragmentList.add(comFrag);
        fragmentList.add(personFrag);
//          Initialize the ViewPager and set an adapter
        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        try {
            pager.setAdapter(AdapterFactory.getFactory().getMainAcAdapter(getSupportFragmentManager(),fragmentList));
            //tab
            // Bind the tabs to the ViewPager
            PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
            tabs.setViewPager(pager);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
