package seletores;

public class sortSelector {
    public static void main(String[] args) {
        int[] v = {9, 4, 5, 3, 2, 5, 2};

        int posicaoMenor,  aux;

        for (int i = 0; i < v.length; i++ ){
            posicaoMenor = i; // iniciando no primeiro numero do array
            for (int j = i + 1; j < v.length; j++) { // j tem q ser i mais 1 para poder ser o numero proximo do i
                if (v[posicaoMenor] > v[j]){// se o numero for maior q o proximo entao substitui
                    posicaoMenor = j; // recebe o indice do numero proximo
                }
            }
            aux = v[i]; // recebe o numero
            v[i] = v[posicaoMenor];
            v[posicaoMenor] = aux;
        }

        for (int i = 0; i <v.length; i++){
            System.out.print("| " + v[i] + " ");
        }
    }
}
