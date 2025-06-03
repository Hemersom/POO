public class App {
    public static void main(String[] args) {
        EmpregadoComissionadoComBase ep = new EmpregadoComissionadoComBase();
        ep.setNome("nome");
        ep.setCpf("123.456.789-10");
        ep.setPercentComissao(0.15f);
        ep.setValorTotalVendas(1369.50f);
        ep.setSalarioBase(1369.50f);

        System.out.println(ep);

    }
}
