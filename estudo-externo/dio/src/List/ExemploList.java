package List;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.4);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());//mostrar todos os dados
        //agora imprimir o elemento do indide 5
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //adicionar uma nova nota na posição 3(loga vai ser o indice 4)
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        //substituição de notas
        System.out.println("Substitua a nota 5 pela a nota 6");
        //primeiro ele vai buscar o indice da nota 5 depois vai fazer a substituição para a nota desejada
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas.toString());

        //Confirir se uma determinada nota está na lista
        System.out.println("Confira se a nota 5 esta na lista: " + notas.contains(5d));

    }
}
