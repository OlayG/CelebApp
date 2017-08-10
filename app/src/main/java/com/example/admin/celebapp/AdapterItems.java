package com.example.admin.celebapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Admin on 8/9/2017.
 */

public class AdapterItems {

    int Photo;
    public String FullName, Age, Profession;

    public AdapterItems(int photo, String fullName, String age, String profession) {
        Photo = photo;
        FullName = fullName;
        Age = age;
        Profession = profession;
    }
}
