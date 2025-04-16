import static javax.swing.JOptionPane.*;

public class PG013A00 {
    public static void main(String[] args) {
    String numS1 = showInputDialog(null, "Digite o primeiro número: ", 3);
    int num1 = Integer.parseInt(numS1);
    String numS2 = showInputDialog(null, "Digite o segundo valor: ", 3);
    int num2 = Integer.parseInt(numS2);
    if (num1 == num2) {
        showMessageDialog(null, "Os números são iguais!");
    } else {
        showMessageDialog(null, "Os números são diferentes!");
    }
    }
}
