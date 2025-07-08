public class Passagem {
    protected String nomePassageiro;
    protected double valorBase;

    public Passagem(){
        this.nomePassageiro = "";
        this.valorBase = 0;
    }
    public Passagem(String nome, double valor){
        this.nomePassageiro = nome;
        this.valorBase = valor < 0 ? 0:valor;
    }       

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double calcularValor(){
        return this.valorBase;
    }

    @Override
    public String toString(){
        return "Passageiro: "+this.getNomePassageiro()+" | Valor: R$"+this.calcularValor();
    }
    
}
