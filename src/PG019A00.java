import static javax.swing.JOptionPane.*;

public class PG019A00 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                showMessageDialog(null, "Os números pares são: " + i);
            }
        }
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                showMessageDialog(null, "Os números impares são: " + i);
            }
        }
    }
}
