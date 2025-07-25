
import java.util.Scanner;

public class Principal {
    public static int verificaIdade(int idade) throws IllegalArgumentException{
        if (idade < 0 || idade > 130) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        return idade;
    }
    public static void main(String[] args) {
        boolean erro = true;
        int idade = 0;
        Scanner input = new Scanner(System.in);
        do { 
            try {
                System.out.println("Digite a idade: ");
                idade = input.nextInt();
                verificaIdade(idade);
                erro = false;
                System.out.println("Idade digitada: "+idade);
                
            } catch (IllegalArgumentException e) {
                System.err.println("Exceção: "+e);
                input.nextLine();
                System.out.println("A idade deve ser maior que 0 e menor que 130. tente novamente");
                erro = true;
            }

            
        } while (erro);
        
    }
}
