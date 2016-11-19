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
public class PlaylistFragment extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> listAdapter;

    public PlaylistFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_playlist, container, false);

        listView = (ListView)v.findViewById(R.id.playlist_listView);

        String[] items = {"Play List 1", "Play List 2",  "Play List 3", "Play List 4"};
        ArrayList<String> playlists = new ArrayList<>();
        playlists.addAll(Arrays.asList(items));

        listAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item, playlists);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ViewerActivity.class);
                intent.putExtra("fragment", "Playlist");
                startActivity(intent);
            }
        });

        return v;
    }

}
