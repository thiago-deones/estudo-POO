package seletores;

public class bubble {
    public static void main(String[] args) {
        int aux;
        int[] v = {2, 3, 4, -1, 0 , -1, -3};

        for (int i = 0; i<v.length; i++){
            for (int j = i+1; j< v.length; j++){
                if (v[j]<v[i]){
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
        for (int i = 0; i <v.length; i++){
            System.out.print("| " + v[i] + " ");
        }
    }
}
