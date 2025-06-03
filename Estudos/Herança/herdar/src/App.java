class Empregado {
    protected String nome;
    protected String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class EmpregadoComissionado extends Empregado {
    protected double valorTotalVendas;
    protected double percentComissao;

    public void setValorTotalVendas(double vtv) {
        this.valorTotalVendas = vtv;
    }

    public void setPercentComissao(double pc) {
        this.percentComissao = pc;
    }

    public double calcularSalario() {
        return valorTotalVendas * percentComissao;
    }
}

class EmpregadoComissionadoComBase extends EmpregadoComissionado {
    protected double salarioBase;

    public void setSalarioBase(double sb) {
        this.salarioBase = sb;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + super.calcularSalario();
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s\nCpf: %s\nValor Total de Vendas: R$%.2f\nSalário Base: R$%.2f\nSalário com Comissão: R$%.2f",
            this.nome, this.cpf, this.valorTotalVendas, this.salarioBase, this.calcularSalario()
        );
    }
}

public class App {
    public static void main(String[] args) {
        EmpregadoComissionadoComBase ep = new EmpregadoComissionadoComBase();
        ep.setNome("nome");
        ep.setCpf("123.456.789-10");
        ep.setPercentComissao(0.15f);
        ep.setValorTotalVendas(1369.50f);
        ep.setSalarioBase(1369.50f);

        System.out.println(ep);  // <- imprime corretamente o toString
    }
}
