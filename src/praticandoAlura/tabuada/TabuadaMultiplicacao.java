package praticandoAlura.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    public void mostrarTabuada(int numero){
        System.out.println("A tabuada do numero " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resutado = numero * i;
            System.out.println(numero + " x " + i + " = " + resutado);
        }
    }
}
