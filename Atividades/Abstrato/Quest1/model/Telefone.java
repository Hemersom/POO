public class Telefone extends Contato {
    private String telefone;
    public Telefone(String telefone) {
        this.telefone = telefone;
    }
    public Telefone() {
        this.telefone = "";
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }      
}
