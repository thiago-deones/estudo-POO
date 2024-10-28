package biblioteca;

public class Emprestimo {
    protected Material material;
    protected int diasAtraso;

    public Emprestimo(Material material, int diasAtraso) {
        this.material = material;
        this.diasAtraso = diasAtraso;
    }

    public double calcularMulta() {
        return 0;
    }
}
