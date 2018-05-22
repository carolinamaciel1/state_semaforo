public class Vermelho implements Estado {
    @Override
    public Estado vermelho_verde() {
        System.out.println("VERDE");
        return new Verde();
    }

    @Override
    public Estado verde_amarelo() {
        return new Amarelo();
    }

    @Override
    public Estado amarelo_vermelho() {
        return new Vermelho();
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.VERMELHO;
    }
}
