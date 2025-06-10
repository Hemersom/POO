public class Empregado {
    protected  String nome;
    protected  String cpf;
    public Empregado(){
        this.nome = "";
        this.cpf = "";
    }
    public Empregado(String nome, String cpf){
        this.nome = nome;
        this.cpf =cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    @Override
    public String toString(){
        return String.format("Nome: "+this.nome+" Cpf: "+this.cpf);
    }
}
