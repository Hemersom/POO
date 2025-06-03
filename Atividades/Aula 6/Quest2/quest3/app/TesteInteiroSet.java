public class TesteInteiroSet {
    
    public static void main(String[] args) {
        
        InteiroSet conjuntoA = new InteiroSet();
        InteiroSet conjuntoB = new InteiroSet();

        conjuntoA.inserir(1);
        conjuntoA.inserir(2);
        conjuntoA.inserir(3);

        conjuntoB.inserir(3);
        conjuntoB.inserir(4);
        conjuntoB.inserir(5);

        InteiroSet uniao = InteiroSet.uniao(conjuntoA, conjuntoB);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet intersecao = InteiroSet.intersecao(conjuntoA, conjuntoB);
        System.out.println("Interseção: " + intersecao.toSetString());

        
        System.out.println("Conjunto A é igual ao Conjunto B? " + (conjuntoA.ehIgual(conjuntoB) ? "Sim" : "Não"));

    }
}
