import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PG033A00 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PG033A00 frame = new PG033A00();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PG033A00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1319, 913);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setBounds(122, 118, 190, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblElevadoAoCubo = new JLabel("Elevado ao cubo:");
		lblElevadoAoCubo.setFont(new Font("Arial", Font.PLAIN, 22));
		lblElevadoAoCubo.setBounds(122, 309, 190, 49);
		contentPane.add(lblElevadoAoCubo);
		
		JLabel lblRaizQuadrada = new JLabel("Raiz Quadrada:");
		lblRaizQuadrada.setFont(new Font("Arial", Font.PLAIN, 22));
		lblRaizQuadrada.setBounds(122, 482, 190, 49);
		contentPane.add(lblRaizQuadrada);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 22));
		textField.setBounds(446, 121, 648, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(446, 309, 648, 49);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(446, 482, 648, 49);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(textField.getText());
				double cubo = Math.pow(num, 3);
				double raiz = Math.sqrt(num);
				
				textField_1.setText(Double.toString(cubo));
				textField_2.setText(Double.toString(raiz));
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 22));
		btnNewButton.setBounds(122, 756, 138, 59);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				textField.requestFocus();
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 22));
		btnLimpar.setBounds(608, 756, 138, 59);
		contentPane.add(btnLimpar);
		
		JButton btnFim = new JButton("FIM");
		btnFim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFim.setFont(new Font("Arial", Font.PLAIN, 22));
		btnFim.setBounds(1069, 756, 138, 59);
		contentPane.add(btnFim);
	}
}
