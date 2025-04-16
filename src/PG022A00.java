import static javax.swing.JOptionPane.*;

public class PG022A00 {
    public static void main(String[] args) {
        String matricula = showInputDialog(null, "Digite a matricula do aluno: ");
        String nome = showInputDialog(null, "Digite o nome do aluno: ");
        String bimestre = showInputDialog(null, "Digite o bimestre do aluno: " + nome + "");
        String disciplina = showInputDialog(null, "Digite a disciplina do aluno: " + nome + "");
        String prova = showInputDialog(null, "Digite a nota da prova do aluno da disciplina " + disciplina + "");
        String atividade = showInputDialog(null, "Digite a nota da atividade do aluno: " + nome + "");

        if (matricula.equals("0") || matricula.equals("") || 
            nome.equals("") || 
            bimestre.equals("0") || bimestre.equals("") || 
            disciplina.equals("0") || disciplina.equals("") || 
            prova.equals("") || 
            atividade.equals("")) {
            showMessageDialog(null, "Algum dos campos foi preenchido incorretamente!"); 
        }

        float matriculaF = Float.parseFloat(matricula);
        int bimestreI = Integer.parseInt(bimestre);
        float provaF = Float.parseFloat(prova);
        float atividadeF = Float.parseFloat(atividade);
        float media = 0; 

        switch (disciplina) {
            case "Matemática":
                media = (provaF * 0.7f) + (atividadeF * 0.3f);
                break;
            case "Português":
                media = (provaF * 0.6f) + (atividadeF * 0.4f);
                break;
            default:
                media = (provaF * 0.5f) + (atividadeF * 0.5f);
                break;
        }

        String situacao;
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 3) {
            situacao = "Exame Final";
        } else {
            situacao = "Reprovado";
        }

        showMessageDialog(null, "Aluno número: " + matriculaF + " Nome do aluno: " + nome +
                " no Bimestre: " + bimestre + " Nota da prova: " + provaF + " Nota da atividade: " + atividadeF + 
                " Média do aluno: " + media + " Situação do aluno: " + situacao);
    }
}