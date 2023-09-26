package me.izac;

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender(String numero);
    void enviarMsg(String numero, String msg);
    void receberMsg(String numero, String msg);
}
