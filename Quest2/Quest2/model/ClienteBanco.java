public class ClienteBanco {
    String codigo;
    String nome;
    double SaldoAtual;
    public void depositar(double valor){
        if(valor > this.SaldoAtual || valor <=0){
            System.out.println("Operação inválida!");
        }
        else{
            this.SaldoAtual += valor;
        }
    }
    public void sacar(double valor){
        if(valor > this.SaldoAtual || valor <=0){
            System.out.println("Operação inválida!");
        }
        else{
            this.SaldoAtual -= valor;
        }
    }
}
