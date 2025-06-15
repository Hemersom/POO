public class Caminhao extends Veiculo {
    protected double capacidade;
    protected int nEixos;

    public Caminhao() {
        super();
        this.capacidade = 0.0f;
        this.nEixos = 0;
    }

    public Caminhao(double capacidade, int nEixos, String placa, String marca, String modelo, int ano_fabricacao) {
        super(placa, marca, modelo, ano_fabricacao);
        this.capacidade = capacidade < 0.0 ? 0.0:capacidade;
        this.nEixos = nEixos < 0? 0:nEixos;
    }

    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade < 0 ? 0:capacidade;
    }
    public int getnEixos() {
        return nEixos;
    }
    public void setnEixos(int nEixos) {
        this.nEixos = nEixos < 0? 0:nEixos;
    }

    @Override
    public boolean podeAlugar(){
        return false;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Caminhão ");
        System.out.println("Placa: "+this.getPlaca());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano: "+this.getAno_fabricacao());
        System.out.println("Capacidade: "+this.getCapacidade()+ "Kg");
        System.out.println("Eixos: "+this.getnEixos());
        System.out.println("Pode alugar ? "+(this.podeAlugar()? "Sim":"Não"));
        System.out.println();
    }
    
    
    
}
