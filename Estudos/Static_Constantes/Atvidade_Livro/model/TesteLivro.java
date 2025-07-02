
public class TesteLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("978-3-16-148410-0","Tokyo ghoul");
        l1.addCapitulo("Tragédia", 46);
        l1.addCapitulo("Estranheza", 31);
        l1.addCapitulo("A metamorfose",32 );
        l1.exibirRelatorio();

    }
}
