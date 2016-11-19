package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class ViewerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListAdapter listAdapter;
        ListView listView = (ListView)findViewById(R.id.listView);

        String fragment = getIntent().getStringExtra("fragment");

        if (fragment.equals("Playlist")) {
            String[] items = {"Song 1", "Song 2", "Song 3", "Song 4"};
            ArrayList<String> playlists = new ArrayList<>();
            playlists.addAll(Arrays.asList(items));

            listAdapter = new ArrayAdapter<>(ViewerActivity.this, R.layout.list_item, playlists);
            listView.setAdapter(listAdapter);
        }

        if (fragment.equals("Artist")) {
            String[] items = {"Alpha", "Beta", "Charles", "Delta"};
            ArrayList<String> artists = new ArrayList<>();
            artists.addAll(Arrays.asList(items));

            listAdapter = new ArrayAdapter<>(ViewerActivity.this, R.layout.list_item, artists);
            listView.setAdapter(listAdapter);
        }

        if (fragment.equals("Albaum")) {
            String[] items = {"Artist Alpha", "Artist Beta", "Artist Charles"};
            ArrayList<String> albaums = new ArrayList<>();
            albaums.addAll(Arrays.asList(items));

            listAdapter = new ArrayAdapter<>(ViewerActivity.this, R.layout.list_item, albaums);
            listView.setAdapter(listAdapter);
        }
    }

}
