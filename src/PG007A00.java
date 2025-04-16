import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class PG007A00 {
    public static void main(String[] args) {
        String num1;
        num1 = showInputDialog(null, "Digite o primeiro número",
        "Receber Números", 3);
        int X = Integer.parseInt(num1);
        String num2;
        num2 = showInputDialog(null, "Digite o segundo número",
        "Receber Números", 3);
        int Y = Integer.parseInt(num2);
        showMessageDialog(null, "Soma: " + (X + Y) + "\n"
        + "Subtração: " + (X - Y) + "\n" + "Multiplicação: " + (X * Y) + "\n" +
        "Divisão: " + (X / Y));
    }
    
}
 