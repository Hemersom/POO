public class UsuarioAPI extends Usuario implements Autenticavel {

    public UsuarioAPI(String nome, String email) {
        super(nome, email);
    }
    @Override
    public boolean autenticar() {
        System.out.println("Autenticando " + getNome() + " por token de API...");
        return true;
    }

}