
public class Pessoa {

    protected Contato contatos[];
    protected String nome;
    protected int max;
    protected int cont;

    public Pessoa(String nome, int max) {
        this.nome = nome;
        this.max = max < 0 ? 1 : max;
        this.cont = 0;
        this.contatos = new Contato[max];
    }

    public Pessoa() {
        this.nome = "";
        this.max = 10;
        this.cont = 0;
        this.contatos = new Contato[max];
    }

    public void adicionarContato(Contato contato) {
        if (cont < max) {
            contatos[cont] = contato;
            cont++;
        } else {
            System.out.println("Limite de contatos atingido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public Contato[] getContato(String tipo) {
        Contato[] resultado = new Contato[cont];
        int index = 0;
        for (int i = 0; i < cont; i++) {
            if (contatos[i].getTipo().equalsIgnoreCase(tipo)) {
                resultado[index] = contatos[i];
                index++;
            }
        }

        Contato[] contatosFiltrados = new Contato[index];
        System.arraycopy(resultado, 0, contatosFiltrados, 0, index);
        return contatosFiltrados;
    }

  
    public boolean possuiContato() {
        return cont > 0;
    }

    public boolean possuiContato(String tipo) {
        for (int i = 0; i < cont; i++) {
            if (contatos[i].getTipo().equalsIgnoreCase(tipo)) {
                return true;
            }
        }
        return false;
    }

    public boolean possuiEmail() {
        return possuiContato("email");
    }

    public boolean possuiTelefone() {
        return possuiContato("telefone");
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public int getMax() {
        return max;
    }

    public int getCont() {
        return cont;
    }

    public void exibirContatos() {
        for (int i = 0; i < cont; i++) {
            System.out.println("Contato " + (i + 1) + ": " + contatos[i].getTipo());
        }
    }

}
