package exercicio4;

public class Pessoa {
    public String nome;
    public int idade;
    public String cidade;

    public void apresentar(){
        System.out.printf("%nOla eu sou %s, tenho %d anos e moro na cidade %s", this.nome, this.idade, this.cidade);
    }
}
