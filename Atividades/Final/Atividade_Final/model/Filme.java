public class Filme {
    private String titulo;
    private int duracao;
    private String genero;

    public Filme(String titulo, int duracao, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public static void verFilmes(Filme[] filmes, int totalFilmes) {
        if (totalFilmes == 0) {
            System.out.println("\nNenhum filme em cartaz no momento...\n");
        } else {
            System.out.println("\nFilmes em cartaz:");
            for (int i = 0; i < totalFilmes; i++) {
                System.out.printf("%d. %s (%s, %d min)%n", i + 1, filmes[i].getTitulo(), filmes[i].getGenero(), filmes[i].getDuracao());
            }
        }
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ", " + duracao + " min)";
    }
}