public class Principal {
    public static void main(String[] args) {
        Passagem[] passagens = new Passagem[6];
        passagens[0] = new  Passagem("João Ricardo",4.00f);
        passagens[1] = new  PassagemEstudante("Amélia Almeida",4.00f);
        passagens[2] = new  Passagem("Juliana Alves",4.00f);
        passagens[3] = new  PassagemEstudante("Carlos Eduardo",4.00f);
        passagens[4] = new  Passagem("Roger Silva",4.00f);
        passagens[5] = new  PassagemEstudante("Antonio Furtado",4.00f);
        System.out.println("Relatório de passageiros: ");
        for(Passagem v: passagens){
            System.out.println(v);
        }
    }
}
