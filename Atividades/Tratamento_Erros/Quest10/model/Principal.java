
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Digite um valor: ");
            int num = input.nextInt();
            System.out.println("Valor digitado: "+num);
        }catch(InputMismatchException i){
            System.err.println("Exceção: "+i);
            System.out.println("Valor inválido!");
            System.out.println("StackTree: ");
            i.printStackTrace();
            
        }
    }
}
