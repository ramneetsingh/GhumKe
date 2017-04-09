package com.example.ramne.ghumke.description;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ramne.ghumke.CustomGrid;
import com.example.ramne.ghumke.R;

import java.util.ArrayList;

public class Cityplaces extends AppCompatActivity {

    int code;
    ArrayList<Integer> image = new ArrayList<>();
    ArrayList<String> head = new ArrayList<>();
    ArrayList<String> descpt = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityplaces);

        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);
        ImageView famous = (ImageView) findViewById(R.id.famousplaces);
        ListView mListView = (ListView) findViewById(R.id.list);


        Intent mIntent = getIntent();
        code = mIntent.getIntExtra("lucknow", 0);

        if (code == 7) {
            image.add(R.drawable.rumi);
            image.add(R.drawable.chowk);
            image.add(R.drawable.clocktower);
            image.add(R.drawable.imambara);

            head.add("Rumi Darwaza");
            head.add("Chowk Market");
            head.add("Husainabad Clock Tower");
            head.add("Bada Imambara");

            descpt.add(getString(R.string.rumi));
            descpt.add(getString(R.string.chowk));
            descpt.add(getString(R.string.clock));
            descpt.add(getString(R.string.imambara));
        }

        if (code == 1) {
            image.add(R.drawable.ah2);
            image.add(R.drawable.ah3);
            image.add(R.drawable.ah4);
            image.add(R.drawable.ah5);

            head.add("Sabarmati Ashram");
            head.add("Kankaria Lake");
            head.add("Gurudwara Gobind Dham");
            head.add("Sidi Saiyed's Mosque");

            descpt.add(getString(R.string.a2));
            descpt.add(getString(R.string.a3));
            descpt.add(getString(R.string.a4));
            descpt.add(getString(R.string.a5));
        }

        if (code == 2) {
            image.add(R.drawable.b2);
            image.add(R.drawable.b3);
            image.add(R.drawable.b4);
            image.add(R.drawable.b5);

            head.add("Nandi Temple");
            head.add("Wonderla");
            head.add("Bannerghatta National Park");
            head.add("Venkatappa Art Gallery");

            descpt.add(getString(R.string.b2));
            descpt.add(getString(R.string.b3));
            descpt.add(getString(R.string.b4));
            descpt.add(getString(R.string.b5));
        }
        if (code == 3) {
            image.add(R.drawable.c2);
            image.add(R.drawable.c3);
            image.add(R.drawable.c4);
            image.add(R.drawable.c5);

            head.add("Kali Kambal Temple");
            head.add("Guindy National Park");
            head.add("Tirumala Tirupathi Devasthanam");
            head.add("San Thome Church");

            descpt.add(getString(R.string.c2));
            descpt.add(getString(R.string.c3));
            descpt.add(getString(R.string.c4));
            descpt.add(getString(R.string.c5));
        }
        if (code == 4) {
            image.add(R.drawable.d2);
            image.add(R.drawable.d3);
            image.add(R.drawable.d4);
            image.add(R.drawable.d5);

            head.add("Qutb Minar");
            head.add("Lotus Temple");
            head.add("Akshardham Temple");
            head.add("Gurudwara Bangla Sahib");

            descpt.add(getString(R.string.d2));
            descpt.add(getString(R.string.d3));
            descpt.add(getString(R.string.d4));
            descpt.add(getString(R.string.d5));
        }
        if (code == 5) {
            image.add(R.drawable.h2);
            image.add(R.drawable.h3);
            image.add(R.drawable.h4);
            image.add(R.drawable.h5);

            head.add("Golkonda Fort");
            head.add("Charminar");
            head.add("Hussain Sagar");
            head.add("Ramoji Film City");

            descpt.add(getString(R.string.h2));
            descpt.add(getString(R.string.h3));
            descpt.add(getString(R.string.h4));
            descpt.add(getString(R.string.h5));
        }
        if (code == 6) {
            image.add(R.drawable.k2);
            image.add(R.drawable.k3);
            image.add(R.drawable.k4);
            image.add(R.drawable.k5);

            head.add("Victoria Memorial");
            head.add("Indian Museum");
            head.add("Kalighat Kali Temple");
            head.add("Eden Gardens");

            descpt.add(getString(R.string.k2));
            descpt.add(getString(R.string.k3));
            descpt.add(getString(R.string.k4));
            descpt.add(getString(R.string.k5));
        }
        if (code == 8) {
            image.add(R.drawable.m2);
            image.add(R.drawable.m3);
            image.add(R.drawable.m4);
            image.add(R.drawable.m5);

            head.add("Gateway Of India");
            head.add("Haji Ali Dargah");
            head.add("Siddhivinayak Temple");
            head.add("Essel World");

            descpt.add(getString(R.string.m2));
            descpt.add(getString(R.string.m3));
            descpt.add(getString(R.string.m4));
            descpt.add(getString(R.string.m5));
        }
        mListView.setAdapter(new MyAdapter());

    }


    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return image.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (null == convertView) {

                convertView = getLayoutInflater().inflate(R.layout.list_single, parent, false);
                holder = new ViewHolder();
                holder.headding = (TextView) convertView.findViewById(R.id.title);
                holder.description = (TextView) convertView.findViewById(R.id.description);
                holder.famousplace = (ImageView) convertView.findViewById(R.id.famousplaces);

                convertView.setTag(holder);
            }
            else {
                holder=(ViewHolder)convertView.getTag();
            }
            holder.headding.setText(head.get(position));
            holder.description.setText(descpt.get(position));
            holder.famousplace.setImageResource(image.get(position));
            holder.famousplace.setScaleType(ImageView.ScaleType.CENTER_CROP);

            return convertView;
        }

        private class ViewHolder {
            TextView headding;
            ImageView famousplace;
            TextView description;
        }
    }
}