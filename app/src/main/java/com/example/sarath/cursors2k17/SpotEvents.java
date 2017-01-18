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
        list.add(new Data("MINI MILITIA",R.drawable.minimilitia));
        list.add(new Data("HALLOWEEN",R.drawable.halloween));
        list.add(new Data("LAN GAMING",R.drawable.lan));
        list.add(new Data("ANTHAKSHARI",R.drawable.antakshari));
        list.add(new Data("LOGO IDENTIFICATION",R.drawable.logo));
        list.add(new Data("DUBSMASH",R.drawable.dubsmash));
        list.add(new Data("IMPROMPTU SPEAKING",R.drawable.impromptu));
        DisplayAdapter adapter = new DisplayAdapter(this,list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
