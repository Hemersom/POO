
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static int dividir(int numerador, int denominador) throws ArithmeticException{
        return numerador/denominador;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean erro = true;
        do { 
            try{
                System.out.println("Digite o numerador: ");
                int num1 = input.nextInt();
                System.out.println("Digite o denominador: ");
                int num2 = input.nextInt();
                int result = dividir(num1,num2);
                System.out.println("Resultado: "+result);
                erro = false;

            }
            catch( InputMismatchException inputMismatchException){
                System.err.println("\nExceção: "+inputMismatchException);
                input.nextLine();
                System.out.println("Você deve utilizar numeros inteiros. tente novamente\n");
            }
            catch(ArithmeticException arithmeticException){
                System.err.println("\nExceção: "+arithmeticException);
                System.out.println("0 não é um denominador válido. tente novamente");
                
            }

        } while (erro);
        input.close();
    }

}
