package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Fornecedores extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores dialog = new Fornecedores();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Fornecedores() {
		setTitle("Fornecedores");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fornecedores.class.getResource("/img/favicon.png")));
		setModal(true);
		setBounds(100, 100, 760, 462);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fornecedor");
		lblNewLabel.setBounds(55, 38, 66, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 35, 163, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(55, 83, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 80, 131, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CNPJ");
		lblNewLabel_2.setBounds(246, 83, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IE");
		lblNewLabel_3.setBounds(55, 165, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("IM");
		lblNewLabel_4.setBounds(154, 165, 32, 14);
		getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(291, 80, 163, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(78, 162, 66, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(179, 162, 77, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Fornecedores.class.getResource("/img/1490793870-user-interface25_82355 (1).png")));
		lblNewLabel_5.setBounds(303, 35, 32, 29);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CEP");
		lblNewLabel_6.setBounds(274, 165, 32, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cidade");
		lblNewLabel_7.setBounds(55, 245, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Razão Social");
		lblNewLabel_8.setBounds(55, 118, 89, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contato");
		lblNewLabel_9.setBounds(55, 290, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Endereço");
		lblNewLabel_10.setBounds(55, 205, 66, 14);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Bairro");
		lblNewLabel_11.setBounds(329, 245, 46, 14);
		getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Nome Fantasia");
		lblNewLabel_12.setBounds(342, 118, 92, 14);
		getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Telefone");
		lblNewLabel_13.setBounds(235, 290, 59, 14);
		getContentPane().add(lblNewLabel_13);
		
		textField_5 = new JTextField();
		textField_5.setBounds(138, 115, 181, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(438, 115, 171, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(311, 162, 101, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(99, 242, 137, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(114, 202, 361, 20);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(377, 242, 163, 20);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(112, 287, 107, 20);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(291, 287, 121, 20);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Email");
		lblNewLabel_14.setBounds(428, 290, 32, 14);
		getContentPane().add(lblNewLabel_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(470, 287, 204, 20);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Site");
		lblNewLabel_15.setBounds(55, 328, 46, 14);
		getContentPane().add(lblNewLabel_15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(88, 325, 398, 20);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("UF");
		lblNewLabel_16.setBounds(246, 245, 24, 14);
		getContentPane().add(lblNewLabel_16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBox.setBounds(266, 241, 53, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_17 = new JLabel("Número");
		lblNewLabel_17.setBounds(494, 205, 46, 14);
		getContentPane().add(lblNewLabel_17);
		
		textField_15 = new JTextField();
		textField_15.setBounds(540, 202, 86, 20);
		getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar CEP");
		btnNewButton.setBounds(423, 161, 137, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(Fornecedores.class.getResource("/img/add (1).png")));
		btnNewButton_1.setBounds(589, 362, 32, 32);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Fornecedores.class.getResource("/img/load.png")));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(631, 362, 32, 32);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Fornecedores.class.getResource("/img/lixo.png")));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBounds(673, 362, 32, 32);
		getContentPane().add(btnNewButton_3);

	}

}
