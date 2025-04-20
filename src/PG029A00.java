import javax.swing.JOptionPane;

public class PG029A00 {
    public static void main(String[] args) {
        double[][] notasMes = new double[10][12];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                String input = JOptionPane.showInputDialog("Digite a nota do Aluno " + (i + 1) + " na disciplina " + (j + 1) + ":");
                notasMes[i][j] = Double.parseDouble(input);
            }
        }

        String todasNotas = "Notas Armazenadas:\n";
        for (int i = 0; i < 10; i++) {
            todasNotas += "Aluno " + (i + 1) + ": ";
            for (int j = 0; j < 12; j++) {
                todasNotas += notasMes[i][j] + " ";
            }
            todasNotas += "\n";
        }
        JOptionPane.showMessageDialog(null, todasNotas);
        
        String notasEspecificas = "Notas dos Alunos 2, 7 e 9:\n";
        for (int aluno : new int[]{1, 6, 8}) { // Índices 1, 6 e 8 correspondem aos alunos 2, 7 e 9
            notasEspecificas += "Aluno " + (aluno + 1) + ": ";
            for (int j = 0; j < 12; j++) {
                notasEspecificas += notasMes[aluno][j] + " ";
            }
            notasEspecificas += "\n";
        }
        JOptionPane.showMessageDialog(null, notasEspecificas);
    }
}