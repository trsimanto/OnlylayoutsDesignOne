package com.binarygeek.onlylayoutsone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentListTitle = new ArrayList<>();
    private final List<Integer> fragmentListIcon = new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitle.size();
    }
    public CharSequence getPageTitle(int position) {
        return fragmentListTitle.get(position);
    }
    public int getPageicon(int position) {
        return fragmentListIcon.get(position);
    }

    public void addFragment(Fragment fragment,String Title)
    {
        fragmentList.add(fragment);
        fragmentListTitle.add(Title);
    }

}
