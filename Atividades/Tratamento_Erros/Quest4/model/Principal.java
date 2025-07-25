
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static String leituraArquivo(String arquivo) throws IOException {
        if (arquivo.equalsIgnoreCase("null")) {
            throw new IOException("Arquivo nulo");
        }
        return arquivo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do arquivo");
            String arquivo = input.nextLine();
            leituraArquivo(arquivo);
            System.out.println("Arquivo acessado com sucesso!");

        } catch (IOException e) {
            System.err.println("Exceção: " + e);
            System.out.println("Arquivo não existente");

        }
        finally{
            System.out.println("Recursos encerrados!");
        }

    }
}
