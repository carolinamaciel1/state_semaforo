public interface Estado {
    Estado vermelho_verde();
    Estado verde_amarelo();
    Estado amarelo_vermelho();
    EstadoSemaforo getEstado();
}
