public class PessoaNormal extends Pessoa {
    private static final String CATEGORIA = "Normal";
    private static final double DESCONTO = 0.0;

    public PessoaNormal(String nome, int idade, String senha) {
        super(nome, idade, senha);
    }

    
    public double getDesconto() {
        return DESCONTO;
    }


    public String getCategoria() {
        return CATEGORIA;
    }

    public double precoIngresso(double precoBase) {
        return precoBase;
    }
}
