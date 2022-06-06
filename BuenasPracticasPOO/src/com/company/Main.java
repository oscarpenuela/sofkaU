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
                    1970 + i,
                    180 + 5*i,
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
                    1970 + i-10,
                    180 + 4*i,
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
                    1970 + i - 25,
                    180 +3*i,
                    "Popular",
                    "../img/cover_"+i,
                    "Esta es la canción número "+i
            );
            songLibrary.add(i,songL);
        }
    }
}
