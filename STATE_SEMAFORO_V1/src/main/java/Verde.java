public class Verde implements Estado{

    @Override
    public Estado t1_vermelho_verde() {
        System.out.println("O SINAL AINDA ESTÁ VERDE.");
        return this;
    }

    @Override
    public Estado t2_verde_amarelo() {
        System.out.println("transição 2: sinal amarelo.");
        return new Amarelo();
    }

    @Override
    public Estado t3_amarelo_vermelho() {
        return this;
    }
}