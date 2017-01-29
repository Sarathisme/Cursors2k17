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

public class SpotEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.list_view);

        final ArrayList<Data> list =new ArrayList<Data>();
        list.add(new Data("MINI MILITIA",R.drawable.minimilitia,R.string.mini));
        list.add(new Data("HALLOWEEN",R.drawable.halloween,R.string.dummy));
        list.add(new Data("LAN GAMING",R.drawable.lan,R.string.lan));
        list.add(new Data("ANTHAKSHARI",R.drawable.antakshari,R.string.antakshari));
        list.add(new Data("LOGO IDENTIFICATION",R.drawable.logo,R.string.logo));
        list.add(new Data("DUBSMASH",R.drawable.dubsmash,R.string.dubsmash));
        list.add(new Data("IMPROMPTU SPEAKING",R.drawable.impromptu,R.string.impromptu));
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
