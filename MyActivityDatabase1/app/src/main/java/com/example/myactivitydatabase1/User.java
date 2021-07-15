package com.example.myactivitydatabase1;

import android.graphics.Bitmap;
import android.view.autofill.AutofillValue;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class User  {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String age;
    public String adress;
    public String ngaythem;
    public String lop;
    public String giaovien;

     /*
    /*public int id;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "age")
    public String age;
    @ColumnInfo(name = "adress")
    public String adress;
    @ColumnInfo(name = "ngaythem")
    public String ngaythem;
    @ColumnInfo(name = "lop")
    public String lop;
    @ColumnInfo(name = "giaovien")
    public String giaovien;

     */


    public User (String name, String age, String adress, String lop, String giaovien,String ngaythem) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.lop = lop;
        this.ngaythem= ngaythem;
        this.giaovien = giaovien;
    }


    @Ignore
    Bitmap bm;
}
