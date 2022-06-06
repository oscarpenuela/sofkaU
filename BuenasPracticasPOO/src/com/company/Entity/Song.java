package com.company.Entity;

import java.util.Date;

public class Song {
    private String title;
    private int id;
    private Date date;
    private int time;
    private String genre;
    private String cover;
    private String description;

    public Song(String title, int id, Date date, int time, String genre, String cover, String description)
    {
        this.title = title;
        this.id = id;
        this.date = date;
        this.time = time;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
