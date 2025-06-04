public class UsuarioWeb extends Usuario implements Autenticavel {

    public UsuarioWeb(String nome, String email) {
        super(nome, email);
    }
    @Override
    public boolean autenticar() {
        System.out.println("Autenticando " + getNome() + " por login e senha...");
        return true;
    }

}

