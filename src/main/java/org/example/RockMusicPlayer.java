package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class RockMusicPlayer implements Sing {
    private ArrayList<Song> songs;

    public RockMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @PostConstruct
    public void init() {
        this.songs = new ArrayList<>(Arrays.asList(new Song("The Ceiling", "Jaws"),
                new Song("Adore life", "Savages")));
    }

    @Override
    public void sing() {
        System.out.println("You are listening: ");
        songs.forEach(songs -> System.out.println(songs.getName() + "composer is " + songs.getComposer()));
    }
}
