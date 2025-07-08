public class Livro {
    protected String isbn;
    protected String titulo;
    protected int quantidadeCapitulos;
    protected Capitulo[] capitulos;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Livro(String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
        this.capitulos = new  Capitulo[100];
        this.quantidadeCapitulos=0;
    }
    public int quantidadePaginas(){
        int sum = 0;
        for(int i =0; i <this.quantidadeCapitulos; i++){
            sum += capitulos[i].quantidadesPaginas;
        }
        return sum;
    }
    public void addCapitulo(String titulo, int qtdPg){
        if(this.quantidadeCapitulos < 100){
            this.capitulos[this.quantidadeCapitulos] = new Capitulo(titulo, (qtdPg <= 0 ? 1:qtdPg));
            this.quantidadeCapitulos++;
        }
        else{
            System.out.println("Quantidade máxima atingida");
        }
    }
    public void exibirRelatorio(){
        System.out.println("=== RELATÓRIO DO LIVRO ===");
        System.out.println("Editora: "+Constantes.EDITORA);
        System.out.println("ISBN: "+this.getIsbn());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Capítulos: ");
        for(int i =0; i<this.quantidadeCapitulos;i++){
            System.out.println(capitulos[i]);
        }
        System.out.println("Total de Páginas: "+this.quantidadePaginas());

        
    }

}
