import static javax.swing.JOptionPane.*;

public class PG017A00 {
    public static void main(String[] args) {
        String numS = showInputDialog(null, "Digite um número para ver seus primeiros 5 multiplos: ", 3);
        int num = Integer.parseInt(numS);
        int i = 1;
        while (i <= 5) {
            if (num >= 0){
                int multiplo = num * i;
                showMessageDialog(null, num + " * " + i + " = " + multiplo);
                i++;
            } else {
                showMessageDialog(null, "ERRO! Digite apenas um número inteiro e positivo.");
                break;
            }
        }
            
        }
    }
