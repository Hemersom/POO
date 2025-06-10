public class EmpregadoComissionado extends Empregado {
    protected double valorTotalVendas;
    protected double percentComissao;

    public EmpregadoComissionado(){
        this.valorTotalVendas = 0;
        this.percentComissao = 0.0;
    }
    public double getValorTotalVendas(){
        return this.valorTotalVendas;
    }
    public double getPercentComissao(){
        return this.percentComissao;
    }
    public void setValorTotalVendas(double vtv){
        this.valorTotalVendas = (vtv < 0)? 0.0:vtv;
    }
    public void setPercentComissao(double pc){
        this.percentComissao = (pc> 0.0 && pc < 1.0)? pc:0.0;
    }

    public double calcularSalario(){
        return (this.valorTotalVendas *this.percentComissao);
    }
    @Override
    public String toString(){
        return String.format("Nome: "+this.nome+"\n Cpf: "+this.cpf+"\n Valor total vendas: "+this.valorTotalVendas+"\n Porcentagem comissão: "+this.percentComissao*100+"% \nSalário: R$"+this.calcularSalario());
    }

}
