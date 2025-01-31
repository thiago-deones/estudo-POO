package BancoHeranca;

public class Principal {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario("Nico", "123-123-123-03", 2500);

        System.out.println(nico.getBonificacao());
        System.out.println(nico.getNome());

        Gerente g1 = new Gerente("Pedro", "123-435-345-76", 5000);
        g1.autentica(2222);

        System.out.println(g1.);
        System.out.println();
        System.out.println();
    }
}
