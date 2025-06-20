public class Pilha extends ED {

    protected int[] elementos;
    protected int cont;
    protected int tamanho;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
        this.cont = 0;
    }

    @Override
    public void adicionar(int num) {
        if (cont == tamanho) {
            System.out.println("Pilha cheia");
        } else {
            elementos[cont] = num;
            cont++;
        }
    }

    @Override
    public int remover() {
        if (cont == 0) {
            System.out.println("Pilha vazia");
            return -1; 
        } else {
            cont--;
            return elementos[cont];
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pilha: ");
        for (int i = cont - 1; i >= 0; i--) {
            sb.append("|").append(elementos[i]).append("| -> ");
        }
        if (cont > 0) {
            sb.setLength(sb.length() - 4); 
        }
        return sb.toString();
    }
    
}
