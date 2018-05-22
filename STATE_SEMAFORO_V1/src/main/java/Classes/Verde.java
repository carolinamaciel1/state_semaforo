package Classes;

public class Verde implements Estado{

    @Override
    public Estado t1_vermelho_verde() {
        //System.out.println("O sinal ainda está verde");
        return this;
    }

    @Override
    public Estado t2_verde_amarelo() {
        System.out.println("AMARELO");
        return new Amarelo();
    }

    @Override
    public Estado t3_amarelo_vermelho() {
        return this;
    }
}