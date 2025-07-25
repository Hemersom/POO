
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite o numerador: ");
            int num = input.nextInt();
            input.nextLine();
            System.out.println("Digite o denominador: ");
            int denominador = input.nextInt();
            System.out.println(num+"/"+denominador+" = " +(num/denominador));
        } catch ( InputMismatchException i) {
            System.err.println("Exceção: "+i);
            System.out.println("Apenas numeros inteiros!");
        }
        catch(ArithmeticException a){
            System.err.println("Exceção: "+a);
            System.out.println("O denominador não pode ser 0!");
        }
    }
}
