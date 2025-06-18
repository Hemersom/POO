import javax.swing.*;
public class Jframe extends JFrame {

    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog(null,"Digite um numero: ", "0" );
        String sn = JOptionPane.showInputDialog( null,"Digite outro numero: ", "0");

        if (fn == null || sn == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int numero1 = Integer.parseInt(fn)*10;
        
        int numero2 = Integer.parseInt(sn);
        
        int soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null,""+ numero1/10+" + " +numero2+ " = " + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.PLAIN_MESSAGE("Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}