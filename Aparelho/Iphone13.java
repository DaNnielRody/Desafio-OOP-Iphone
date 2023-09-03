package edu.OOP.Aparelho;

public class Iphone13 extends AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando o Iphone 13");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o Iphone 13");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz 13");
    }
}
