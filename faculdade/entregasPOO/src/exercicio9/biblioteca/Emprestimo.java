package exercicio9.biblioteca;

public class Emprestimo {
    protected Materiais materiais;
    protected int diasAtraso;

    public Emprestimo(Materiais materiais, int diasAtraso) {
        this.materiais = materiais;
        this.diasAtraso = diasAtraso;
    }

    public double calcularMulta() {
        return 0;
    }
}
