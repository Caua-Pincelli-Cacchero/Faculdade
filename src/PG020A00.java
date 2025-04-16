import static javax.swing.JOptionPane.*;

public class PG020A00 {
    public static void main(String[] args) {
        int num = Integer.parseInt(showInputDialog(null,"Digite um número inteiro e positivo: "));
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                showMessageDialog(null, "Os números impares menores que" + num + " em ordem crescente são: " + i);
            }
        }
        for (int i = num; i <= num; i--) {
            if (i % 2 == 0) {
                showMessageDialog(null, "Os números pares menores que " + num + " em oredem decrescente são: " + i);
                if (i == 0) {
                    break;
                }
            }
        }
    }
}
