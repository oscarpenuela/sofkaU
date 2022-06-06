package com.company.DAO;

import com.company.Entity.Song;

import java.util.ArrayList;
import java.util.List;

public class SongDao implements IDao<Song>{
    @Override
    public Song save(Song song) {
        return null;
    }

    @Override
    public List<Song> searchAll() {
        return null;
    }

    @Override
    public List<Song> searchByGenre(List<Song> list, String genre) {
        ArrayList<Song> listByGenre = new ArrayList<>();
        for (Song song: list) {
            if(song.getGenre().equals(genre)){
                listByGenre.add(song);
            }
        }
        return listByGenre;
    }

    @Override
    public List<Song> searchByDate(List<Song> list, int date) {
        ArrayList<Song> listByDate = new ArrayList<>();
        for (Song song: list) {
            if(song.getDate() == date){
                listByDate.add(song);
            }
        }
        return listByDate;
    }
}
