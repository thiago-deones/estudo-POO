package recursao.refazendolist2.praticando;

public class numero1 {
    public static int soma(int n) {
        if (n == 0) {
            return 0;
        }

        return (n%10) + soma(n/10);
    }

    public static void main(String[] args) {
        int n = 123;

        int s = soma(n);
        System.out.println(s);
    }
}
