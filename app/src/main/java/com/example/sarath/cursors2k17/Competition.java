package com.example.sarath.cursors2k17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Competition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Data> list =new ArrayList<Data>();
            list.add(new Data("SHORT FILM MAKING",R.drawable.shortfilm,R.string.dummy));
            list.add(new Data("MR & MRS CURSORS 2k17",R.drawable.mrmrms,R.string.dummy));
            list.add(new Data("PHOTOGRAPHY CONTEST",R.drawable.photo,R.string.dummy));
            list.add(new Data("TREASURE HUNT",R.drawable.treasure,R.string.dummy));
        DisplayAdapter adapter = new DisplayAdapter(this,list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
