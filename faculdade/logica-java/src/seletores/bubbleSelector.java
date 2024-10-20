package seletores;

public class bubbleSelector {
    public static void main(String[] args) {
        int[] v = {9, 4, 5, 3, 2, 5, 2};

        int aux;//  criando variavel para poder ficar com o numero

        for (int i = 0; i < v.length; i++){
            for (int j = i +1; j < v.length; j++){
                if (v[i] > v[j]) { // se o I for maior q J então sera trocado por jota
                  aux = v[i];
                  v[i] = v[j];
                  v[j] = aux;
                }
            }
        }

        for (int i = 0; i <v.length; i++){
            System.out.print("| " + v[i] + " ");
        }

    }
}
