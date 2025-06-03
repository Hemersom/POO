
import model.Cliente;
import java.util.Scanner;
import view.EntradaDados;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Criando o primeiro cliente");
        Cliente cliente1 = EntradaDados.criarCliente(input);
        
        System.out.println("Criando o segundo cliente");
        Cliente cliente2 = EntradaDados.criarCliente(input);

        System.out.println("Criando o terceiro cliente");
        Cliente cliente3 = EntradaDados.criarCliente(input);

        int opc;

        do { 
            System.out.println("\n+=================Menu=================+");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.println("Escolha >>");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Depositar para o cliente 1, 2 ou 3 ?");
                    int clienteDeposito = input.nextInt();
                    System.out.println("Valor a depositar: ");
                    double valorDep = input.nextDouble();
                    if(valorDep <= 0){
                        System.out.println("Valor inválido!");
                    }
                    else{
                        if(clienteDeposito == 1){
                            cliente1.depositar(valorDep);
                        }
                        else{
                            if(clienteDeposito == 2){
                                cliente2.depositar(valorDep);
                            }
                            else{
                                if(clienteDeposito == 3){
                                    cliente2.depositar(valorDep);
                                }
                                System.out.println("Pessoa não existente!");
                            }
                        }
                    }

                    break;
                case 2:
                System.out.println("Sacar para o cliente 1, 2 ou 3 ?");
                    int clienteDep = input.nextInt();
                    System.out.println("Valor a sacar: ");
                    double valorSaque = input.nextDouble();
                    if(clienteDep == 1){
                        cliente1.sacar(valorSaque);
                    }
                    else{
                        if(clienteDep == 2){
                            cliente2.sacar(valorSaque);
                        }
                        else{
                            System.out.println("Erro!");
                        }
                    }
                break;
                case 3:
                System.out.println("Transferir de quem?");
                int de = input.nextInt();
                System.out.println("Para quem?");
                int para = input.nextInt();
                System.out.println("Valor a transferir: ");
                double valorTransf = input.nextDouble();
                if(de == 1 && para ==2){
                    cliente1.transferir(cliente2, valorTransf);
                }else{
                    if (de == 2 && para ==1) {
                        cliente2.transferir(cliente1, valorTransf);
                    }else{
                        System.out.println("Erro !");
                    }
                }
                break;
                case 4:
                System.out.println("Ver saldo do cliente 1 ou cliente 2? ");
                int clienteVer = input.nextInt();
                if(clienteVer == 1){
                    cliente1.mostrarSaldo();
                }
                else{
                    if(clienteVer == 2){
                        cliente2.mostrarSaldo();
                    }
                    else{
                        System.out.println("Cliente não existente!\n");
                    }
                }
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        } while (opc != 0);
    }
}