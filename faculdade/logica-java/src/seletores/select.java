package seletores;

public class select {
    public static void main(String[] args) {
        int[] v = {2, 3, 4, -1, 0 , -1, -3};

        int posicaoMenor, aux;

        for (int i = 0; i < v.length; i++){
            posicaoMenor = i;
            for (int j = i + 1; j <v.length; j++){
                if (v[posicaoMenor] > v[j]) {
                    posicaoMenor = j;
                }
            }
            aux = v[i];// recebe o valor do array
            v[i] = v[posicaoMenor]; // substitui o valor dentro
            v[posicaoMenor] = aux; // repoe o valor
        }

        for (int i = 0; i <v.length; i++){
            System.out.print("| " + v[i] + " ");
        }

    }
}
