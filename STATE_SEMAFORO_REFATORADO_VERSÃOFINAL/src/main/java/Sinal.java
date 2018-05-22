public class Sinal {

    private Estado estado_atual;

    Sinal(){
        this.estado_atual= new Amarelo();
    }

    public void amarelo_vermelho(){
        try{
            this.estado_atual = estado_atual.amarelo_vermelho();
            Thread.sleep(25000);
        }catch (Exception erro){
            System.out.println("Não foi possível compilar.");
        }
    }

    public void vermelho_verde(){
        try{
        this.estado_atual=estado_atual.vermelho_verde();
        Thread.sleep(25000);
    }catch (Exception erro){
            System.out.println("Não foi possível compilar.");
        }
    }

    public void verde_amarelo(){
        try{
            this.estado_atual=estado_atual.verde_amarelo();
            Thread.sleep(5000);
        }catch (Exception erro){
            System.out.println("Não foi possível compilar.");
        }
    }

    public EstadoSemaforo getEstado(){
        return estado_atual.getEstado();
    }

}


