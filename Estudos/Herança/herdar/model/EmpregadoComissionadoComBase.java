public class EmpregadoComissionadoComBase extends EmpregadoComissionado {
    protected double salarioBase;
    public EmpregadoComissionadoComBase(){
        this.salarioBase = 0.0;
    }
    public EmpregadoComissionadoComBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public void setSalarioBase(double sb){
        this.salarioBase = (sb < 0.0)? 0.0:sb;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }

    @Override
    public double calcularSalario(){
        return this.salarioBase + this.valorTotalVendas;
    }
    @Override
    public String toString(){
            return String.format("Nome: "+this.nome+" \nCpf: "+this.cpf+" \nValor Total de vendas: "+this.valorTotalVendas+" \nSalario Base: R$"+this.salarioBase+ "Salario com comissão: "+this.calcularSalario());
    }

}
