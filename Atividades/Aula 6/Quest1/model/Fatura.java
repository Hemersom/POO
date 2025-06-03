public class Fatura {
    private String numero;
    private String desc;
    private int qtdComprada;
    private double precoItem;
    public Fatura(){
    }
    public Fatura(String num, String desc, int qtdC, double qtdI){
        this.numero = num;
        this.desc = desc;
        this.qtdComprada = qtdC;
        this.precoItem = qtdI;
    }

    public double getFaturaTotal(){
        if(this.precoItem < 0){
            this.precoItem = 0;
        }
        if(this.qtdComprada < 0){
            this.qtdComprada = 0;
        }
        double valorTotal = this.precoItem * this.qtdComprada;
        valorTotal *=100;
        valorTotal = Math.round(valorTotal);
        valorTotal /= 100;
        return valorTotal;
    }

    public void setNumero(String num){
        this.numero=num;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setQtdComprada(int qtdC){
        this.qtdComprada = qtdC;
    }
    public void setPrecoItem(double qtdI){
        this.precoItem = qtdI;
    }

    public String getNumero(){
        return this.numero;
    }
    public String getDesc(){
       return this.desc;
    }
    public int getQtdComprada(){
        return this.qtdComprada;
    }
    public double getQtdItem(){
        return this.precoItem;
    }
}