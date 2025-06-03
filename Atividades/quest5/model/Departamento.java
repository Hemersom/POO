public class Departamento {
    private String codigo;
    private String nome;
    private String telefone;
    private Docente docentes;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setDocentes(Docente docentes){
        this.docentes = docentes;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public Docente getDocentes(){
        return this.docentes;
    }
}
