public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano_fabricacao;

    public Veiculo(String placa, String marca, String modelo, int ano_fabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
    }
    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.ano_fabricacao = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }
    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " (" + this.ano_fabricacao + ")";
    }

    public abstract boolean podeAlugar();
    public abstract void exibirDados();
}