class Administrador extends Usuario {
    protected String[] permissoes;

    public Administrador() {
        super();
        this.permissoes = new String[0]; // Inicializa com um array vazio
    }
    
    public Administrador(String nome, String email, String[] permissoes) {
        super(nome, email);
        this.permissoes = permissoes != null ? permissoes : new String[0]; // Evita NullPointerException
    }

    public String[] getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String[] permissoes) {
        this.permissoes = permissoes != null ? permissoes : new String[0]; // Evita NullPointerException
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.print("Permissões: ");
        if (permissoes != null && permissoes.length > 0) {
            for (String permissao : permissoes) {
                System.out.print(permissao + " ");
            }
        } else {
            System.out.print("Nenhuma permissão cadastrada.");
        }
        System.out.println();
    }    
}
