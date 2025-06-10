class Usuario {
    protected String nome;
    protected String email;
    
    public void exibirPerfil(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
    }
    public Usuario() {
        this.nome = "";
        this.email = "";
    }
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
