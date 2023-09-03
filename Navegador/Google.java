package edu.OOP.Navegador;

public class Google implements NavegadorNaInternet {
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo a página Google");
        adicionarNovaAba();
        atualizarPagina();
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba Google");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a página Google");
    }
}