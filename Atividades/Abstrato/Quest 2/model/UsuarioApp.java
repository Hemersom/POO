public class UsuarioApp extends Usuario implements Autenticavel {
    public UsuarioApp(String nome, String email) {
        super(nome, email);
    }
   @Override
    public boolean autenticar() {
        System.out.println("Autenticando " + getNome() + " por biometria...");
        this.exibeDados();
        return true;
    }
}
