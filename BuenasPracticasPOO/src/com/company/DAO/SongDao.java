package com.company.DAO;

import com.company.Entity.Song;

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
    public List<Song> searchByGenre() {
        return null;
    }

    @Override
    public List<Song> searchByDate() {
        return null;
    }
}
