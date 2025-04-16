import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class PG008A00 {
    public static void main(String[] args) {
        String num;
        num = showInputDialog(null, "Digite um número e veja seus 3 primeiros múltiplos",
         "Receber Número", 3);
        int x = Integer.parseInt(num);
        
        showMessageDialog(null, 
            "X * 1 = " + (x * 1) + "\n" +
            "X * 2 = " + (x * 2) + "\n" +
            "X * 3 = " + (x * 3));
}
}