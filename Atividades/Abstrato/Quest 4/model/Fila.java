
public class Fila extends ED {

    protected int[] elementos;
    protected int cont;
    protected int tamanho;
    protected int inicio;
    protected int fim;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
        this.cont = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    public Fila() {
        this(10);
    }

    @Override
    public void adicionar(int num) {
        if (cont == tamanho) {
            System.out.println("Fila cheia");
        } else {
            elementos[fim] = num;
            fim++;
            cont++;
        }
    }

    @Override
    public int remover() {
        if (cont == 0) {
            System.out.println("Fila vazia");
            return -1;
        } else {
            int valorRemovido = elementos[inicio];
            inicio = (inicio + 1) % tamanho;
            cont--;
            return valorRemovido;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fila: ");
        for (int i = 0; i < cont; i++) {
            int index = (inicio + i) % tamanho;
            sb.append("|").append(elementos[index]).append("|");
            if (i < cont - 1) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

}
