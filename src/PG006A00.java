import static javax.swing.JOptionPane.showInputDialog;

public class PG006A00 {
    public static void main(String[] args) {
        String nome;
        nome = showInputDialog(null, "Qual é o seu nome?",
        "Receber nome", 3);
        String curso;
        curso = showInputDialog(null, "Qual é o seu curso?",
        "Receber curso", 3);
        System.out.println(nome + curso);
        
    }
    
}
