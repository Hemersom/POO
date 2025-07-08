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

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public int getQuantidadesPaginas() {
        return quantidadesPaginas;
    }



    public void setQuantidadesPaginas(int quantidadesPaginas) {
        this.quantidadesPaginas = quantidadesPaginas;
    }



    public static int getNumeroAtual() {
        return numeroAtual;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Capitulo "+this.getNumero()+" - "+this.getTitulo()+"("+this.getQuantidadesPaginas()+" páginas)";
    }

    

}
