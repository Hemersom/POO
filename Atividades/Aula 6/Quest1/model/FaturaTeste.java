public class FaturaTeste {
    public static void main(){
        Fatura fat = new Fatura();
        fat.setDesc("Dividas");
        fat.setNumero("0142");
        fat.setQtdComprada(30);
        fat.setPrecoItem(3.55f);
        System.out.println("Preço da fatura "+fat.getDesc()+": R$"+fat.getFaturaTotal());
        fat.setPrecoItem(-1);
        System.out.println("Preço da fatura "+fat.getDesc()+": R$"+fat.getFaturaTotal());       
    }
}
