class InteiroSet{
    private boolean[] conjunto;
    public InteiroSet(){
        conjunto = new boolean[101];
    }
    public void inserir(int valor){
        if(valor >= 0 && valor <= 100){
            conjunto[valor] = true;
        }
    }
    public void remover(int valor){
        if(valor >= 0 && valor <= 100){
            conjunto[valor] = false;
        }
    }
    public static InteiroSet uniao(InteiroSet a, InteiroSet b){
        InteiroSet resultado = new InteiroSet();
        for(int i = 0; i < 101; i++){
            if(a.conjunto[i] || b.conjunto[i]){
                resultado.inserir(i);
            }
        }
        return resultado;
    }
    public static InteiroSet intersecao(InteiroSet a, InteiroSet b){
        InteiroSet resultado = new InteiroSet();
        for(int i = 0; i < 101; i++){
            if(a.conjunto[i] && b.conjunto[i]){
                resultado.inserir(i);
            }
        }
        return resultado;
    }
    public String toSetString(){
        StringBuilder sb = new StringBuilder("{");
        for(int i = 0; i < 101; i++){
            if(conjunto[i]){
                sb.append(i).append(", ");
            }
        }
        if(sb.length() > 1){
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }
    public boolean ehIgual(InteiroSet outro){
        for(int i = 0; i < 101; i++){
            if(this.conjunto[i] != outro.conjunto[i]){
                return false;
            }
        }
        return true;
    }
}