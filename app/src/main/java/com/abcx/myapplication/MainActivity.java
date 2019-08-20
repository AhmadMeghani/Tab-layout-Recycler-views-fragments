package com.abcx.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.abcx.myapplication.ui.main.SectionsPagerAdapter;
import com.abcx.myapplication.ui.main.SectionsPagerAdapter0;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter0 sectionsPagerAdapter0 = new SectionsPagerAdapter0(this, getSupportFragmentManager());
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter0);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        ViewPager viewPager1 = findViewById(R.id.view_pager1);
        viewPager1.setAdapter(sectionsPagerAdapter);
        TabLayout tabs1 = findViewById(R.id.tabs1);
        tabs1.setupWithViewPager(viewPager1);






    }








}