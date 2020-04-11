package com.example.zahran.tablayout;

import android.support.v4.app.Fragment;

/**
 * Created by zahran on 4/11/2020.
 */

public class Mytab {

    String tab_name;
    Fragment fragment;

    public Mytab(String tab_name, Fragment fragment) {
        this.tab_name = tab_name;
        this.fragment = fragment;
    }

    public String getTab_name() {
        return tab_name;
    }

    public void setTab_name(String tab_name) {
        this.tab_name = tab_name;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
