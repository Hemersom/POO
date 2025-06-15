
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de veículos: ");
        Scanner input = new Scanner(System.in);
        int qtd = input.nextInt();
        input.nextLine();
        if (qtd <= 0) {
            System.out.println("Quantidade inválida, outro valor será usado."); 
            
        }
        Frota carros = new Frota(qtd);
            while(exe(carros, input)){
        }
        
    }
    public static boolean exe(Frota carros,Scanner input){
        System.out.println("+---------- MENU ----------+");
        System.out.println("1 - Adicionar carro;");
        System.out.println("2 - Adicionar caminhão;");
        System.out.println("3 - Adicionar van;");
        System.out.println("4 - Buscar por placa;");
        System.out.println("5 - Listar carros;");
        System.out.println("6 - Listar caminhões;");
        System.out.println("7 - Listar vans;");
        System.out.println("8 - Listar todos;");
        System.out.println("9 - Listar alugaveis;");
        System.out.println("0 - Sair;");
        
        int opc = input.nextInt();
        input.nextLine();
        switch (opc) {
            case 1 -> carros.addVeiculo(input, "Carro");
            case 2 -> carros.addVeiculo(input, "Caminhao");
            case 3 -> carros.addVeiculo(input, "Van");
            case 4 -> {
                System.out.println("Digite a placa: ");
                carros.buscarPlaca(input.next());
            }
            case 5 -> carros.listarVeiculosPorTipo("Carro");
            case 6 -> carros.listarVeiculosPorTipo("Caminhao");
            case 7 -> carros.listarVeiculosPorTipo("Van");
            case 8 -> carros.listarTudo();
            case 9 -> {
                System.out.println("Digite a quantidade de dias: ");
                int nDias = input.nextInt();
                input.nextLine();
                carros.exibirAlugaveis(nDias);
            }
            case 0 ->{ 
                System.out.println("Saindo..."); 
                return false;}
            default -> System.out.println("ERRO");
        }

        return true;
    }
    

    
}
