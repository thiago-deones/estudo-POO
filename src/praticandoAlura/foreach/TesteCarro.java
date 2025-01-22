package praticandoAlura.foreach;

import java.util.ArrayList;

public class TesteCarro {
    public static void main(String[] args) {
        ArrayList<String> carrinho= new ArrayList<>();
        carrinho.add("Polo");
        carrinho.add("Gol");

        System.out.println(carrinho);

        CarrosLuxo carrosLuxo = new CarrosLuxo(200000, "RAM", "RH478N4", 5);
        Carros car = new Carros(122,"ret", "asd3432");

        if (car instanceof Carros) {
            Carros carros = (Carros) car;
        } else {
            System.out.println("O objeto não é um carro");
        }

    }
}
