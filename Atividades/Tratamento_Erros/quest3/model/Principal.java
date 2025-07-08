
import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int[] vet = new int[5];
        for (int i =0; i<5; i++) {
            vet[i] = r.nextInt(100);
            System.out.print("|"+vet[i]+"|->");
        }
        System.out.println("FIM.\n");
        boolean erro = true;
        do { 
            try {
                System.out.println("Digite um índice do vetor: ");
                int ind = input.nextInt();
                System.out.println("Valor na posição "+ind+": "+vet[ind]);
                erro = false;
                
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Exceção: "+e);
                input.nextLine();
                System.out.println("Não é possível acesssar índices que não existem. tente novamente\n");
            }
            
        } while (erro);
        
    }
}
