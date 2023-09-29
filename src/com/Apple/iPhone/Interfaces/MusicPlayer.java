package com.Apple.iPhone.Interfaces;

import com.Apple.iPhone.Entidades.Music;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public interface MusicPlayer {

    // play, pause, selectMusic
    default void playAndPause(Music music){
        if(music.isMusicPlay()){
            pause(music);
        } else {
            play(music);
        }
    }

    default void play(Music music){
        music.setMusicPlay(true);
        System.out.println("Play Started on Music: " + music.getName());

    }

    default void pause(Music music){
        System.out.println("Pause and Music: " + music.getName());
    }

    default Music selectMusic(String name){
        Set<Music> listMusic = new HashSet<>();
        listMusic.add(new Music("Tomara", "Pablo", 5.00));
        listMusic.add(new Music("Porque homem não chora", "Pablo", 7.00));
        listMusic.add(new Music("A Casa ao Lado", "Pablo", 9.00));
        listMusic.add(new Music("Ao Sabor do Vento", "Pablo", 5.50));
        listMusic.add(new Music("Bilu bilu", "Pablo", 6.25));

        Optional<Music> foundMusic = listMusic.stream().filter(music -> music.getName().equals(name)).findFirst();
        Music music = null;
        if (foundMusic.isPresent()){
            music = foundMusic.get();
        }

        return music;
    }


}
