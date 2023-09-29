package com.Apple.iPhone.Entidades;

import com.Apple.iPhone.Interfaces.mobilePhone;

public class iPhone implements mobilePhone{
    private String model;
    private int version;
    private int yearLancament;
    private boolean isCalling = false;
    private Music music;

    public iPhone(String model, int version, int yearLancament) {
        this.model = model;
        this.version = version;
        this.yearLancament = yearLancament;
    }

    private void setCalling(boolean calling) {
        isCalling = calling;
    }

    @Override
    public void playAndPause(Music music) {
        this.music = music;
        mobilePhone.super.playAndPause(music);
    }

    @Override
    public void play(Music music) {
        this.music = music;
        mobilePhone.super.play(music);
    }

    @Override
    public void pause(Music music) {
        mobilePhone.super.pause(music);
    }

    @Override
    public Music selectMusic(String name) {
        return mobilePhone.super.selectMusic(name);
    }

    @Override
    public void call(Contact contact) {
        if(this.music.isMusicPlay() && !isCalling){
            playAndPause(this.music);
            mobilePhone.super.call(contact, isCalling);
            setCalling(true);
        } else {
            mobilePhone.super.call(contact, isCalling);
            setCalling(true);
        }
    }

    @Override
    public void answer(Contact contact) {
        if(this.isCalling){
            System.out.println("Voce está em uma ligação e não pode receber, a mesma foi encaminhada para espera!");
            } else if(this.music.isMusicPlay()) {
            playAndPause(this.music);
            System.out.println("Recebendo ligação do contato: " + contact.getNumber());
            setCalling(true);
        }
    }

    @Override
    public void startCorreioVoz() {
        mobilePhone.super.startCorreioVoz();
    }

    @Override
    public void showPage(String url) {
        mobilePhone.super.showPage(url);
    }

    @Override
    public void addNewTab() {
        mobilePhone.super.addNewTab();
    }

    @Override
    public void updatePage() {
        mobilePhone.super.updatePage();
    }
}
