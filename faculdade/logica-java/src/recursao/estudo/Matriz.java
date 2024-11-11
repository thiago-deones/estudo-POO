package recursao.estudo;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] v = new int[5][5];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i == j) {
                    v[i][j]=1;
                } else if(i > j) {
                    v[i][j] = 0;
                } else {
                    v[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
