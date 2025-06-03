package model;

public class Cliente {
    private String nome;
    private double saldo;
    public Cliente(String nome, double saldoInicial){
        this.nome = nome;
        this.saldo = saldoInicial;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$"+valor+" feito com sucesso !");
        }else{
            System.out.println("Pode não man");
        }

    }
    public void sacar(double valor){
        if(valor > 0 && saldo >=valor){
            saldo -= valor;
            System.out.println("R$"+valor+" foram jogados fora");
        }else{
            System.out.println("pode não man");
        }
    }
    public void transferir(Cliente destino, double valor){
        if (saldo > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("R$"+valor+" foram depositdos com sucesso para"+destino.getNome());
        }
        else{
            System.out.println("pode não man");
        }
    }
    public void mostrarSaldo(){
        System.out.println(this.nome+" - Saldo atual -> R$"+this.getSaldo());
    }
}
