public class Sinal {

    public Estado status;

    Sinal(){
        status = new Vermelho();
        status.t3_amarelo_vermelho();
    }

    public void t1_vermelho_verde(){
        this.status = status.t1_vermelho_verde();
    }

    public void t2_verde_amarelo(){
        this.status = status.t2_verde_amarelo();
    }
    public void t3_amarelo_vermelho(){
        this.status = status.t3_amarelo_vermelho();
    }


}
