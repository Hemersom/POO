public abstract class Usuario {
    protected String nome;
    protected String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Usuario() {
        this.nome = "Usuário Padrão";
        this.email = "";
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

}
