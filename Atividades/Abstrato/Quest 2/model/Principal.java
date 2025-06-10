public class Principal {
    public static void main(String[] args) {
        Autenticavel[] users = new Autenticavel[3];
        users[0] = new UsuarioWeb("João", "joao@gmail.com");
        users[1] = new UsuarioApp("jose","jose@gmail.com");
        users[2] = new UsuarioAPI("Carlos","carlos@gmail.com");
        for(Autenticavel u: users){
            u.autenticar();
        }
    }
}
