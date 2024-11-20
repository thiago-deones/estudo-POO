package exercicio9.biblioteca;

public class Materiais {
    private String titulo;
    private int anoPublicacao;

    public Materiais(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
