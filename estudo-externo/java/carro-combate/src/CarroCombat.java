public class CarroCombat extends Carro{
    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private int qtdArmamento;

    public CarroCombat(String nome, int blindagem) {
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdArmamento=100;
    }

    public void setQtdArmamento(int qtdArmamento){
        this.qtdArmamento += qtdArmamento;
        if(this.qtdArmamento > MAX_ARMAMENTO){
            this.qtdArmamento = MAX_ARMAMENTO;
        }
        if(this.qtdArmamento > MIN_ARMAMENTO){
            this.qtdArmamento = MIN_ARMAMENTO;
        }
    }
    public int getQtdArmamento(){
        return this.qtdArmamento;
    }

    public void atirar(){
        if(this.qtdArmamento > MIN_ARMAMENTO){
            setQtdArmamento(-1);
        } else {
            System.out.println("Sem armamento!!");
        }
    }

    public void info(){
        super.info();
        System.out.printf("Qtd.arm........:%s%n",this.qtdArmamento);

    }
}