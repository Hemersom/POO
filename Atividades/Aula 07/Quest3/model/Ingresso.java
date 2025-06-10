class Ingresso {
    protected double valor;

    public Ingresso() {
        this.valor = 0.0;
    }
    public Ingresso(double valor) {
        this.valor = valor < 0.0 ? 0.0 : valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor < 0.0 ? 0.0: valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + this.valor);
    }    
}
