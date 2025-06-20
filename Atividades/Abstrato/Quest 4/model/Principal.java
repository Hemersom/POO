public class Principal {
    public static void main(String[] args) {
        ED estrutura = new Pilha(10);
        ED estrutura2 = new Fila(10);
        ED estrutura3 = new FilaPrioridade(10);


        System.out.println("+---------- PILHA ----------+\n");
        estrutura.adicionar(10);
        estrutura.adicionar(5);
        estrutura.adicionar(7);
        estrutura.adicionar(2);
        estrutura.adicionar(4);

        System.out.println(estrutura);

        System.out.println("Removido da Pilha: " + estrutura.remover());
        System.out.println("Removido da Pilha: " + estrutura.remover());
        System.out.println("Removido da Pilha: " + estrutura.remover());
        System.out.println("Removido da Pilha: " + estrutura.remover());
        System.out.println("Removido da Pilha: " + estrutura.remover());
        
        System.out.println(estrutura);

        System.out.println("+---------- FILA ----------+\n");
        
        estrutura2.adicionar(10);
        estrutura2.adicionar(5);
        estrutura2.adicionar(7);
        estrutura2.adicionar(2);
        estrutura2.adicionar(4);
        System.out.println(estrutura2);

        System.out.println("Removido da Fila: " + estrutura2.remover());
        System.out.println("Removido da Fila: " + estrutura2.remover());
        System.out.println("Removido da Fila: " + estrutura2.remover());
        System.out.println("Removido da Fila: " + estrutura2.remover());
        System.out.println("Removido da Fila: " + estrutura2.remover());
        
        System.out.println(estrutura2);

        System.out.println("+---------- FILA DE PRIORIDADE ----------+\n");
        estrutura3.adicionar(10);
        estrutura3.adicionar(5);
        estrutura3.adicionar(7);
        estrutura3.adicionar(2);
        estrutura3.adicionar(4);

        System.out.println(estrutura3);

        System.out.println("Removido da Fila de Prioridade: " + estrutura3.remover());
        System.out.println("Removido da Fila de Prioridade: " + estrutura3.remover());
        System.out.println("Removido da Fila de Prioridade: " + estrutura3.remover());
        System.out.println("Removido da Fila de Prioridade: " + estrutura3.remover());
        System.out.println("Removido da Fila de Prioridade: " + estrutura3.remover());

        
        System.out.println(estrutura3);
        
        
    }
}
