package com.example.sarath.cursors2k17;

/**
 * Created by sarath on 17/1/17.
 */

public class Data {

    private String mTitle;
    private int mImage;
    private int mData;
    public Data(String title,int image,int data){
        mTitle=title;
        mImage=image;
        mData=data;
    }

    public String getmTitle(){
        return mTitle;
    }
    public int getmImage(){return mImage;}
    public int getmData(){
        return mData;
    }

}
