package com.abcx.myapplication.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.abcx.myapplication.R;
import com.abcx.myapplication.action_frag;
import com.abcx.myapplication.adv_frag;
import com.abcx.myapplication.comedy_frag;
import com.abcx.myapplication.demo_frag;
import com.abcx.myapplication.drama_frag;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES1 = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4};
    private final Context mContext1;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext1 = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new demo_frag();
                break;
            case 1:
                fragment = new drama_frag();
                break;
            case 2:
                fragment = new adv_frag();
                break;
            case 3:
                fragment = new comedy_frag();


        }
        return fragment;


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext1.getResources().getString(TAB_TITLES1[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}