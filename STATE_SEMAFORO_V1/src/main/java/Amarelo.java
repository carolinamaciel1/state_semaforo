public class Amarelo implements Estado{

    @Override
    public Estado t1_vermelho_verde() {
        return this;
    }

    @Override
    public Estado t2_verde_amarelo() {
        System.out.println("O SINAL AINDA ESTÁ AMARELO.");
        return this;
    }

    @Override
    public Estado t3_amarelo_vermelho() {
        System.out.println("transição 3: sinal vermelho.");
        return new Vermelho();
    }
}
