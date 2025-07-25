public class Assento {
    protected String fileira;
    protected int numero;
    protected boolean status;

    
    public Assento(String fileira, int numero, boolean status) {
        this.fileira = fileira;
        this.numero = numero;
        this.status = status;
    }

    public Assento() {
        this.fileira = "";
        this.numero = 0;
        this.status = false;
    }

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
