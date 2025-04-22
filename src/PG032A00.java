import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PG032A00 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PG032A00 frame = new PG032A00();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PG032A00() {
		setTitle("PG32A00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1312, 910);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(184, 135, 292, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("Número 2");
		lblNmero.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNmero.setBounds(184, 271, 292, 59);
		contentPane.add(lblNmero);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		textField.setBounds(390, 135, 621, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(390, 287, 621, 43);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 24));
		textArea.setBounds(164, 423, 919, 168);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
				
				if (num1 > num2) {
					textArea.setText("O maior número é " + num1);
				}
				else if (num1 == num2) {
					textArea.setText("Os dois números são iguais");
				}
				else {
					textArea.setText("O maior número é " + num2);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(184, 745, 120, 43);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textField.setText("");
				textField_1.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnLimpar.setBounds(530, 745, 120, 43);
		contentPane.add(btnLimpar);
		
		JButton btnFim = new JButton("FIM");
		btnFim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();			
			}
		});
		btnFim.setFont(new Font("Arial", Font.PLAIN, 24));
		btnFim.setBounds(891, 745, 120, 43);
		contentPane.add(btnFim);
	}
}
