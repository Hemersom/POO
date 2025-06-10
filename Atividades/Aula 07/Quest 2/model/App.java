public class App {
    
    public static void main(String[] args) {
        
        Administrador admin = new Administrador("Alice", "Alice@gmail.com", new String[]{"Gerenciar Usuários", "Gerenciar Disciplinas"});
        admin.exibirPerfil();
        System.out.println();
        Aluno aluno = new Aluno("Roger", "Roger.aluno@acad.inst.com", "20241BCC.CAX0000", "Ciência da Computação");
        aluno.exibirPerfil();
        System.out.println();
        Professor professor = new Professor("DR. João","joao.prof@acad.inst.com", null);
        professor.setDisciplinas(new String[]{"Programação", "Banco de Dados"});
        professor.exibirPerfil();
        System.out.println();
    }
}
