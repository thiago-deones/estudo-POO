package BancoHeranca;

public class EditorVideo extends Funcionario {


    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao() {
        System.out.println("bonificação editor");
        return super.getBonificacao() + 100;
    }
}
