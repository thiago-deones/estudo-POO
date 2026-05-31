//Imagine que você está trabalhando no backend de um sistema de Milhas e Fidelidade de um grande banco brasileiro. 
// Você recebeu um lote bruto de transações de clientes. Cada transação tem o CPF do cliente e o valor do bônus acumulado.

//Sua missão:

//Filtrar esse lote para garantir que processaremos apenas CPFs únicos (remover duplicadas de leitura).

//Agrupar e somar o total de bônus por cliente.

//Retornar uma estrutura onde o sistema consiga buscar o saldo de um cliente digitando apenas o CPF, com performance máxima.

import java.util.*;

public class Transacoes {
    public static void main(String[] args) {
        
        List<Transacao> transacoesBrutas = List.of(
            new Transacao("123.456.789-00", 100),
            new Transacao("987.654.321-11", 200),
            new Transacao("123.456.789-00", 50), 
            new Transacao("456.789.123-22", 300),
            new Transacao("987.654.321-11", 150)
        );

        Map<String, Integer> mapaDeSaldos = new HashMap<>();

        for (Transacao t : transacoesBrutas) {
            String cpfAtual = t.cpf();
            int pontosDaTransacao = t.pontos();

            if (mapaDeSaldos.containsKey(cpfAtual)) {
                
            }
        }

        System.out.println(mapaDeSaldos);
    }

    public record Transacao(String cpf, int pontos){

    }
}