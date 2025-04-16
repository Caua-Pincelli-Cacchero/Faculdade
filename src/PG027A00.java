import static javax.swing.JOptionPane.*;

public class PG027A00 {
    public static void main(String[] args) {
        int [] Valores = new int [5];
        int soma = 0;
        int i;

        for (i = 0; i < Valores.length; i++) {
            int num = Integer.parseInt(showInputDialog(null, 
            "Digite 5 números: "));
            Valores[i] = num;
        }

        for (i = 0; i < 3; i++) {
            soma += Valores[i];
        }

        showMessageDialog(null, "A soma dos três primeiros números é: "
        + soma);

    }
}
