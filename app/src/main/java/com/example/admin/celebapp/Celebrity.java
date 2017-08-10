package com.example.admin.celebapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Admin on 8/9/2017.
 */

public class Celebrity implements Parcelable{

    String name, profesion, discription, height, dob, siblings, funfact, age;
    int photo;

    public Celebrity(String name, String profesion, String discription, String height, String dob, String siblings, String funfact, String age, int photo) {
        this.name = name;
        this.profesion = profesion;
        this.discription = discription;
        this.height = height;
        this.dob = dob;
        this.siblings = siblings;
        this.funfact = funfact;
        this.age = age;
        this.photo = photo;
    }

    protected Celebrity(Parcel in) {
        name = in.readString();
        profesion = in.readString();
        discription = in.readString();
        height = in.readString();
        dob = in.readString();
        siblings = in.readString();
        funfact = in.readString();
        age = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Celebrity> CREATOR = new Creator<Celebrity>() {
        @Override
        public Celebrity createFromParcel(Parcel in) {
            return new Celebrity(in);
        }

        @Override
        public Celebrity[] newArray(int size) {
            return new Celebrity[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSiblings() {
        return siblings;
    }

    public void setSiblings(String siblings) {
        this.siblings = siblings;
    }

    public String getFunfact() {
        return funfact;
    }

    public void setFunfact(String funfact) {
        this.funfact = funfact;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(profesion);
        parcel.writeString(discription);
        parcel.writeString(height);
        parcel.writeString(dob);
        parcel.writeString(siblings);
        parcel.writeString(funfact);
        parcel.writeString(age);
        parcel.writeInt(photo);
    }
}
