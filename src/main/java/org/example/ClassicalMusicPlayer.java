package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class ClassicalMusicPlayer implements Sing {

    private ArrayList<Song> songs;

    public ClassicalMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @PostConstruct
    public void init() {
        this.songs = new ArrayList<>(Arrays.asList(new Song("The Walz Of the rain", "Shopen"),
                new Song("Le Vent", "Ennio Morricone")));
    }

    @Override
    public void sing() {
        System.out.println("You are listening: ");
        songs.forEach(song -> System.out.println(song.getName() + "composer is " + song.getComposer()));
    }
}
