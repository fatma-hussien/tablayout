package com.example.zahran.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by zahran on 4/11/2020.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Mytab> tabs=new ArrayList<>();
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addTab(Mytab mytab)
    {
        tabs.add(mytab);
    }
    @Override
    public Fragment getItem(int position) {
        return tabs.get(position).getFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTab_name();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
