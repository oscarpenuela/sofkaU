package com.company;

import com.company.Entity.Song;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Song> songLibrary = new ArrayList<>();
        for (int i = 0; i <= 9;  i++){
            Song songL = new Song(
                    "Cancion " + i ,
                    i,
                    1970,
                    180,
                    "Clasica",
                    "../img/cover_"+i,
                    "Esta es la canción número "+i
            );
            songLibrary.add(i,songL);
        }
        for (int i = 10; i <= 19;  i++){
            Song songL = new Song(
                    "Cancion " + i ,
                    i,
                    1970,
                    180,
                    "Romantica",
                    "../img/cover_"+i,
                    "Esta es la canción número "+i
            );
            songLibrary.add(i,songL);
        }
        for (int i = 20; i <= 29;  i++){
            Song songL = new Song(
                    "Cancion " + i ,
                    i,
                    1970,
                    180,
                    "Popular",
                    "../img/cover_"+i,
                    "Esta es la canción número "+i
            );
            songLibrary.add(i,songL);
        }
    }
}
