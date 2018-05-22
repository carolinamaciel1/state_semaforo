public class Verde implements Estado {
    @Override
    public Estado vermelho_verde() {
        return this;
    }

    @Override
    public Estado verde_amarelo() {
        System.out.println("AMARELO");
        return new Amarelo();
    }

    @Override
    public Estado amarelo_vermelho() {
        return this;
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.VERDE;
    }
}
