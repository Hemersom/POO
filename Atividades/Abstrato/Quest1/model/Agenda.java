public class Agenda {
    protected String proprietario;
    protected Pessoa[] pessoas;
    protected int max;
    protected int cont;

    public Agenda(String proprietario, int max) {
        this.proprietario = proprietario;
        this.max = max < 0 ? 1 : max;
        this.cont = 0;
        this.pessoas = new Pessoa[max];
    }

    public Agenda() {
        this.proprietario = "";
        this.max = 10; 
        this.cont = 0;
        this.pessoas = new Pessoa[max];
    }

    public void addPessoa(Pessoa p) {
        if (cont < max) {
            pessoas[cont] = p;
            cont++;
        } else {
            System.out.println("Limite de pessoas atingido.");
        }
    }

    public Pessoa buscarPessoa(String nome) {
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                return pessoas[i];
            }
        }
        return null; 
    }

    public void addContato(String nome, Contato contato) {
        Pessoa p = buscarPessoa(nome);
        if (p != null) {
            p.adicionarContato(contato);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void exibirTodasPessoas() {
        for (int i = 0; i < cont; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            Contato[] contatos = pessoas[i].getContatos();
            for (Contato c : contatos) {
                if (c != null) {
                    System.out.println("Contato: " + c.getTipo() + " - " + 
                                       (c instanceof Email ? ((Email)c).getEmail() : ((Telefone)c).getTelefone()));
                }
            }
        }
    }

    public void exibirContatoPessoa(String nome){
        Pessoa p = buscarPessoa(nome);
        if (p != null) {
            System.out.println("Contatos de " + p.getNome() + ":");
            Contato[] contatos = p.getContatos();
            for (Contato c : contatos) {
                if (c != null) {
                    System.out.println("Contato: " + c.getTipo() + " - " + 
                                       (c instanceof Email ? ((Email)c).getEmail() : ((Telefone)c).getTelefone()));
                }
            }
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void exibirPessoaComEmail() {
        System.out.println("Pessoas com email:");
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].possuiEmail()) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }


    public void recuperarPessoaPorEmail(String email){
        for(int i = 0; i < cont; i++){
            for(Contato c : pessoas[i].getContatos()){
                if(c instanceof Email && ((Email)c).getEmail().equalsIgnoreCase(email)){
                    System.out.println("Pessoa encontrada: " + pessoas[i].getNome());
                    return;
                }
            }
        }
    }

    public void recuperarPessoaPorTelefone(String telefone){
        for(int i = 0; i < cont; i++){
            for(Contato c : pessoas[i].getContatos()){
                if(c instanceof Telefone && ((Telefone)c).getTelefone().equalsIgnoreCase(telefone)){
                    System.out.println("Pessoa encontrada: " + pessoas[i].getNome());
                    return;
                }
            }
        }
    }

    
    

}
