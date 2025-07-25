
import java.io.IOException;
import java.util.Scanner;

public class Principal{
    public static String leituraArquivo(String arquivo) throws IOException{
        if(arquivo == null || arquivo.isEmpty()){
            throw new IOException("Arquivo nulo");
        }
        return arquivo;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
            try{    
                System.out.println("Digite o arquivo a acessar: ");
                String arquivo = input.nextLine();
                leituraArquivo(arquivo);
                System.out.println("Arquivo acessado"+leituraArquivo(arquivo));
            }
            catch(IOException e){
                System.err.println("Exceção: "+e);
                System.out.println("O arquivo que deseja acessar está vazio!");

            }
        
    }
}