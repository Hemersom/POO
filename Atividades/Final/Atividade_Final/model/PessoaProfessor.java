public class PessoaProfessor extends Pessoa {
    private static final String CATEGORIA = "Professor";
    private static final double DESCONTO = 0.3;

    public PessoaProfessor(String nome, int idade, String senha) {
        super(nome, idade, senha);
    }

    public double getDesconto() {
        return DESCONTO;
    }

    
    public String getCategoria() {
        return CATEGORIA;
    }

    public double precoIngresso(double precoBase) {
        return precoBase * (1 - DESCONTO);
    }
}