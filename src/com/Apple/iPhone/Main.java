package com.Apple.iPhone;

import com.Apple.iPhone.Entidades.*;

public class Main {
    public static void main(String[] args) {
        // Criando o Objeto iPhone
        Iphone iPhoneXr = new Iphone("XR", 002554, 2020);

        // Tocando uma musica da lista de musicas
        iPhoneXr.playAndPause(iPhoneXr.selectMusic("Ao Sabor do Vento"));

        // Recenbendo e tentando realizar ligações
        iPhoneXr.answer(new Contact(71988881111L));
        iPhoneXr.call(new Contact(71888888888L));
        iPhoneXr.answer(new Contact(71999999999L));



    }
}
