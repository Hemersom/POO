public class App {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.setNome("Joao");
        docente.setCodigo("012A");
        docente.setFuncao("Professor");
        docente.setSalario(5500.75f);
        Departamento dep = new Departamento();
        dep.setCodigo("55BC");
        dep.setDocentes(docente);
        dep.setNome("Ensino");
        dep.setTelefone("99 91234-5678");
        Instituto inst = new Instituto();
        inst.setDepartamento(dep);
        inst.setNome("IFMA - Campus Caxias");

        System.out.println("Nome: "+docente.getNome());
        System.out.println("Função: "+docente.getFuncao());
        System.out.println("Departamento: "+dep.getNome());
        System.out.println("Instituto: "+inst.getNome());
    }
}
