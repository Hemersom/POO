public class CamaroteInferior extends Vip {
    protected String localizacao;
    public CamaroteInferior() {
        super();
        this.localizacao = "Desconhecida";
    }
    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao != null ? localizacao : "Desconhecida";
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao != null ? localizacao : "Desconhecida";
    }
    public void imprimeLocalizacao() {
        System.out.println("Localização do Camarote Inferior: " + this.localizacao);
    }

}