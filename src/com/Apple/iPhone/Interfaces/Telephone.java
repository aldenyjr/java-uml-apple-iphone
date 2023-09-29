package com.Apple.iPhone.Interfaces;

import com.Apple.iPhone.Entidades.Contact;

public interface Telephone {

    //ligar, atender, iniciarCorrerioVoz

    default void call(Contact contact, boolean isCalling){
        if(isCalling){
            System.out.println("Voce está em uma ligação, e não pode ligar para outro contato até finalizar!");
        } else {
            System.out.println("Ligando para o numero: " + contact.getNumber());
        }
    }


    default void answer(Contact contact){
    }

    default void startCorreioVoz(){
        System.out.println("Iniciando Correio Voz");
    }

}
