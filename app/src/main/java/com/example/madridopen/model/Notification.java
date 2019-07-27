package com.example.madridopen.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;

@Entity
public class Notification {

    public Notification(){}



    @PrimaryKey(autoGenerate = true)
    private int id = 0;

    public String title;
    public String name;
    public String description;
    public Integer date_unix;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Notification(String title, String name, String description, Integer date) {
        this.title = title;
        this.name = name;
        this.description = description;
        this.date_unix = date;
    }



    public Integer getDate() {
        return date_unix;
    }

    public void setDate(Integer date) {
        this.date_unix = date;
    }



}