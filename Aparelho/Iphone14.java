package edu.OOP.Aparelho;

public class Iphone14 extends AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando o Iphone 14");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o Iphone 14");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz 14");
    }
}
