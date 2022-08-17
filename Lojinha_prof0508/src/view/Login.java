package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;
import model.DAO;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTelaLogin;
	private JPasswordField txtSenhaLogin;

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

		txtTelaLogin = new JTextField();
		txtTelaLogin.setBounds(83, 26, 203, 20);
		contentPane.add(txtTelaLogin);
		txtTelaLogin.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(25, 67, 37, 14);
		contentPane.add(lblNewLabel_1);

		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(83, 64, 203, 20);
		contentPane.add(txtSenhaLogin);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/img/dboff.png")));
		lblStatus.setBounds(7, 106, 64, 64);
		contentPane.add(lblStatus);

		JButton btnLogar = new JButton("Acessar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logar();
			}
		});
		btnLogar.setBounds(197, 117, 89, 23);
		contentPane.add(btnLogar);

		RestrictedTextField validarId = new RestrictedTextField(txtTelaLogin);
		validarId.setLimit(20);

		RestrictedTextField validarNome = new RestrictedTextField(txtSenhaLogin);
		validarId.setLimit(255);

	}// fim do construtor

	// Cria��o de um objeto para acessar a camada model
	DAO dao = new DAO();
	private JLabel lblStatus;

	/**
	 * M�todo usado para verificar o status do servidor
	 */
	private void status() {
		try {
			// abrir a conex�o
			Connection con = dao.conectar();
			if (con == null) {
				// escolher a imagem dboff
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/img/dboff.png")));
			} else {
				// escolher a imagem dbon
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/img/dbon.png")));
			}
			// N�o esquecer de fechar a conex�o
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Método usado para autenticar um usuário
	 * 
	 */

	private void logar() {
		String capturarSenha = new String(txtSenhaLogin.getPassword());

		if (txtTelaLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha Login");
			txtTelaLogin.requestFocus();
		} else if (txtSenhaLogin.getPassword().length == 0) {
			JOptionPane.showMessageDialog(null, "Coloque a senha");
			txtSenhaLogin.requestFocus();
		} else {
			String read = "select*from usuarios where login=? and senha=md5(?)";

			try {
				// Estabelecer a conex�o
				Connection con = dao.conectar();
				// Preparar a execu��o da query
				PreparedStatement pst = con.prepareStatement(read);
				// Setar o argumento (id)
				// Substituir o ? pelo conte�do da caixa de texto
				pst.setString(1, txtTelaLogin.getText());
				pst.setString(2, capturarSenha);
				// Executar a query e liberar os recursos da tela principal
				ResultSet rs = pst.executeQuery();
				// Valida��o (exist�ncia de usu�rio)
				// rs.next() -> exist�ncia de usu�rio
				Principal principal = new Principal();
				
				if (rs.next()) {
					String perfil = rs.getString(5);
					//System.out.println(perfil);
					if (perfil.equals("admin")) {
						
						principal.setVisible(true);
						principal.btnRelatorios.setEnabled(true);
						principal.btnUsuarios.setEnabled(true);
						principal.panelUsu.setBackground(Color.ORANGE);
						//setar o nome do usuário na tela principal
						principal.lblUsu.setText(rs.getString(2));
						principal.lblUsu.setText("Usuário: " + rs.getString(2) + "/ Login: " + rs.getString(3));
					} else {
						// System.out.println(perfil);
						principal.setVisible(true);
						principal.lblUsu.setText("Usuário: " + rs.getString(2) + "/ Login: " + rs.getString(3));

					}	
					// ecerrar a conexão
						con.close();
						// fechar a tela de login
						this.dispose();
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}// fim do c�digo
