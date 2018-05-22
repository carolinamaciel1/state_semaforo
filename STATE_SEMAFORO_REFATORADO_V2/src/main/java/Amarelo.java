public class Amarelo implements Estado {

    @Override
    public Estado vermelho_verde() {
        return this;
    }

    @Override
    public Estado verde_amarelo() {
        return this;
    }

    @Override
    public Estado amarelo_vermelho() {
        System.out.println("VERMELHO");
        return new Vermelho();
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.AMARELO;
    }
}
