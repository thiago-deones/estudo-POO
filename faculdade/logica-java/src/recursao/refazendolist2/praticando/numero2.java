package recursao.refazendolist2.praticando;

public class numero2 {
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        }
        return base * potencia(base, expoente - 1);

    }
}
