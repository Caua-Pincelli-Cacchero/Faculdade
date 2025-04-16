import static javax.swing.JOptionPane. *;

public class PG015A00 {
    public static void main(String[] args) {
        String num1 = showInputDialog(null, "Digite o primeiro número: ", 3);
        int X = Integer.parseInt(num1);
        String ope = showInputDialog(null, "Digite um operador aritimético: (+, -, *, /) ");
        char oper = ope.charAt(0);
        String num2 = showInputDialog(null, "Digite o segundo número: ");
        int Y = Integer.parseInt(num2);
        
        if (oper == '+') {
            showMessageDialog(null, "A soma dos números é igual a " + (X + Y), "Soma dos números", 1);
        }
        else if (oper == '-') {
            showMessageDialog(null, "A subtração dos números é igual a " + (X - Y), "Subtração dos números", 1);
        }
        else if (oper == '*') {
            showMessageDialog(null, "A multiplicação dos números é igual a " + (X * Y), "Multiplicação dos números", 1);
        }
        else if (oper == '/') {
        showMessageDialog(null, "A divisão dos números é igual a " + (X / Y), "Divisão dos números", 1);
        }
        else {
            showMessageDialog(null, "ERRO! Tipo de operação incorreta", "ERRO", 1);
        }
    }
}
