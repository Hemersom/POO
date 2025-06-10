public class Telefone extends Contato {
    private String telefone;
    public Telefone(String telefone) {
        this.telefone = telefone;
        this.tipo = "telefone";
    }
    public Telefone() {
        this.telefone = "";
        this.tipo = "telefone";
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
     
    @Override
    public void exibir() {
        System.out.println("Telefone: " + telefone);
    }
}
