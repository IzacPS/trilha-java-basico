package me.izac;

public class Main {
    public static void main(String [] args){
        Iphone iphone = new Iphone();

        //Demostração de polimosfismo do iphone que pode possui os comportamentos
        //de um aparelho telefonico, um navegador de internet e um reprodutor
        //musical

        //iphone como aparelho telefonico
        AparelhoTelefonico aparelhoTelefonico = iphone;
        aparelhoTelefonico.ligar("87654321");
        aparelhoTelefonico.atender("12345678");
        aparelhoTelefonico.enviarMsg("12345678", "Nova mensagem");
        aparelhoTelefonico.receberMsg("12345678", "Nova mensagem recebida");

        //iphone como navegador de internet
        NavegadorDeInternet navegadorDeInternet = iphone;
        navegadorDeInternet.exibirPagina("google.com");
        navegadorDeInternet.adicionarNovaPagina("google.com");
        navegadorDeInternet.adicionarAosFavoritos("google.com");
        navegadorDeInternet.atualizarPagina();

        //iphone como reprodutor musical
        ReprodutorMusical reprodutorMusical = iphone;
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.proxima();
        reprodutorMusical.anterior();
    }
}
