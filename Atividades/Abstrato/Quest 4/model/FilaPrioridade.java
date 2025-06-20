public class FilaPrioridade extends Fila{
    
    public FilaPrioridade(int tamanho) {
        super(tamanho);
    }

    @Override
    public void adicionar(int num) {
        if (cont == tamanho) {
            System.out.println("Fila cheia");
        } else {
            int i;
            for (i = cont - 1; (i >= 0 && elementos[i] > num); i--) {
                elementos[(i + 1) % tamanho] = elementos[i];
            }
            elementos[(i + 1) % tamanho] = num;
            fim = (fim + 1) % tamanho;
            cont++;
        }

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fila de Prioridade: ");
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