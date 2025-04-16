import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class PG011A00 {
    public static void main(String[] args) {
        String nome = showInputDialog(null, "Digite o nome do funcionário: ",
        "Receber nome do funcionáio", 3);
        String SalarioBruto = showInputDialog(null, "Digite o salário bruto: ",
        "Receber salário bruto", 3);
        float X = Float.parseFloat(SalarioBruto);
        String INSS = showInputDialog(null, "Digite o INSS",
        "Receber INSS", 3);
        float Y = Float.parseFloat(INSS);
        String imposto = showInputDialog(null, "Digite o imposto de renda: ",
        "Receber imposto de renda", 3);
        float Z = Float.parseFloat(imposto);
        float SalarioLiquido = X - (Y + Z);
        showMessageDialog(null, "O salario liquído de: " + nome + SalarioLiquido,
         "Salário líquido do funcionário", 1);
    }
    
}
