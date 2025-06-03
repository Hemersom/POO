public class Empregado{
    private String nome;
    private String sobrenome;
    private double SalarioMensal;

    public Empregado(){
        this.nome = " ";
        this.sobrenome = " ";
        this.SalarioMensal = 0.0;
    }

    public Empregado(String nome, String sobrenome, double SalarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.SalarioMensal = SalarioMensal;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal(double SalarioMensal){
        this.SalarioMensal = SalarioMensal;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public double getSalarioMensal(){
        return this.SalarioMensal;
    }

        public double calcularSalarioAnual() {
            double salarioMensalArredondado = Math.round(this.SalarioMensal * 100.0) / 100.0;
            double salarioAnual = salarioMensalArredondado * 12;
            salarioAnual = Math.round(salarioAnual * 100.0) / 100.0;
            return salarioAnual;
        }
        
    public void aumentoSalario(double percentualAumento){
        this.SalarioMensal += this.SalarioMensal * percentualAumento / 100;
        this.SalarioMensal *= 100.0;
        this.SalarioMensal = Math.round(this.SalarioMensal);
        this.SalarioMensal /= 100.0;
    }
    public void info(){
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome()+":"+
        "\n Salario Mensal: " + this.getSalarioMensal() +
        "\n Salario Anual: " + this.calcularSalarioAnual());
    }
}