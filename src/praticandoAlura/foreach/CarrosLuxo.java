package praticandoAlura.foreach;

public class CarrosLuxo extends Carros{
    private int classificacaoLuxo;

    public CarrosLuxo(double valor, String modelo, String chassi, int classificacaoLuxo) {
        super(valor, modelo, chassi);
        this.classificacaoLuxo = classificacaoLuxo;
    }


}
