package org.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class LeetSum {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        int[] array = {1,2,3,4,5};
        int chute = 7;

        int[] resultando = minhaFuncao(array,chute);
        System.out.println(Arrays.toString(resultando));
    }


    public static int[] minhaFuncao(int[] a, int b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] + a[j] == b){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

}
