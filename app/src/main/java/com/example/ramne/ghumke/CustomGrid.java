package com.example.ramne.ghumke;

/**
 * Created by ramne on 3/29/2017.
 */

import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.ramne.ghumke.R.id.imageView;

public class CustomGrid extends BaseAdapter {
    private Context mContext;
    String []cities;
    int []Imageid;

    public CustomGrid(Context c,String []cities,int []Imageid) {
        mContext = c;
        this.Imageid = Imageid;
        this.cities = cities;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return cities.length;
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

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (null == convertView) {
            //LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            LayoutInflater li = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.grid_single,parent, false);

            holder = new ViewHolder();
            holder.cityname = (TextView) convertView.findViewById(R.id.grid_text);
            holder.cityimage = (ImageView) convertView.findViewById(R.id.grid_image);

            convertView.setTag(holder);
        }
        else { holder = (ViewHolder) convertView.getTag();
        }
        holder.cityname.setText(cities[position]);
        holder.cityimage.setImageResource(Imageid[position]);
        holder.cityimage.setScaleType(ImageView.ScaleType.CENTER_CROP);

        return convertView; }

    private class ViewHolder {
         TextView cityname;
         ImageView cityimage;

    }
}