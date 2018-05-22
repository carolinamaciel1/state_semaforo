package Classes;

public class Sinal {

    public Estado status;

    public Sinal(){
        status = new Vermelho();
        try{System.out.println("VERMELHO");
            Thread.sleep(25000);
        }catch (Exception erro){
            System.out.println("Erro na criação do obj.");
        }
    }

    public Estado t1_vermelho_verde(){
        try{this.status = status.t1_vermelho_verde();
            Thread.sleep(25000);
        }catch(Exception erro){
            System.out.println("Não é possível compilar.");
        }
        return this.status;
    }

    public Estado t2_verde_amarelo(){
        try{this.status = status.t2_verde_amarelo();
            Thread.sleep(5000);
        }catch (Exception erro){
            System.out.println("Não é possível compilar.");
        }
        return this.status;
    }

    public void t3_amarelo_vermelho(){
            try{this.status = status.t3_amarelo_vermelho();
                Thread.sleep(25000);
            }catch(Exception erro){
                System.out.println("Não é possível compilar.");
            }
    }
}
