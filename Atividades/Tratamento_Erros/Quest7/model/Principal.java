public class Principal {
    public static void processar(){
        try{
            int res = 10/0;
        }
        catch(ArithmeticException a){
            System.out.println("Exceção capturada");
            throw a;
        }
    }
    public static void main(String[] args) {
        try{
            processar();
        }catch(ArithmeticException a){
            System.err.println("Exceção: "+a);
            System.out.println("Não é possivel dividir por 0");

        }
    }
}
