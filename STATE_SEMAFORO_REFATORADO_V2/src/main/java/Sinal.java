public class Sinal  {

    private Estado estado_atual;

    Sinal(){
        try{
            this.estado_atual=new Vermelho();
        } catch(Exception Erro) {
            System.out.println("Não foi possível criar o obj inicial.");
        }

         }

         public void vermelho_verde(){
            try{
                this.estado_atual=estado_atual.vermelho_verde();
                Thread.sleep(25000);
            } catch (Exception erro) {
                System.out.println("Não foi possível compilar.");
            }
         }

         public void verde_amarelo(){
             try{
                 this.estado_atual=estado_atual.verde_amarelo();
                 Thread.sleep(5000);
             } catch(Exception erro) {
                 System.out.println("Não foi possível compilar.");
             }
         }

         public void amarelo_vermelho(){
            try{
                this.estado_atual=estado_atual.amarelo_vermelho();
                Thread.sleep(25000);
            } catch(Exception erro) {
                System.out.println("Não foi possível compilar.");
            }
         }

        public EstadoSemaforo getEstado() {
            return estado_atual.getEstado();
        }
}


