package com.Apple.iPhone.Interfaces;

public interface InternetBrowser {

    // showPage, addNewTab, updatePage
    // exibirPagina, adicionarNovaAba, atualizarPagina

    default void showPage(String url){
        System.out.println("Exibindo a pagina: " + url);
    }

    default void addNewTab(){
        System.out.println("Abrindo uma nova Aba!");
    }

    default void updatePage(){
        System.out.println("Atualizando a pagina!");
    }

}
