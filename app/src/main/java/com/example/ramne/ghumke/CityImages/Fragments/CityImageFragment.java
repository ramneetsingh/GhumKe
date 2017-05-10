package com.example.ramne.ghumke.CityImages.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ramne.ghumke.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class CityImageFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private ArrayList<Integer> imageId=new ArrayList<>();
    private static final String ARG_SECTION_NUMBER = "position",IMAGE="image";

    public CityImageFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static CityImageFragment newInstance(int sectionNumber, ArrayList<Integer> imageId) {
        CityImageFragment fragment = new CityImageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        args.putIntegerArrayList(IMAGE,imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_city_image, container, false);
        ImageView cityimage = (ImageView) rootView.findViewById(R.id.city_image);
        Bundle bundle=getArguments();
        int position=bundle.getInt("position");
        imageId=bundle.getIntegerArrayList("image");
        cityimage.setImageResource(imageId.get(position));
        cityimage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return rootView;
    }
}

