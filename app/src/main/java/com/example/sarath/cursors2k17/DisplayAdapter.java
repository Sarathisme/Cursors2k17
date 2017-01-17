package com.example.sarath.cursors2k17;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sarath on 17/1/17.
 */

public class DisplayAdapter extends ArrayAdapter<Data> {

    public DisplayAdapter(Activity context,ArrayList<Data> items){
        super(context,0,items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView==null){
            listView= LayoutInflater.from(getContext()).inflate(R.layout.display_list,parent,false);
        }

        Data data = getItem(position);

        TextView title = (TextView)listView.findViewById(R.id.title);
        title.setText(data.getmTitle());
        
        return listView;
    }
}
