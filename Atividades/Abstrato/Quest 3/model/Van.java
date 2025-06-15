public class Van extends Veiculo implements Alugavel {
    protected int CapacidadePassageiros;

    public Van(int CapacidadePassageiros, String placa, String marca, String modelo, int ano_fabricacao) {
        super(placa, marca, modelo, ano_fabricacao);
        this.CapacidadePassageiros = CapacidadePassageiros;
    }



    public int getCapacidadePassageiros() {
        return this.CapacidadePassageiros;
    }

    @Override
    public boolean podeAlugar(){
        return true;
    }

    @Override
    public void exibirDados(){
        System.out.println("Carro: ");
        System.out.println("Placa: "+this.getPlaca());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Ano: "+this.getAno_fabricacao());
        System.out.println("Portas: "+this.getCapacidadePassageiros());
        System.out.println("Pode alugar ? "+(this.podeAlugar()? "Sim":"Não"));

        System.out.println();
    }
    @Override
    public double calcularValorAluguel(int nDias){
        double total  = nDias< 0? 0:nDias*180.0f;
        total = total*100;
        total = Math.round(total);
        total /= 100;
        return total;
    }
}
