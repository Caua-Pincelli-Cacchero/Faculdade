import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PG030A00 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PG030A00 frame = new PG030A00();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PG030A00() {
		setTitle("PG030A00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1317, 912);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(298, 175, 279, 93);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numS = textField.getText();
				int num = Integer.parseInt(numS);
				num = Math.abs(num);
				
				textField_1.setText(Integer.toString(num));
			}


		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(242, 766, 149, 44);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnLimpar.setBounds(630, 766, 149, 44);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnFechar.setBounds(1021, 766, 149, 44);
		contentPane.add(btnFechar);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		textField.setBounds(478, 195, 596, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAbsoluto = new JLabel("Absoluto: ");
		lblAbsoluto.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAbsoluto.setBounds(298, 407, 279, 93);
		contentPane.add(lblAbsoluto);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(478, 423, 596, 60);
		contentPane.add(textField_1);
	}
}
