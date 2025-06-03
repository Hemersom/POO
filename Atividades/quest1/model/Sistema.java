
import java.util.Scanner;

public class Sistema {
    private final int max =100;
    private Aluno a[];
    private int cont = 0;
    public static void main(String[] args){
           Sistema sistema = new Sistema();
           sistema.exe();
    }
    public void exe(){
        Scanner input = new Scanner(System.in);
        a = new Aluno[max];
        int esc;
        do { 
            esc = menu(input);
            input.nextLine();
            switch (esc) {
                case 1:
                    if(cont < max){
                        a[cont] = cadastrarAluno(input);
                        cont++;
                    }else{
                        System.out.println("Limite atingido!");
                    }
                    break;
                case 2:
                    listar(a,cont);
                    break;
                case 3:
                System.out.println("Digite o nome do aluno: ");
                String nome = input.nextLine();
                int busca = Buscar(nome, a, cont);
                if(busca ==-1){
                    System.out.println("Aluno não encontrado");
                }
                else{
                    a[busca].info();
                }
                break;
                default:
                    throw new AssertionError();
            }
        } while (esc != 0);
    }
    public static int menu(Scanner input){
        System.out.println("+----------MENU----------+");
        System.out.println("1 - cadastrar;");
        System.out.println("2 - Listar;");
        System.out.println("3 - Buscar;");
        System.out.println("0 - Sair;");
        System.out.println("Escolha >>>");
        int esc = input.nextInt();
        return esc;
    }
    public Aluno cadastrarAluno(Scanner input){
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a matricula: ");
        String mat = input.nextLine();
        Double notas[] = new Double[4];
        for (int j = 0; j <4; j++) {
            System.out.println("Digite a "+(j+1)+"º nota: ");
            notas[j] = input.nextDouble();
            if(notas[j] <0 ||notas[j] > 10){
                System.out.println("ERRO");
                return null;
            }
        }
        Aluno a = new Aluno(nome,mat,notas[0],notas[1],notas[2],notas[3]);
        return a;
    }
    public static void listar(Aluno a[], int cont){
        for (int i = 0; i < cont; i++) {
            a[i].info();
        }
    }
    public int Buscar(String nome, Aluno a[], int cont){
        for(int i = 0; i < cont; i++){
            if(nome.equals(a[i].getNome())){
                return i;
            }
        }
        return -1;
    }

}
