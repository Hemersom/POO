public class Aluno {
    private String nome;
    private String matricula;
    private double p1;
    private double p2;
    private double t1;
    private double t2;

    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.p1 = 0;
        this.p2 = 0;
        this.t1 = 0;
        this.t2 = 0;
    }
    public Aluno(String nome, String mat, double p1, double p2, double t1, double t2){
        this.nome = nome;
        this.matricula = mat;
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;
    }
    public double  calcularMedia(){
        double media = (p1+p2+t1+t2)/4;
        return media;
    }
    public void setP1(double p1){
        this.p1 = p1;
    }
    public void setP2(double p2){
        this.p2 = p2;
    }
    public void setT1(double t1){
        this.t1 = t1;
    }
    public void setT2(double t2){
        this.t2 = t2;
    }

    public double getP1(){
        return this.p1;
    }
    public double getP2(){
        return this.p2;
    }
    public double getT1(){
        return this.t1;
    }
    public double getT2(){
        return this.t2;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public boolean aprovado(){
        if(calcularMedia()>=5) {
            return true;
        }
        return false;
        
    }
    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Média: "+calcularMedia());
        System.out.println((this.aprovado() ? "Aprovado":"Reprovado"));
    }
}