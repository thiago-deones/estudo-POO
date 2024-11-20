package exercicio9.biblioteca;

public class EmprestimoLongPrazo extends Emprestimo{
    private static final double MULTA_POR_DIA = 4.80;

    public EmprestimoLongPrazo(Materiais materiais, int diasAtraso) {
        super(materiais, diasAtraso);
    }


    @Override
    public double calcularMulta() {
        double multa = 0;

        if (diasAtraso > 4) {
            multa = diasAtraso * MULTA_POR_DIA;
        }

        return multa;
    }
}
