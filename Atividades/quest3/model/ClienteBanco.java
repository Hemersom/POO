public class ClienteBanco {
    private String nome;
    private double saldo;
    private String numero;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getNome(){
        return this.nome;
    }
    public String getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public boolean saldoZerado(){
        if (this.saldo<= 0) {
            return true;
        }else{
            return false;
        }
    }
    public void depositar(double valor){
        if(valor <=0){
            System.out.println("Valor de depósito inválido");    
        }else{
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }
    public void sacar(double valor){
        if (saldoZerado()) {
            System.out.println("Saque negado!");
        }else{  
            if (valor <= 0 || valor > this.saldo) {
                System.out.println("Quantia inválida!");
            }else{
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso !");
            }
        }

    }
    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Número da conta: "+this.numero);
        System.out.println("Saldo: R$"+this.saldo);
    }
    public static void main(String[] args) {
        ClienteBanco cliente = new ClienteBanco();
        cliente.setNome("Luis");
        cliente.setNumero("1111 2222 3333 4444");
        cliente.setSaldo(0);
        cliente.sacar(103.50f);
        cliente.depositar(500.75f);
        cliente.sacar(103.50f);
        cliente.info();

    }
}
