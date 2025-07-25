public class PessoaEstudante extends Pessoa {
    private static final String CATEGORIA = "Estudante";
    private static final double DESCONTO = 0.5;

    public PessoaEstudante(String nome, int idade, String senha) {
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
