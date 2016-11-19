package com.example.android.musicalstructureapp.detailFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.musicalstructureapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Albaum_Detail_Fragment extends Fragment {

    public Albaum_Detail_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_albaum_detail, container, false);


        return v;
    }

}
