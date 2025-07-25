public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(150.50f);
        try{
            conta.sacar(160);
        }
        catch(SaldoInsuficienteException s){
            System.err.println("Exceção: "+s);
            System.out.println("O valor de saque é maior que o saldo!");
        }
        System.out.println("Saldo da conta: R$"+conta.getSaldo());
    }    
}
class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
class ContaBancaria{
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor> this.saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }
}
