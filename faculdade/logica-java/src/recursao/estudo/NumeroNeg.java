package recursao.estudo;

public class NumeroNeg {
    public static void main(String[] args) {
        int[] v = {1, -3,-4,-4};

        int quantidade = QuantNegativo(v, 0);

        System.out.println(quantidade);
    }

    private static int QuantNegativo(int[] v, int posicao) {
        if (posicao == v.length) {
            return 0;
        }

        int contador = (v[posicao] < 0 ) ? 1 : 0;

        return contador + QuantNegativo(v, posicao + 1);
    }
}
