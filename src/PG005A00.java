import static javax.swing.JOptionPane.showInputDialog;

public class PG005A00 {
    public static void main(String[] args) {
        String nome;
        nome = showInputDialog(null, "Digite seu nome: ",
         "Receber nome", 3);
        System.out.println(nome);
    }

}
