package com.hfad.certification;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private CertificationOpenHelper mHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
        TabLayout tabLayout =(TabLayout)findViewById(R.id.tablayout);
        mHelper = new CertificationOpenHelper(this);
        pager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(pager);
        SQLiteDatabase db = mHelper.getReadableDatabase();
    }

    @Override
    protected void onDestroy() {
        mHelper.close();
        super.onDestroy();
    }

    private class PagerAdapter extends FragmentPagerAdapter{

        public PagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    return new HomeFragment();
                case 1:
                    return new BProductsFragment();
                case 2:
                    return new CatFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Home";
                case 1:
                    return "Products";
                case 2:
                    return "Category";
            }
            return null;
        }
    }

}
