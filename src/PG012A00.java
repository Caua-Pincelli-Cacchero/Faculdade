import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class PG012A00 {
    public static void main(String[] args) {
        String celcius = showInputDialog(null, "Digite a temperatura em Cº ",
        "Receber graus em Cº", 3);
        float X = Float.parseFloat(celcius);
        float fahrenheit = ((9 * X) + 160) / 5;
        showMessageDialog(null, "A temperatura convertida é " + fahrenheit,
        "Temperatura em Fahrenheit", 1);
    }
}
