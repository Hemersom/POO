
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int esc;
        do{
            menu();
            esc= input.nextInt();
            Lista l = null;
            boolean criada= false;
            switch (esc) {
                case 1:
                    int tam = input.nextInt();
                    if (tam<=0) {
                        System.out.println("tamanho inválido!");
                    }
                    else{
                        l = new Lista(tam);
                        criada = true;
                        System.out.println("Lista criada com sucesso!");
                    }
                    break;
                case 2:
                if (!criada) {
                    System.out.println("A lista não foi criada ainda!");
                }
                else{
                    System.out.println("Digite o elemento: ");
                    l.add(input.nextInt());
                }
                break;
                case 3:
                if (!criada) {
                    System.out.println("A lista não foi criada ainda!");
                }
                else{
                    System.out.println("Digite o Valor: ");
                    int pos = l.search(input.nextInt());
                    if (pos == -1) {
                        System.out.println("inválido!");
                    }else{
                        l.imprimirPos(pos);
                    }
                }
                break;
                case 4:
                if (!criada) {
                    System.out.println("A lista não foi criada ainda!");
                }
                else{
                    System.out.println("Digite o Valor: ");
                    int pos = l.search(input.nextInt());
                    if (pos == -1) {
                        System.out.println("inválido!");
                    }else{
                        l.remover(pos);
                    }
                }
                break;
                case 5:
                if (!criada) {
                    System.out.println("A lista não foi criada ainda!");
                }
                else{
                    System.out.println("Lista vazia?"+l.listaVazia());
                    System.out.println("Lista cheia?"+l.listaCheia());
                }
                break;
                case 0:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Erro");
                break;
            }

        }while (esc !=0); 
        

    }
    public static void menu(){
        System.out.println("+---------MENU--------+");
        System.out.println("1 - Criar Lista;");
        System.out.println("2 - Adcionar elemento;");
        System.out.println("3 - Buscar elemento;");
        System.out.println("4 - Remover elemento;");
        System.out.println("5 - Verificar lista;");
        System.out.println("0 - Sair;");
        System.out.print("Escolha>>>");
    }
}
