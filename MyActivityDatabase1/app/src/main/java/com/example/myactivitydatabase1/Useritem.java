package com.example.myactivitydatabase1;

import java.io.Serializable;

public class Useritem implements Serializable {
    public String name;
    public String age;
    public String adress;
    public String ngaythem;
    public String lop;
    public String giaovien;

    public Useritem(String name, String age, String adress, String lop, String giaovien,String ngaythem) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.lop = lop;
        this.ngaythem= ngaythem;
        this.giaovien = giaovien;
    }
}