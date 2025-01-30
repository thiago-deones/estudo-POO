package BancoHeranca;

public class Principal {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario("Nico", "123-123-123-03", 2500);

        System.out.println(nico.getBonificacao());
        System.out.println(nico.getNome());
    }
}
