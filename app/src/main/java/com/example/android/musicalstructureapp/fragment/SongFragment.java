package com.example.android.musicalstructureapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.musicalstructureapp.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class SongFragment extends Fragment {

    ListView listView;
    ArrayList<String> songList;
    ArrayAdapter<String> adapter;

    public SongFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_song, container, false);

        String[] items ={"Song 1", "Song 2", "Song 3", "Song 4", "Song 5", "Song 6", "Song 7"};

        listView = (ListView)v.findViewById(R.id.song_listView);

        songList = new ArrayList<>();
        songList.addAll(Arrays.asList(items));

        adapter = new ArrayAdapter<>(getActivity(), R.layout.list_item, songList);
        listView.setAdapter(adapter);

        return v;
    }

}
