public class Capitulo {
    protected static int numeroAtual = 0;
    protected int numero;
    protected String titulo;
    protected int quantidadesPaginas;

    public Capitulo(String titulo, int qtdPg){
        this.numero = this.numeroAtual;
        this.numeroAtual++;
        this.titulo = titulo;
        
        this.quantidadesPaginas = qtdPg <= 0? 1:qtdPg;
    }

    @Override
    public String toString() {
        return "Capitulo "+this.numero+" - "+this.titulo+"("+this.quantidadesPaginas+" páginas)\n";
    }

    

}
