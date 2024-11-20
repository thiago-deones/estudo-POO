package exercicio9.biblioteca;

public class EmprestimoCurtoPrazo extends Emprestimo{
    private static final double MULTA_POR_DIA = 2.50;

    public EmprestimoCurtoPrazo(Materiais materiais, int dias) {
        super(materiais, dias);
    }

    @Override
    public double calcularMulta() {
        double multa = 0;
        if (diasAtraso <= 4) {
            multa = MULTA_POR_DIA * diasAtraso;
        }
        return multa;
    }
}
