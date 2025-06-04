public class Principal {
    public static void main(String[] args) {
        Autenticavel[] users = new Autenticavel[3];
        users[0] = new UsuarioWeb("João", "j@gmail.com");
        users[1] = new UsuarioApp("claudio","claudiane@gmail.com");
        users[2] = new UsuarioAPI("Carlos","cavalos@gmail.com");
        for (int i = 0; i < 3; i++){
            if (users[i].autenticar()) {
                System.out.println("Usuário autenticado com sucesso!");
                users[i].exibeDados();
            } else {
                System.out.println("Falha na autenticação do usuário.");
            }
        }
    }
}
