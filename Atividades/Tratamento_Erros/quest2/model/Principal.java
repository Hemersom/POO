
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean erro = true;
        Scanner input = new Scanner(System.in);
        do{
            try{
                System.out.println("\nDigite um valor: ");
                int num = input.nextInt();
                System.out.println("Numero digitado: "+num);
                erro = false;
            }catch(InputMismatchException inputMismatchException){
                System.out.println("\nExceção: "+inputMismatchException);
                input.nextLine();
                System.out.println("Digite um número inteiro válido. tente novamente");
            }
        }while(erro);
        input.close();
    }
}
