
public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda("João", 5);
        agenda.addPessoa(new Pessoa("Maria", 1));
        agenda.addPessoa(new Pessoa("José", 1));
        agenda.addPessoa(new Pessoa("Ana", 1));

        agenda.addContato("Maria", new Email("maria@gmail.com"));

        agenda.addContato("José", new Telefone("123456789"));

        agenda.addContato("Ana", new Telefone("987654321"));
        System.out.println("Exibindo todas as pessoas:");
        agenda.exibirTodasPessoas();
        System.out.println();
        System.out.println("Buscando Maria:");
        Pessoa p = agenda.buscarPessoa("Maria");
        if (p != null) {
            System.out.println("Pessoa encontrada: " + p.getNome());
            Contato[] contatos = p.getContatos();
            for (Contato c : contatos) {
                if (c != null) {
                    c.exibir();
                }
            }
        } else {
            System.out.println("Pessoa não encontrada.");
        }
        System.out.println();
        agenda.exibirPessoaComEmail();
        agenda.exibirContatoPessoa("Maria");
        System.out.println("Procurando contatos por tipo: ");
        agenda.recuperarPessoaPorEmail("maria@gmail.com");
        agenda.recuperarPessoaPorTelefone("987654321");
    }

}
