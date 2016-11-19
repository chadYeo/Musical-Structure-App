package com.example.android.musicalstructureapp.fragment;


import android.content.Context;
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
public class AlbaumFragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;

    public AlbaumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_albaum, container, false);

        String[] albaums = {"Albaum 1", "Albaum 2", "Albaum 3", "Albaum 4", "Albaum 5"};

        listView = (ListView)v.findViewById(R.id.albaum_listView);

        ArrayList<String> albaumList = new ArrayList<>();
        albaumList.addAll(Arrays.asList(albaums));

        adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, albaumList);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ViewerActivity.class);
                intent.putExtra("fragment", "Albaum");
                startActivity(intent);
            }
        });

        return v;
    }

}
