package edu.OOP.Iphone;

import edu.OOP.Aparelho.AparelhoTelefonico;
import edu.OOP.Aparelho.Iphone14;
import edu.OOP.Navegador.NavegadorNaInternet;
import edu.OOP.Navegador.Safari;
import edu.OOP.Reprodutor.Spotify;

public class Iphone {
    public static void main(String[] args) {
        NavegadorNaInternet navegadorNaInternet = new Safari();
        AparelhoTelefonico aparelhoTelefonico = new Iphone14();
        Spotify spotify = new Spotify();

        navegadorNaInternet.exibirPagina();
        aparelhoTelefonico.atender();
        spotify.pausar();
    }
}
