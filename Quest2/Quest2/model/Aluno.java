public class Aluno {
    String nome;
    int idade;
    double peso;
    double altura;
    boolean eMenor;
    public Aluno(String nome, int idade, double peso, double altura, boolean eMenor){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.eMenor = eMenor;
    }
    public double imc(){
        return peso/(altura*altura);
    }
}
