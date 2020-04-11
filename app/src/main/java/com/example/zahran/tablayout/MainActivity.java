package com.example.zahran.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager  viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.main_tablaayout);
        viewPager=findViewById(R.id.main_pager);

        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addTab(new Mytab("Food",CategeryFragment.newInstance(1,"Food")));
        pagerAdapter.addTab(new Mytab("Drinks",CategeryFragment.newInstance(2,"Drinks")));
        pagerAdapter.addTab(new Mytab("Deserts",CategeryFragment.newInstance(3,"Deserts")));
        pagerAdapter.addTab(new Mytab("Others",CategeryFragment.newInstance(4,"Others")));

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}
