public class Docente {

    private String codigo;
    private String nome;
    private String funcao;
    private Double salario;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getFuncao(){
        return this.funcao;
    }

    public double  getSalario(){
        return this.salario;
    }
    
}