public class Carro extends Veiculo implements Alugavel{
    protected int nPortas;

    public Carro(int nPortas, String placa, String marca, String modelo, int ano_fabricacao) {
        super(placa, marca, modelo, ano_fabricacao);
        this.nPortas = nPortas < 0? 0:nPortas;
    }

    public Carro(){
        super();
        this.nPortas = 0;
    }

    public int getnPortas() {
        return nPortas;
    }
    
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    @Override
    public boolean podeAlugar(){
        return true;
    }
    @Override
    public double calcularValorAluguel(int nDias){
        double total  = nDias< 0? 0:nDias*120.0f;
        total = total*100;
        total = Math.round(total);
        total /= 100;
        return total;
    }

    @Override
    public void exibirDados(){
        System.out.println("Carro ");
        System.out.println("Placa: "+this.getPlaca());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano: "+this.getAno_fabricacao());
        System.out.println("Portas: "+this.getnPortas());
        System.out.println("Pode alugar ? "+(this.podeAlugar()? "Sim":"Não"));
        System.out.println();
    }

}