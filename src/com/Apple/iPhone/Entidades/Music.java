package com.Apple.iPhone.Entidades;

public class Music {
    private String name;
    private String author;
    private double duration;
    private boolean musicPlay = false;

    public Music(String name, String author, double temp) {
        this.name = name;
        this.author = author;
        this.duration = temp;
    }

    public String getName() {
        return name;
    }

    public void setMusicPlay(boolean musicPlay) {
        this.musicPlay = musicPlay;
    }

    public boolean isMusicPlay() {
        return musicPlay;
    }
}
