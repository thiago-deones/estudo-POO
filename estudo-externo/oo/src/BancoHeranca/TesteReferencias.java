package BancoHeranca;

public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("marcos","13214",3000);
        EditorVideo e1 = new EditorVideo("Gabi", "981298739", 2500);
        Funcionario f1 = new Funcionario("Pedro", "123213", 4000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        System.out.println(controle.getSoma());
        controle.registra(f1);
        System.out.println(controle.getSoma());
        controle.registra(e1);
        System.out.println(controle.getSoma());


    }
}
