package com.example.ramne.ghumke.CityImages.Adapters;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import com.example.ramne.ghumke.CityImages.Fragments.CityImageFragment;
import com.example.ramne.ghumke.R;

import java.util.ArrayList;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class CityImageAdapter extends FragmentPagerAdapter {

    private ArrayList<Integer> imageId=new ArrayList<>();
    public CityImageAdapter(FragmentManager fm)
    {
        super(fm);
    }

    public void setData()
    {
        imageId.add(R.drawable.aminabad);
        imageId.add(R.drawable.chowk);
        imageId.add(R.drawable.clocktower);
        imageId.add(R.drawable.imambara);
        imageId.add(R.drawable.lkozoo);
        imageId.add(R.drawable.mishrapark);
        imageId.add(R.drawable.rumi);
    }
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a CityImageFragment (defined as a static inner class below).
        setData();
        CityImageFragment cityimageFragment=new CityImageFragment();
        return cityimageFragment.newInstance(position,imageId);
    }

    @Override
    public int getCount() {
        // Show total pages.
      return  imageId.size();
    }

}