abstract class Animal{
    public abstract void som();
}
class gato extends Animal{
    public void som(){
        System.out.println("miau");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Animal gato = new gato();
        gato.som();
    }
}
