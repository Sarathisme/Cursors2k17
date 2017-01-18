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
            list.add(new Data("SHORT FILM MAKING",R.drawable.shortfilm));
            list.add(new Data("MR & MRS CURSORS 2k17",R.drawable.mrmrms));
            list.add(new Data("PHOTOGRAPHY CONTEST",R.drawable.photo));
            list.add(new Data("TREASURE HUNT",R.drawable.treasure));
        DisplayAdapter adapter = new DisplayAdapter(this,list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
