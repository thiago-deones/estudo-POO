package exercicio5;

public class Cachorro {
    public String raca;
    public double tamanho;
    public String cor;
    public boolean tem_rabo;

    public Cachorro(String raca, double tamanho, String cor, boolean tem_rabo) {
        this.raca = raca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.tem_rabo = tem_rabo;
    }

    public void late(){
        System.out.printf("%nOlá! Eu sou o %s, de %.2fcm de tamanho, minha cor é %s e eu ", this.raca, this.tamanho, this.cor);
        if(tem_rabo){
            System.out.print("tenho rabo.");
        } else {
            System.out.print("não tenho rabo.");
        }
    }


//    public void late(){
//        System.out.printf("%nOlá! Eu sou o %s, de %.2fcm de tamanho, minha cor é %s e eu %s rabo.", this.raca, this.tamanho, this.cor, (tem_rabo ? "tenho" : "não tenho"));
//    }
}


