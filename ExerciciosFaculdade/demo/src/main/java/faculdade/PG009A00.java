package faculdade;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class PG009A00 {
    public static void main(String[] args) {
        String num1;
        num1 = showInputDialog(null, "Digite o primeiro número: ",
        "Receber 3 números", 3);
        int X = Integer.parseInt(num1);

        String num2;
        num2 = showInputDialog(null, "Digite o segundo número: ",
        "Receber 3 números", 3);
        int Y = Integer.parseInt(num2);
        
        String num3;
        num3 = showInputDialog(null, "Digite o terceiro número: ",
        "Receber 3 números", 3);
        int Z = Integer.parseInt(num3);
        showMessageDialog(null, "A média dos 3 números são: " + (X + Y + Z / 3),    
        "Média", 1);
    }    
}
