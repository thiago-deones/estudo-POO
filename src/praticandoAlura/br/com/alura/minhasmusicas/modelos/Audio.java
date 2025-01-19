package praticandoAlura.br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReprodcoes;
    private int totalCurtidas;
    private int classificacai;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReprodcoes() {
        return totalReprodcoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacai() {
        return classificacai;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalReprodcoes++;
    }
}
