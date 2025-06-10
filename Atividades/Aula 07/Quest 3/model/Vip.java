public class Vip extends Ingresso {
    protected double Adicional;
    public Vip() {
        super();
        this.Adicional = 0.0;
    }
    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.Adicional = valorAdicional < 0.0 ? 0.0 : valorAdicional;
    }
    public double getAdicional() {
        return this.Adicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.Adicional = valorAdicional < 0.0 ? 0.0 : valorAdicional;
    }
    public double getValorVip() {
        return this.getValor() + this.Adicional;
    }
}
