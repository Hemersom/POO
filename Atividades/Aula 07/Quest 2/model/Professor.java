class Professor  extends Usuario {
    // Atributos: lista de disciplinas
    protected String[] disciplinas;
    public Professor() {
        super();
        this.disciplinas = new String[0]; // Inicializa com um array vazio
    }
    public Professor(String nome, String email, String[] disciplinas) {
        super(nome, email);
        this.disciplinas = disciplinas != null ? disciplinas : new String[0]; // Evita NullPointerException
    }
    public String[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas != null ? disciplinas : new String[0]; // Evita NullPointerException
    }
    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.print("Disciplinas: ");
        if (disciplinas != null && disciplinas.length > 0) {
            for (String disciplina : disciplinas) {
                System.out.print(disciplina + " ");
            }
        } else {
            System.out.print("Nenhuma disciplina cadastrada.");
        }
        System.out.println();
    }

}
