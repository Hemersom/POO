public class Pessoa {
    protected String nome;
    protected int idade;
    protected String categoria;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.categoria = "";
    }
    public Pessoa(String categoria, int idade, String nome) {
        this.categoria = categoria;
        this.idade = idade < 0? 0:idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade< 0? 0:idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
