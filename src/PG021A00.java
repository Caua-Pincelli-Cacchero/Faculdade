import static javax.swing.JOptionPane.*;

public class PG021A00 {
    public static void main(String[] args) {
        int num = Integer.parseInt(showInputDialog(null, "Digite um número inteiro e positivo: "));
        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
            showMessageDialog(null, "O calculo do fatorial de " + num + " é igual a " + num + " * " + i + " = " + num);
            if (i == 0) {
                break;
            }
        }
        showMessageDialog(null, "O resultado do fatorial é igual a: " + fatorial);
    }
}