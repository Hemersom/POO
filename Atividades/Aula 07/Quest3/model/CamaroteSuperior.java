public class CamaroteSuperior extends Vip {
    protected double valorAdicionalSuperior;
    public CamaroteSuperior() {
        super();
        this.valorAdicionalSuperior = 0.0;
    }
    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior < 0.0 ? 0.0 : valorAdicionalSuperior;
    }
    public double getValorAdicionalSuperior() {
        return this.getValor()+this.getAdicional() + this.valorAdicionalSuperior;   
    }
}
