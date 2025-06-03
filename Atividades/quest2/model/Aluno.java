import java.math.*;
public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }

    public boolean maioridade(){
        if(idade< 18){
            return true;
        }
        return false;
    }
    public double calcularIMC(){
        
        double imc = peso/(altura*altura);
        imc *= 100;
        imc = Math.round(imc);
        imc = imc/100;
        return imc;
    }
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Roger");
        aluno1.setAltura(1.85f);
        aluno1.setPeso(93);
        System.out.println("Nome: "+aluno1.getNome());
        if (aluno1.maioridade()) {
            System.out.println("Tem desconto");
        }
        else{
            System.out.println("Não tem desconto");
        }
        System.out.println(aluno1.getNome()+" tem imc de: "+aluno1.calcularIMC());
    }

}
