public class PassagemEstudante extends Passagem {
    
    public PassagemEstudante(){
        super();
    }
    public PassagemEstudante(String nome, double valor){
        super(nome,valor);
    }
    @Override
    public double calcularValor(){
        double vb = this.getValorBase()*0.5;
        vb*=100;
        vb = Math.round(vb);
        vb /= 100;
        return vb;  
    }
}
