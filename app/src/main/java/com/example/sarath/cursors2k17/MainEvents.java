package com.example.sarath.cursors2k17;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.list_view);

        final ArrayList<Data> list =new ArrayList<Data>();
        list.add(new Data("HACKATHON",R.drawable.hackathon,R.string.hackathon));
        list.add(new Data("TECHNITRON",R.drawable.tech,R.string.technitron));
        list.add(new Data("CODING",R.drawable.coding,R.string.coding));
        list.add(new Data("PAPER PRESENTATION",R.drawable.paperpresentation,R.string.paper));
        list.add(new Data("POSTER PRESENTATION",R.drawable.poster,R.string.poster));
        list.add(new Data("AD MAKING",R.drawable.admaking,R.string.admaking));
        DisplayAdapter adapter = new DisplayAdapter(this,list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new ListView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Data data = list.get(position);
                int sid = data.getmData();
                String data1 = getResources().getString(sid);
                Bundle bundle = new Bundle();
                bundle.putString("data",data1);
                bundle.putString("title",data.getmTitle());
                bundle.putInt("image",data.getmImage());
                callActivity(bundle);

            }
        });
    }

    public void callActivity(Bundle b){
        Context context = getBaseContext();
        Intent i = new Intent(context,MoreActivity.class);
        i.putExtras(b);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
