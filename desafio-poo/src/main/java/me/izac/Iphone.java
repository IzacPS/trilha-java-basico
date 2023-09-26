package me.izac;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{

    public Iphone(){
        connectarAInternet();
        connectarARede();
    }

     public void abrirReprodutorMusical(){
         System.out.println("Abrindo Reprodutor");
     }

     public void abrirTelefone(){
         System.out.println("Abrindo Telefone");
     }

     public void abrirNavegador(){
         System.out.println("Abrindo Navegador");
     }

    private void connectarARede(){
         System.out.println("Connectando a rede");
    }

    private void connectarAInternet(){
         System.out.println("Connectando a internet");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Ligação recebida de " + numero);
    }

    @Override
    public void enviarMsg(String numero, String msg) {
        System.out.println("Mensagem {" + msg + "} enviada para " + numero);
    }

    @Override
    public void receberMsg(String numero, String msg) {
        System.out.println("Mensagem {" + msg + "} recebida de " + numero);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaPagina(String url) {
        System.out.println("Nova pagina adicionada para o endereço" + url);
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Pagina " + url + " adiconada aos favoritos");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa");
    }

    @Override
    public void proxima() {
       System.out.println("Proxima música");
    }

    @Override
    public void anterior() {
        System.out.println("Música Anterior");
    }
}
