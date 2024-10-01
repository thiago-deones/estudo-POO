package recursao.praticando.excecao;

//Crie uma classe de exceção personalizada chamada
//IdadeInvalidaException. Implemente um programa que peça a idade de uma
//pessoa e lance essa exceção se a idade for negativa ou maior que 150.


import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade ");
            int idade = scanner.nextInt();

            if(idade < 0 || idade > 150){
                throw new IdadeInvalidaException("Idade invalida!A idade digitada é invalida");
            }
            System.out.printf("Idade válida : %d anos.%n", idade);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa finalizado!");
        }

    }
}

class IdadeInvalidaException extends Exception {
            public IdadeInvalidaException(String mensagem){
                super(mensagem);
    }
}
