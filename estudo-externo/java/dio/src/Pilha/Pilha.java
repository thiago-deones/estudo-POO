package pilha;

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        //push
        pilha.push("Maça");
        pilha.push("Banana");
        pilha.push("Laranja");

        System.out.println(pilha);

        System.out.println("Item q é o topo da pilha utilizando o top ou o peek: " + pilha.peek());

        //pop

        String removido = pilha.pop();

        System.out.println("Pilha editada: " + pilha);

        System.out.println("Item removido da pilha: " + removido);


    }
}
