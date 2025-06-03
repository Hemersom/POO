public class testeData {
    public static void main(String[] args) {
        Data data = new Data(5, 5, 2025);
        System.out.println("Dia: " + data.getDia());
        System.out.println("Mes: " + data.getMes());
        System.out.println("Ano: " + data.getAno());

        data.setDia(6);
        data.setMes(7);
        data.setAno(2026);

        System.out.println("Data atualizada:");
        data.displayData();
    }
}
