package recursao.praticando.excecao;

//Peça ao usuário para digitar um número. Trate a exceção caso o usuário
//insira algo que não seja um número.

import java.util.Scanner;


public class Numero2 {

    public static void lerNumero() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.printf("%nO valor digitado é: %d", n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
                lerNumero();
        } catch (NumberFormatException e) {
            System.out.println("Não foi possivel converter o valor;");
        } finally {
            scanner.close();
        }
    }

}
