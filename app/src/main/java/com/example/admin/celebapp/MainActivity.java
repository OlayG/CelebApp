package com.example.admin.celebapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    private static final String CELEB_LIST_FRAGMENT = "CelebListFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CelebrityListFragment celebrityListFragment = new CelebrityListFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.flFrag1, celebrityListFragment, CELEB_LIST_FRAGMENT).commit();
    }

}
