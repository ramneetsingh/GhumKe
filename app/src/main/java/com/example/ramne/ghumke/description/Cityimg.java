package com.example.ramne.ghumke.description;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ramne.ghumke.R;

import java.util.ArrayList;

public class Cityimg extends AppCompatActivity {

    ViewPager viewPager;
    int code;
    private ArrayList<Integer> imageId=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityimg);

        Intent mIntent = getIntent();
        code = mIntent.getIntExtra("lucknow", 0);

        if(code==7)
        {

                    imageId.add(R.drawable.aminabad);
                    imageId.add(R.drawable.chowk);
                    imageId.add(R.drawable.clocktower);
                    imageId.add(R.drawable.imambara);
                    imageId.add(R.drawable.lkozoo);
                    imageId.add(R.drawable.mishrapark);
                    imageId.add(R.drawable.rumi);

        }
        if(code==1)
        {

            imageId.add(R.drawable.ah2);
            imageId.add(R.drawable.ah3);
            imageId.add(R.drawable.ah4);
            imageId.add(R.drawable.ah5);
            imageId.add(R.drawable.ah6);
            imageId.add(R.drawable.ah7);
            imageId.add(R.drawable.ah8);

        }
        if(code==2)
        {
            imageId.add(R.drawable.b2);
            imageId.add(R.drawable.b3);
            imageId.add(R.drawable.b4);
            imageId.add(R.drawable.b5);
            imageId.add(R.drawable.b6);
            imageId.add(R.drawable.b7);
            imageId.add(R.drawable.b8);

        }
        if(code==3)
        {
            imageId.add(R.drawable.c2);
            imageId.add(R.drawable.c3);
            imageId.add(R.drawable.c4);
            imageId.add(R.drawable.c5);
            imageId.add(R.drawable.c6);
            imageId.add(R.drawable.c7);
            imageId.add(R.drawable.c8);

        }
        if(code==4)
        {
            imageId.add(R.drawable.d2);
            imageId.add(R.drawable.d3);
            imageId.add(R.drawable.d4);
            imageId.add(R.drawable.d5);
            imageId.add(R.drawable.d6);
            imageId.add(R.drawable.d7);
            imageId.add(R.drawable.d8);

        }
        if(code==5)
        {
            imageId.add(R.drawable.h2);
            imageId.add(R.drawable.h3);
            imageId.add(R.drawable.h4);
            imageId.add(R.drawable.h5);
            imageId.add(R.drawable.h6);
            imageId.add(R.drawable.h7);
            imageId.add(R.drawable.h8);

        }
        if(code==6)
        {
            imageId.add(R.drawable.k2);
            imageId.add(R.drawable.k3);
            imageId.add(R.drawable.k4);
            imageId.add(R.drawable.k5);
            imageId.add(R.drawable.k6);
            imageId.add(R.drawable.k7);
            imageId.add(R.drawable.k8);

        }
        if(code==8)
        {
            imageId.add(R.drawable.m2);
            imageId.add(R.drawable.m3);
            imageId.add(R.drawable.m4);
            imageId.add(R.drawable.m5);
            imageId.add(R.drawable.m6);
            imageId.add(R.drawable.m7);

        }

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        PagerAdapter adapter = new CustomAdapter(Cityimg.this,imageId);
        viewPager.setAdapter(adapter);

    }

    public class CustomAdapter extends PagerAdapter{

        Context context;
        ArrayList<Integer> imageId;

        public CustomAdapter(Context context,ArrayList<Integer> imageId){
            this.context = context;
            this.imageId=imageId;

        }


        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // TODO Auto-generated method stub

            LayoutInflater inflater = ((Activity)context).getLayoutInflater();

            View viewItem = inflater.inflate(R.layout.image_single, container, false);
            ImageView imageView = (ImageView) viewItem.findViewById(R.id.imageView);
            imageView.setImageResource(imageId.get(position));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ((ViewPager)container).addView(viewItem);

            return viewItem;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return imageId.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            // TODO Auto-generated method stub

            return view == ((View)object);
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            // TODO Auto-generated method stub
            ((ViewPager) container).removeView((View) object);
        }

    }
}
