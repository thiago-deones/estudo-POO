package biblioteca;

public class EmprestimoCurtoPrazo extends Emprestimo {
    private static final double MULTA_POR_DIA = 2.50;

    public EmprestimoCurtoPrazo(Material material, int diasAtraso) {
        super(material, diasAtraso);
    }

    @Override
    public double calcularMulta() {
        return diasAtraso * MULTA_POR_DIA;
    }

}
