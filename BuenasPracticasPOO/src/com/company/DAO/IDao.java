package com.company.DAO;

import java.util.List;

public interface IDao <Song>{

    public Song save (Song song);
    public List<Song> searchAll();
    public List<Song> searchByGenre(List<Song> list, String genre);
    public List<Song> searchByDate(List<Song> list, int date);

}
