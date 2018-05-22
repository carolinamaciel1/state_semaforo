package Classes;

public class Vermelho implements Estado{

    @Override
    public Estado t1_vermelho_verde() {
        System.out.println("VERDE");
        return new Verde();
    }

    @Override
    public Estado t2_verde_amarelo() {
        return this;
    }

    @Override
    public Estado t3_amarelo_vermelho() {
        //System.out.println("O sinal ainda está vermelho");
        return new Vermelho();
    }
}
