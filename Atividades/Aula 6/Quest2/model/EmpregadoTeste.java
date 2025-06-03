public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado();
        Empregado emp2 = new Empregado();
        System.out.println("Antes do aumento:");
        emp1.setNome("Renan");
        emp1.setNome("Silva");
        emp1.setSalarioMensal(1518.50f);
        emp1.info();
        emp2.setNome("João");
        emp2.setSobrenome("Roger");
        emp2.setSalarioMensal(7567.75f);
        emp2.info();
        emp1.aumentoSalario(10);
        emp2.aumentoSalario(10);
        System.out.println("Depois do aumento:");
        emp1.info();
        emp2.info();
    }
}
