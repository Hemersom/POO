public class Lista {
    private int[] valores;
    private int tam;
    private int cap;

    public Lista(int cap){
        this.valores = new int[cap];
        this.cap = cap;
        this.tam = 0;
    }   

    public boolean listaVazia(){
        if(tam == 0) {
            return true;            
        }else{
            return false;
        }
    }

    public boolean listaCheia(){
        if (this.tam == this.cap) {
            return true;            
        }else{
            return false;
        }
    }

    public void add(int elemento){
        if (listaCheia()) {
            System.out.println("Lista está cheia !");
        }else{
            valores[tam] = elemento;
            tam++;
        }
    }
    public int remover(int pos){
        if(pos < 0 || pos >= this.tam){
            System.out.println("Posição inválida !");
        }
        int removido = this.valores[pos];
        for(int i = pos;i < this.tam -1;i++){
            this.valores[i] = this.valores[i+1];
        }
        this.tam--;
        return removido;
    }
    public int imprimirPos(int pos){
        if (pos < 0 || pos >= this.tam) {
            System.out.println("Posição inválida!");
        }
        return this.valores[pos];
        
    }
    public int search(int value){
        if (listaVazia()) {
                return -1;
        }
        else{
            for(int i =0; i< tam; i++)
            {
                if (valores[i] == value) {
                    return i;
                }
                
            }
        }
        return -1;
    }
    public void imprimir(){
        System.out.println("Lista:");
        for(int i = 0; i < this.tam;i++){
            System.out.print("|"+this.valores[i]+"|->");
        }
        System.out.println("FIM");
    }
    
}
