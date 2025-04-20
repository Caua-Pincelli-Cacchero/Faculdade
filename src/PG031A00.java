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

public class PG031A00 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PG031A00 frame = new PG031A00();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PG031A00() {
		setTitle("PG031A00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1313, 913);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(169, 104, 315, 66);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		textField.setBounds(396, 114, 557, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 24));
		textArea.setBounds(34, 217, 1120, 376);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numS = textField.getText();
				int num = Integer.parseInt(numS);
				int ale = 0;
				
				if ((num > 0) && (num<=100)) {
					for(int i = 1; i <= 10; i++) {
						ale = (int) Math.random();
					}
				}
				
				textArea.setText("Primeiro número: " + Integer.toString(ale) + "\n" + "Segundo número: " + Integer.toString(ale) + "\n" + "Terceiro número: " + Integer.toString(ale) + "\n"
				+ "Quarto número: " + Integer.toString(ale) + "\n" + "Quinto número: " + Integer.toString(ale) + "\n" + "Sexto número: " + Integer.toString(ale) + "\n" + "Sétimo número: " +
				Integer.toString(ale) + "\n" + "Oitavo número: " + Integer.toString(ale) + "\n" + "Nono número: " + Integer.toString(ale) + "\n" + "Décimo número: " + Integer.toString(ale));
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(169, 639, 147, 66);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textArea.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnLimpar.setBounds(494, 639, 147, 66);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnFechar.setBounds(845, 639, 147, 66);
		contentPane.add(btnFechar);
	}
}