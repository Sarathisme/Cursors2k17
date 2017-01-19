package com.example.sarath.cursors2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Data> list =new ArrayList<Data>();
        list.add(new Data("HACKATHON",R.drawable.hackathon,R.string.dummy));
        list.add(new Data("TECHNOTRON",R.drawable.tech,R.string.dummy));
        list.add(new Data("CODING",R.drawable.coding,R.string.dummy));
        list.add(new Data("PAPER PRESENTATION",R.drawable.paperpresentation,R.string.dummy));
        list.add(new Data("POSTER PRESENTATION",R.drawable.poster,R.string.dummy));
        list.add(new Data("AD MAKING",R.drawable.admaking,R.string.dummy));
        DisplayAdapter adapter = new DisplayAdapter(this,list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
