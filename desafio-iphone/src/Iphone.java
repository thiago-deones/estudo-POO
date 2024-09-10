public class Iphone {
    private Musica reprodutorMusical;
    private Telefone aparelhoTelefonico;
    private Internet navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new Musica();
        this.aparelhoTelefonico = new Telefone();
        this.navegadorInternet = new Internet();
    }

    public void tocarMusica() {
        reprodutorMusical.tocarMusica();
    }

    public void pararMusica() {
        reprodutorMusical.pararMusica();
    }

    public void fazerChamada(String numero) {
        aparelhoTelefonico.fazerChamada(numero);
    }

    public void desligarChamada() {
        aparelhoTelefonico.desligarChamada();
    }

    public void navegar(String url) {
        navegadorInternet.navegar(url);
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
