package com.example.sarath.cursors2k17;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://cursors2k17.anits.edu.in"));
                startActivity(i);
            }
        });

        View rview = (View)findViewById(R.id.register);
        rview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://cursors2k17.anits.edu.in/registration.php"));
                startActivity(i);
            }
        });

        View view2 = (View)findViewById(R.id.spotevents);
        view2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(ScrollingActivity.this,SpotEvents.class));

            }
        });

        View view = (View)findViewById(R.id.mainevents);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(ScrollingActivity.this,MainEvents.class));
            }
        });

        View view1 = (View)findViewById(R.id.competition);
        view1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(ScrollingActivity.this,Competition.class));
            }
        });

        View workshop = (View)findViewById(R.id.workshop);
        workshop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this,Workshop.class));
            }
        });

        View l1 = (View)findViewById(R.id.hackathon);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.hackathon);
                bundle.putString("data",data1);
                bundle.putString("title","HACKATHON");
                bundle.putInt("image",R.drawable.hackathon);
                i.putExtras(bundle);
                startActivity(i);

            }
        });

        View l2 = (View)findViewById(R.id.techotron);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.technitron);
                bundle.putString("data",data1);
                bundle.putString("title","TECHNITRON");
                bundle.putInt("image",R.drawable.tech);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l3 = (View)findViewById(R.id.coding);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.coding);
                bundle.putString("data",data1);
                bundle.putString("title","CODING");
                bundle.putInt("image",R.drawable.coding);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l4 = (View)findViewById(R.id.mini);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.mini);
                bundle.putString("data",data1);
                bundle.putString("title","MINI MILITIA");
                bundle.putInt("image",R.drawable.minimilitia);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l5 = (View)findViewById(R.id.halloween);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.lan);
                bundle.putString("data",data1);
                bundle.putString("title","LAN GAMING");
                bundle.putInt("image",R.drawable.lan);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l6 = (View)findViewById(R.id.dubsmash);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.dubsmash);
                bundle.putString("data",data1);
                bundle.putString("title","DUBSMASH");
                bundle.putInt("image",R.drawable.dubsmash);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l7 = (View)findViewById(R.id.photo);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.phtography);
                bundle.putString("data",data1);
                bundle.putString("title","PHOTOGRAPHY CONTEST");
                bundle.putInt("image",R.drawable.photo);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l8 = (View)findViewById(R.id.shortfilm);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.shortfilm);
                bundle.putString("data",data1);
                bundle.putString("title","SHORT FILM MAKING");
                bundle.putInt("image",R.drawable.shortfilm);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        View l9 = (View)findViewById(R.id.treasure);
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScrollingActivity.this,MoreActivity.class);
                Bundle bundle = new Bundle();
                String data1 = getResources().getString(R.string.treasurehunt);
                bundle.putString("data",data1);
                bundle.putString("title","TREASURE HUNT");
                bundle.putInt("image",R.drawable.treasure);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            call();
        }
        if (id==R.id.aboutus){
            callaboutus();
        }
        if (id==R.id.contactus){
            callcontactus();
        }
        if(id == R.id.maps){
            callMaps();
        }
        return super.onOptionsItemSelected(item);
    }

    public void call(){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.anits.edu.in"));
        startActivity(i);
    }

    public void callaboutus(){
        startActivity(new Intent(ScrollingActivity.this,AboutUs.class));
    }

    public void callcontactus(){
        startActivity(new Intent(ScrollingActivity.this,ContactUs.class));
    }

    public void callMaps(){
        startActivity(new Intent(ScrollingActivity.this,MapsActivity.class));
    }
}


