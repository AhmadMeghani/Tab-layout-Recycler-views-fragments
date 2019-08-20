package com.abcx.myapplication;

import android.widget.ImageView;

public class listItem {

    private String Heading;
    private String Description;
    private int logo;

    public listItem(String heading, String description) {
        Heading = heading;
        Description = description;
        //logo = imageView;
    }

    public String getHeading() {
        return Heading;
    }

    public String getDescription() {
        return Description;
    }

    //public int getlogo(){ return logo; }
}
