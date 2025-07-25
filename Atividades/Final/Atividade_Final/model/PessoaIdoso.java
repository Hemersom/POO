public class PessoaIdoso extends Pessoa {
    private static final String CATEGORIA = "Idoso";
    private static final double DESCONTO = 1.0;

    public PessoaIdoso(String nome, int idade, String senha) {
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
