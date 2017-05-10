package com.example.ramne.ghumke.CityImages.Activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import android.support.v4.view.ViewPager;
import android.os.Bundle;


import com.example.ramne.ghumke.CityImages.Adapters.CityImageAdapter;
import com.example.ramne.ghumke.R;

import java.util.ArrayList;

public class CityImageActivity extends AppCompatActivity {


    private CityImageAdapter mcityImageAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_image);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mcityImageAdapter = new CityImageAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mcityImageAdapter);

    }
}
