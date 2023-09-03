package edu.OOP.Navegador;

public class Safari implements NavegadorNaInternet {
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo a página Safari");
        adicionarNovaAba();
        atualizarPagina();
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba Safari");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a página Safari");
    }
}
