public class Instituto {

    private String nome;
    private Departamento departamento;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDepartamento(Departamento dep){
        this.departamento = dep;
    }

    public String getNome(){
        return this.nome;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }
    
}
