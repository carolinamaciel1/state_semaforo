public class Vermelho implements Estado{

    @Override
    public Estado t1_vermelho_verde() {
        System.out.println("transição 1: sinal verde.");
        return new Verde();
    }

    @Override
    public Estado t2_verde_amarelo() {
        return this;
    }

    @Override
    public Estado t3_amarelo_vermelho() {
        System.out.println("O SINAL AINDA ESTÁ VERMELHO.");
        return new Vermelho();
    }
}
