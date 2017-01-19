package com.example.sarath.cursors2k17;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MoreActivity.this,ScrollingActivity.class));
            }
        });

//        Bundle extras = getIntent().getExtras();
//        String title=extras.getString("title");
//        String data=extras.getString("data");
//        int mid = extras.getInt("image");

//        Drawable img = getResources().getDrawable(mid);
//
//        ImageView image = (ImageView)findViewById(R.id.image);
//        image.setImageDrawable(img);
//
//        TextView tv = (TextView)findViewById(R.id.data);
//        tv.setText(data);
    }

}
