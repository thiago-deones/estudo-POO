package reviscaoProva.excecao;

//Crie um programa que tente acessar um índice fora do limite de um array
//e trate a exceção.

public class N3 {
    public static int limiteArray(int[] a, int indice) {
        if (indice < 0 || indice > a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return a[indice];
    }

    public static void main(String[] args) {
        int[] bloco = {1, 2, 3};

        try {
            System.out.println(bloco[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fora do array");
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
