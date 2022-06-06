package com.company.DAO;

import java.util.List;

public interface IDao <Song>{

    public Song save (Song song);
    public List<Song> searchAll();
    public List<Song> searchByGenre();
    public List<Song> searchByDate();

}
