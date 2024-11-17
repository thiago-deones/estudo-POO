package listaExtra;

//contrua uma matriz onde do meio para baixo apareca os numeros zero e pra cima numero 1
//tem de ter 6X6

public class Numero4 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= j){
                    arr[i][j] = 1;
                } else{
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " "); // Exibe os elementos da matriz
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
