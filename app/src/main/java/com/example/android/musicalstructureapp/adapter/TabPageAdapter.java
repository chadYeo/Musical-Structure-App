package com.example.android.musicalstructureapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.musicalstructureapp.fragment.AlbaumFragment;
import com.example.android.musicalstructureapp.fragment.ArtistFragment;
import com.example.android.musicalstructureapp.fragment.PlaylistFragment;
import com.example.android.musicalstructureapp.fragment.SongFragment;

/**
 * Created by ChadYeo on 11/12/16.
 */
public class TabPageAdapter extends FragmentStatePagerAdapter{

    int mNumOfTabs;

    public TabPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlaylistFragment();
            case 1:
                return new ArtistFragment();
            case 2:
                return new AlbaumFragment();
            case 3:
                return new SongFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
