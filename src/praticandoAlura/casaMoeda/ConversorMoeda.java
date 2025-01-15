package praticandoAlura.casaMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void getconverterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 6.10;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
