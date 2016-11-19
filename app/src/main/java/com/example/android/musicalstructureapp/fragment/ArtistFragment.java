package com.example.android.musicalstructureapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.ViewerActivity;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtistFragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> listAdapter;

    public ArtistFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_artist, container, false);

        listView = (ListView)v.findViewById(R.id.artist_listView);

        String[] items = {"Artist 1", "Artist 2", "Artist 3", "Artist 4"};

        ArrayList<String> artistList = new ArrayList<String>();
        artistList.addAll(Arrays.asList(items));

        listAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, artistList);

        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ViewerActivity.class);
                intent.putExtra("fragment", "Artist");
                startActivity(intent);
            }
        });

        return v;
    }

}
