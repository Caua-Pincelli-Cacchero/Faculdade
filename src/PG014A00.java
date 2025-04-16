import static javax.swing.JOptionPane. *;

public class PG014A00 {
    public static void main(String[] args) {
        String numS1 = showInputDialog(null, "Digite o primeiro número: ", 3);
        int num1 = Integer.parseInt(numS1);
        String numS2 = showInputDialog(null, "Digite o segundo número: ", 3);
        int num2 = Integer.parseInt(numS2);
        String numS3 = showInputDialog(null,"Digite o terceiro número: ", 3);
        int num3 = Integer.parseInt(numS3);
        if ((num1 > num2) && (num1 > num3)){
            showMessageDialog(null, "O número 1 é o maior!");
        } else if ((num2 > num1) && (num2 > num3)) {
            showMessageDialog(null, "O número 2 é o maior!");
        } else {
            showMessageDialog(null, "O número 3 é o maior!");
        }       
    }
}
