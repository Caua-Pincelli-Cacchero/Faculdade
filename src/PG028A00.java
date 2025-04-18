import static javax.swing.JOptionPane.*;

public class PG028A00 {
    public static void main(String[] args) {
        String[] UF = new String[27];
        int i = 0;

        while (i < 27) { 
            UF[i] = showInputDialog(null, "Digite a unidade federativa do Brasil " + (i + 1) + ": ");
            i++;
        }

        String input = showInputDialog(null, "Digite um número de 1 a 27 para ver a ordem da UF.");
        int index = Integer.parseInt(input) - 1; 

        if (index >= 0 && index < 27) {
            showMessageDialog(null, "A UF na posição " + (index + 1) + " é: " + UF[index]);
        } 
        else {
            showMessageDialog(null, "Número inválido! Por favor, digite um número entre 1 e 27.");
        }

        showMessageDialog(null, "A UF na posição 3 é: "
        + UF[2] + "\n" + "A UF na posição 9 é: " + UF[8] + "\n" + "A UF na posição 21 é: " + UF[20]);
    }
}