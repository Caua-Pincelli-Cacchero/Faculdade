import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class PG034A00 extends JFrame implements ActionListener {
    private int[] numeros = new int[25];
    private JTextField txtNumero, txtSoma, txtMedia;
    private JButton btnOk, btnLimpar, btnFim;

    public PG034A00() {
        setTitle("PG034A00");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Labels and Text Fields
        add(new JLabel("Número:"));
        txtNumero = new JTextField(10);
        add(txtNumero);
        
        add(new JLabel("Soma:"));
        txtSoma = new JTextField(10);
        txtSoma.setEditable(false);
        add(txtSoma);

        add(new JLabel("Média:"));
        txtMedia = new JTextField(10);
        txtMedia.setEditable(false);
        add(txtMedia);

        // Buttons
        btnOk = new JButton("Ok");
        btnOk.addActionListener(this);
        add(btnOk);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(this);
        add(btnLimpar);
        
        btnFim = new JButton("Fim");
        btnFim.addActionListener(this);
        add(btnFim);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            generateRandomNumbers();
            int soma = calculateSum();
            double media = calculateAverage(soma);
            txtSoma.setText(String.valueOf(soma));
            txtMedia.setText(String.valueOf(media));
        } else if (e.getSource() == btnLimpar) {
            clearFields();
        } else if (e.getSource() == btnFim) {
            System.exit(0);
        }
    }

    private void generateRandomNumbers() {
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100); // Gera números aleatórios entre 0 e 99
        }
    }

    private int calculateSum() {
        int sum = 0;
        for (int num : numeros) {
            sum += num;
        }
        return sum;
    }

    private double calculateAverage(int sum) {
        return sum / (double) numeros.length;
    }

    private void clearFields() {
        txtNumero.setText("");
        txtSoma.setText("");
        txtMedia.setText("");
    }

    public static void main(String[] args) {
        PG034A00 app = new PG034A00();
        app.setVisible(true);
    }
}
