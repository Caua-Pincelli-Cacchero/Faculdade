import static javax.swing.JOptionPane. *;

public class PG016A00 {
    public static void main(String[] args) {
        String mesS = showInputDialog(null, "Digite o número do mês: ", "Número do mês",3);
        int mes = Integer.parseInt(mesS);
        switch (mes) {
            case 1:
                showMessageDialog(null, "O mês 1 é JANEIRO!");
                break;
            case 2:
                showMessageDialog(null, "O mês 2 é FEVEREIRO!");
                break;
            case 3:
                showMessageDialog(null, "O mês 3 é MARÇO!");
                break;
            case 4:
                showMessageDialog(null, "O mês 4 é ABRIL!");
                break;
            case 5:
                showMessageDialog(null, "O mês 5 é MAIO!");
                break;
            case 6:
                showMessageDialog(null, "O mês 6 é JUNHO!");
                break;
            case 7:
                showMessageDialog(null, "O mês 7 é JULHO!");
                break;
            case 8:
                showMessageDialog(null, "O mês 8 é AGOSTO!");
                break;
            case 9:
                showMessageDialog(null, "O mês 9 é SETEMBRO!");
                break;
            case 10:
                showMessageDialog(null, "O mês 10 é OUTUBRO!");
                break;
            case 11:
                showMessageDialog(null, "O mês 11 é NOVEMBRO!");
                break;
            case 12:
                showMessageDialog(null, "O mês 12 é DEZEMBRO!");
                break;
            default:
                showMessageDialog(null, "O número selecionado não corresponde a nenhum mês do ano!");
        }
    }
}
