public class App {
    public static void main(String[] args) {
        
        Ingresso ingressoNormal = new Ingresso(50.0);
        ingressoNormal.imprimeValor();
        
        Vip ingressoVip = new Vip(100.0, 20.0);
        System.out.println("Ingresso VIP - Valor: R$ " + ingressoVip.getValorVip());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(150.0, 30.0, 50.0);
        System.out.println("Camarote Superior - Valor: R$ " + camaroteSuperior.getValorAdicionalSuperior());
    }
}
