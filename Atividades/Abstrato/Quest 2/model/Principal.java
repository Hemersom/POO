public class Principal {
    public static void main(String[] args) {
        Autenticavel[] users = new Autenticavel[3];
        users[0] = new UsuarioWeb("João", "j@gmail.com");
        users[1] = new UsuarioApp("claudio","claudiane@gmail.com");
        users[2] = new UsuarioAPI("Carlos","cavalos@gmail.com");
        for(Autenticavel u: users){
            u.autenticar();
        }
    }
}
