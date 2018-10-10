package com.binarygeek.onlylayoutsone;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        adapter=new ViewPageAdapter(getSupportFragmentManager());

        //add fragment
        adapter.addFragment(new FoodFirstFragment(),"");
        adapter.addFragment(new FoodFirstFragment(),"");
        adapter.addFragment(new FoodFirstFragment(),"");
        adapter.addFragment(new FoodFirstFragment(),"");
        // adding setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //icon set in tab
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_noodles);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_taco);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_hamburger);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_donut);
        tabLayout.getTabAt(0).setText("chinese");
        tabLayout.getTabAt(1).setText("tacos");
        tabLayout.getTabAt(2).setText("burger");
        tabLayout.getTabAt(3).setText("donut");
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorNormal),getResources().getColor(R.color.colorAccent));
    }
}
