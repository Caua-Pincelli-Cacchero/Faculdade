import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class PG010A00 {
    public static void main(String[] args) {
        String nome;
        nome = showInputDialog(null, "Digite seu nome: ",
        "Receber nome", 3);
        String prova;
        prova = showInputDialog(null, "Digite a nota da prova: ",
        "Receber nota da prova", 3);
        float X = Float.parseFloat(prova);
        String atividade;
        atividade = showInputDialog(null, "Digite a nota da atividade: ",
        "Receber nota da atividade", 3);
        float Y = Float.parseFloat(atividade);
        float media = (X + Y) / 2;
        showMessageDialog(null, "A média do aluno " + nome + media, "Média do aluno", 3);
    }
    
}
