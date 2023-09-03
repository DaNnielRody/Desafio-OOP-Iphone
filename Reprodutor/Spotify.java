package edu.OOP.Reprodutor;

public class Spotify extends ReprodutorMusical{
    @Override
    public void tocar() {
        selecionarMusica();
        System.out.println("Tocando no Spotify");
        pausar();
    }

    @Override
    public void pausar() {
        System.out.println("Pausando o Spotify");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Spotify");
    }
}
