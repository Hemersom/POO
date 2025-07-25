public class Sala {
    private  int numero_sala;
    private  Assento[][] assentos;
    private static final int NUM_FILEIRAS = 10;
    private static final int NUM_ASSENTOS_POR_FILEIRA = 10;

    public  Sala(){
        this.numero_sala = 0;
        this.assentos = new Assento[NUM_FILEIRAS][NUM_ASSENTOS_POR_FILEIRA];
    }

    public  Sala(int num){
        this.numero_sala = num;
        this.assentos = new Assento[NUM_FILEIRAS][NUM_ASSENTOS_POR_FILEIRA];
    }

    public int getNumero_sala() {
        return numero_sala;
    }
    
    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    

}
