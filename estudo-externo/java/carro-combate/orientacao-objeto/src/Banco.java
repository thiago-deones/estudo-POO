import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500;
        String nome = "Thiago Deones";
        String tipo = "Corrente";

        System.out.println("********************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:          " + nome);
        System.out.println("Tipo:          " + tipo);
        System.out.println("Saldo:         " + saldo);
        System.out.println("********************************************************");



        int opcao;

        do {
            System.out.println("Operações");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Trasferir valor");
            System.out.println("4- Sair");

            System.out.print("Digite a operação desejada: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é R$" + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = scanner.nextDouble();
                    saldo += valorReceber;
                    break;
                case 3:
                    System.out.println("Qual valor deseja transeferir:");
                    double valorTransfer = scanner.nextDouble();
                    if (valorTransfer > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorTransfer;
                        System.out.println("Transferencia realizada");
                        System.out.println("Saldo atual R$" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Até log");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 4);

    }
}
