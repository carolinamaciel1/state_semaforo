package Classes;

public class Amarelo implements Estado{

    @Override
    public Estado t1_vermelho_verde() {
        return this;
    }

    @Override
    public Estado t2_verde_amarelo() {
        //System.out.println("O sinal ainda está amarelo");
        return this;
    }

   @Override
    public Estado t3_amarelo_vermelho() {
        System.out.println("VERMELHO");
        return new Vermelho();
    }
}
