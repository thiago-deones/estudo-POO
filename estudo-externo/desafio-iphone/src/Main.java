public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Usando as funcionalidades do iPhone
        meuIphone.tocarMusica();
        meuIphone.pararMusica();

        meuIphone.fazerChamada("123456789");
        meuIphone.desligarChamada();

        meuIphone.navegar("https://www.example.com");
        meuIphone.atualizarPagina();
    }
}