package com.example.sivous.shixue.view;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.astuetz.PagerSlidingTabStrip;
import com.example.sivous.shixue.R;
import com.example.sivous.shixue.view.adapter.AdapterFactory;
import com.example.sivous.shixue.view.fragment.ComFrag;
import com.example.sivous.shixue.view.fragment.HomeFrag;
import com.example.sivous.shixue.view.fragment.PersonFrag;
import com.ikimuhendis.ldrawer.ActionBarDrawerToggle;
import com.ikimuhendis.ldrawer.DrawerArrowDrawable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeFrag.OnFragmentInteractionListener
                                                , ComFrag.OnFragmentInteractionListener
                                                , PersonFrag.OnFragmentInteractionListener {

    private DrawerArrowDrawable drawerArrow;
    private ActionBarDrawerToggle mDrawerToggle;
    private  DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private List<String> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initialize the drawer menu
        drawerArrow = new DrawerArrowDrawable(this) {
            @Override
            public boolean isLayoutRtl() {
                return false;
            }
        };
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerList = findViewById(R.id.navdrawer);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                drawerArrow, R.string.drawer_open,
                R.string.drawer_close) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        values = new ArrayList<String>();
        values.add("Home icon");
        values.add("Start Animation");
        values.add("Change Color");
        values.add("GitHub Page");
        values.add("Share");
        values.add("Rate");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.mainac_drawer,values);
        mDrawerList.setAdapter(adapter);

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
