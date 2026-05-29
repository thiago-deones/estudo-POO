public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345","Jão de Deus", 1000);

        conta.depositar(200);
        conta.exibirSaldo();
        conta.sacar(1200);
        conta.exibirSaldo();
    }
}