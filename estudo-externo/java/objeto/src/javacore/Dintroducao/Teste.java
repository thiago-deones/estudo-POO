package javacore.Dintroducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
        //regiões são 13 no total
            int N = input.nextInt();
            if(N == 0) break;

            int m= 1;
             while (!sobraWellington(N,m)){
                m++;
            }
            System.out.println(m);
        }
        input.close();
    }

    private static boolean sobraWellington(int n, int m) {
        List<Integer> regioes = new ArrayList<>();

        for (int i = 1; i <=n; i++){
            regioes.add(i);
        }

        regioes.remove(0);

        int pos = 0;

        while (regioes.size()>1){
            pos = (pos + m -1) % regioes.size();
            regioes.remove(pos);
        }

        return regioes.get(0) == 13;
    }
}
