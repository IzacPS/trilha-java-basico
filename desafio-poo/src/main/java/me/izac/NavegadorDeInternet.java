package me.izac;

public interface NavegadorDeInternet {
    void exibirPagina(String url);
    void adicionarNovaPagina(String url);
    void adicionarAosFavoritos(String url);
    void atualizarPagina();
}
