package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				status();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/favicon.png")));
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(29, 29, 37, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(83, 26, 203, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(25, 67, 37, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 64, 203, 20);
		contentPane.add(passwordField);
		
		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/img/dboff.png")));
		lblStatus.setBounds(7, 106, 64, 64);
		contentPane.add(lblStatus);
		
		JButton btnNewButton = new JButton("Acessar");
		btnNewButton.setBounds(197, 117, 89, 23);
		contentPane.add(btnNewButton);
	}// fim do construtor
	
	// Criação de um objeto para acessar a camada model
	DAO dao = new DAO();
	private JLabel lblStatus;
	
	/**
	 * Método usado para verificar o status do servidor
	 */
	private void status() {
		try {
			//abrir a conexão
			Connection con = dao.conectar();
			if (con == null) {
				//escolher a imagem dboff
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/img/dboff.png")));
			} else {
				//escolher a imagem dbon
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/img/dbon.png")));
			}
			// Não esquecer de fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
}// fim do código
