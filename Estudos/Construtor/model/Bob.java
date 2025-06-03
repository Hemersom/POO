public class Bob {
    String nome;
    int idade;
    public Bob(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        
    }
    public static void main(String[] args) {
        Bob bob = new Bob("Não Bob", -7);
        bob.info();
    }
    
}
