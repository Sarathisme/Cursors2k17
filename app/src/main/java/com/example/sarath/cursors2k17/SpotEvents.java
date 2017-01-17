package com.example.sarath.cursors2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SpotEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Data> list =new ArrayList<Data>();
        list.add(new Data("Mini Militia"));
        list.add(new Data("Halloween"));
        list.add(new Data("Quiz"));
        list.add(new Data("LAN Gaming"));
        list.add(new Data("Anthakshari"));
        list.add(new Data("Logo Designing"));
        list.add(new Data("Dubsmash"));
        DisplayAdapter adapter = new DisplayAdapter(this,list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
