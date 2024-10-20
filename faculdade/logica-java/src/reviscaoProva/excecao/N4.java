package reviscaoProva.excecao;

//Crie uma classe de exceção personalizada chamada
//IdadeInvalidaException. Implemente um programa que peça a idade de uma
//pessoa e lance essa exceção se a idade for negativa ou maior que 150

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("Digite uma idade");
            int idade = scanner.nextInt();
            if(idade < 0 || idade > 150){
                throw new IdadeInvalidaException("Erro: idade fora do padrão de 0 a 150 anos");
            }
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }
}

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }
}



