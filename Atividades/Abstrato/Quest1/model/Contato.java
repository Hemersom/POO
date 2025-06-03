public abstract class Contato {
    protected String tipo;

    public Contato(String tipo) {
        this.tipo = tipo;
    }
    public Contato() {
        this.tipo = "";
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
