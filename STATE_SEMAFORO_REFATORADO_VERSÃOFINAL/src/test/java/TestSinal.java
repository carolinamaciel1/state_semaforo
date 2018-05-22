import junit.framework.TestCase;
import org.junit.Test;

public class TestSinal  extends TestCase{

    public void test_amarelo_vermelho(){
        Sinal s = new Sinal();
        s.amarelo_vermelho();
        EstadoSemaforo obtido = s.getEstado();
        assertEquals(EstadoSemaforo.VERMELHO,obtido);
    }

  @Test
    public void test_vermelho_verde(){
        Sinal s = new Sinal();
        s.vermelho_verde();
        EstadoSemaforo obtido = s.getEstado();
        assertEquals(EstadoSemaforo.VERDE,obtido);
    }

    public void test_verde_amarelo(){
        Sinal s = new Sinal();
        s.verde_amarelo();
        EstadoSemaforo obtido = s.getEstado();
        assertEquals(EstadoSemaforo.AMARELO,obtido);
    }


}
