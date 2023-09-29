package com.Apple.iPhone.Entidades;

public class Music {
    private String name;
    private String author;
    private double temp;
    private boolean musicPlay = false;

    public Music(String name, String author, double temp) {
        this.name = name;
        this.author = author;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getTemp() {
        return temp;
    }

    public void setMusicPlay(boolean musicPlay) {
        this.musicPlay = musicPlay;
    }

    public boolean isMusicPlay() {
        return musicPlay;
    }
}
