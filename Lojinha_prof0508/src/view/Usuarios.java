package view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;
import model.DAO;
import javax.swing.JCheckBox;

public class Usuarios extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUsuId;
	private JTextField txtUsuNome;
	private JTextField txtUsuLogin;
	private JPasswordField txtUsuSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios dialog = new Usuarios();
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
	public Usuarios() {
		setModal(true);
		setTitle("Usu\u00E1rios");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Usuarios.class.getResource("/img/favicon.png")));
		setBounds(100, 100, 486, 340);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(39, 138, 34, 14);
		getContentPane().add(lblNewLabel);
		
		txtUsuId = new JTextField();
		txtUsuId.setEditable(false);
		txtUsuId.setBounds(95, 135, 73, 20);
		getContentPane().add(txtUsuId);
		txtUsuId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio");
		lblNewLabel_1.setBounds(39, 91, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtUsuNome = new JTextField();
		txtUsuNome.setEditable(false);
		txtUsuNome.setBounds(95, 88, 290, 20);
		getContentPane().add(txtUsuNome);
		txtUsuNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(39, 43, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtUsuLogin = new JTextField();
		txtUsuLogin.setBounds(95, 40, 118, 20);
		getContentPane().add(txtUsuLogin);
		txtUsuLogin.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(39, 183, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtUsuSenha = new JPasswordField();
		txtUsuSenha.setEditable(false);
		txtUsuSenha.setBounds(95, 180, 202, 20);
		getContentPane().add(txtUsuSenha);
		
		JLabel lblNewLabel_4 = new JLabel("Perfil");
		lblNewLabel_4.setBounds(208, 138, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		cboUsuPerfil = new JComboBox();
		cboUsuPerfil.setEnabled(false);
		cboUsuPerfil.setModel(new DefaultComboBoxModel(new String[] {"", "admin", "user"}));
		cboUsuPerfil.setBounds(246, 134, 103, 22);
		getContentPane().add(cboUsuPerfil);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarUsuario();				
			}
		});
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setIcon(new ImageIcon(Usuarios.class.getResource("/img/pesquisar.png")));
		btnPesquisar.setBounds(225, 29, 32, 32);
		getContentPane().add(btnPesquisar);
		
		btnAdicionar = new JButton("");
		btnAdicionar.setEnabled(false);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarUsuario();
			}
		});
		btnAdicionar.setToolTipText("Adicionar");
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setContentAreaFilled(false);
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setIcon(new ImageIcon(Usuarios.class.getResource("/img/create.png")));
		btnAdicionar.setBounds(257, 226, 64, 64);
		getContentPane().add(btnAdicionar);
		
		btnAlterar = new JButton("");
		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkSenha.isSelected()) {
					alterarUsuarioSenha();
					
				}else {
					alterarUsuario();
				}
			}
		});
		btnAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar.setIcon(new ImageIcon(Usuarios.class.getResource("/img/update.png")));
		btnAlterar.setToolTipText("Alterar");
		btnAlterar.setContentAreaFilled(false);
		btnAlterar.setBorderPainted(false);
		btnAlterar.setBounds(322, 226, 64, 64);
		getContentPane().add(btnAlterar);
		
		btnExcluir = new JButton("");
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirUsuario();
			}
		});
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.setIcon(new ImageIcon(Usuarios.class.getResource("/img/delete.png")));
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.setContentAreaFilled(false);
		btnExcluir.setBorderPainted(false);
		btnExcluir.setBounds(385, 226, 64, 64);
		getContentPane().add(btnExcluir);
		
		// Validação com o uso a biblioteca Atxy2k
		//txtUsuId
		RestrictedTextField validarId = new RestrictedTextField(txtUsuId);
		validarId.setOnlyNums(true);
		validarId.setLimit(255);
		
		//txtUsuNome
		RestrictedTextField validarNome = new RestrictedTextField(txtUsuNome);
		validarId.setLimit(255);
		
		//txtLogin
		RestrictedTextField validarLogin = new RestrictedTextField(txtUsuLogin);
		validarId.setLimit(255);
		
		//txtUsuSenha
		RestrictedTextField validarSenha = new RestrictedTextField(txtUsuSenha);
		
		chkSenha = new JCheckBox("Alterar senha");
		chkSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsuSenha.setText(null);
				txtUsuSenha.requestFocus();
				txtUsuSenha.setEditable(true);
			}
			
		});
		chkSenha.setVisible(false);
		chkSenha.setBounds(322, 179, 127, 23);
		getContentPane().add(chkSenha);
		validarId.setLimit(255);

	}// fim do construtor
	
	DAO dao = new DAO();
	private JComboBox cboUsuPerfil;
	private JButton btnAdicionar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JCheckBox chkSenha;
	
	//validação da senha (captura segura)

	
	/**
	 * M�todo rrespons�vel pela pesquisa de usu�rios pelo login
	 */
	private void pesquisarUsuario() {
		//valida��o
		if (txtUsuLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o Login do usu�rio");
			txtUsuLogin.requestFocus();
		} else {
			//l�gica principal
			//Query (instru��o SQL)
			String read = "select * from usuarios where login = ?";
			//tratar exce��es sempre que lidar com o banco
			try {
				//Estabelecer a conex�o
				Connection con = dao.conectar();
				//Preparar a execu��o da query
				PreparedStatement pst = con.prepareStatement(read);
				//Setar o argumento (id)
				//Substituir o ? pelo conte�do da caixa de texto
				pst.setString(1, txtUsuLogin.getText());
				//Executar a query e exibir o resultado no formulario
				ResultSet rs = pst.executeQuery();
				//Valida��o (exist�ncia de usu�rio)
				//rs.next() -> exist�ncia de usu�rio
				if (rs.next()) {
					//preencher(setar) os campos do formul�rio
					txtUsuId.setText(rs.getString(1));
					txtUsuNome.setText(rs.getString(2));
					txtUsuLogin.setText(rs.getString(3));
					cboUsuPerfil.setSelectedItem(rs.getString(5));
					txtUsuSenha.setText(rs.getString(4));
					txtUsuNome.setEditable(true);
					cboUsuPerfil.setEnabled(true);
					txtUsuSenha.setEditable(true);
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
					chkSenha.setVisible(true);
					txtUsuSenha.setEditable(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usu�rio inexistente");
					txtUsuLogin.setEditable(false);
					txtUsuNome.setEditable(true);
					cboUsuPerfil.setEditable(true);
					txtUsuSenha.setEditable(true);
					txtUsuNome.requestFocus();
					btnAdicionar.setEnabled(true);
				}
				// NUNCA esquecer de encerrar a conex�o
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	/**
	 * 
	 * Método responsável por adicionar um novo usuário no banco
	 * 
	 */
	
	private void adicionarUsuario() {
		 String capturaSenha = new String (txtUsuSenha.getPassword());
		//validação
		if (txtUsuNome.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Preencha o Nome do usuário");
			txtUsuNome.requestFocus();
		}else if (txtUsuLogin.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Preencha o Login do usuário");
			txtUsuLogin.requestFocus();
		}else if(cboUsuPerfil.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Selecione o perfil do usuário");
			cboUsuPerfil.requestFocus();
		}else if (txtUsuSenha.getPassword().length == 0){
			JOptionPane.showMessageDialog(null, "Preencha a senha do usuário");
			txtUsuSenha.requestFocus();
		}else {
			// Lógica principal
			String create = "insert into usuarios (usuario,login,senha,perfil) values (?,?,md5(?),?)";
		try {
			// Estabelecer a conex�o
			Connection con = dao.conectar();
			//Preparar a execu��o da query
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir os ????? pelo conteúdo das caixas de texto
			pst.setString(1, txtUsuNome.getText());
			pst.setString(2, txtUsuLogin.getText());
			pst.setString(3, capturaSenha);
			pst.setString(4, cboUsuPerfil.getSelectedItem().toString());
			//executar a query e inserir o usuário no banco
			pst.executeUpdate();
			// Encerrar a conexão
			JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
			limparCampos();
			con.close();
		}catch(SQLIntegrityConstraintViolationException ex){
			JOptionPane.showMessageDialog(null, "Login existente");
			txtUsuLogin.setText(null);
			txtUsuLogin.requestFocus();
		}catch (Exception e) {
			System.out.println(e);
			}
		
		}
	}
	
	
	/**
	 * 
	 * Método responsável por excluir um usuário no banco
	 * 
	 */
	private void excluirUsuario() {
		//validação (cofrmação de exclusão)
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do usuário?", "Atenção!",JOptionPane.YES_NO_OPTION);
		
		if(confirma == JOptionPane.YES_OPTION) {
			String delete = "delete from usuarios where idusu=?";
			try {
				// Estabelecer a conex�o
				Connection con = dao.conectar();
				//Preparar a execu��o da query
				PreparedStatement pst = con.prepareStatement(delete);
				// Substituir os ????? pelo conteúdo das caixas de texto
				pst.setString(1, txtUsuId.getText());
				//executar a query e inserir o usuário no banco
				pst.executeUpdate();
				
				//confirmação
				limparCampos();
				JOptionPane.showMessageDialog(null, "Usuário excluído");
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
		
		/**
		 * Método responsavel por alterar os dados de um usuário do banco exceto a senha
		 */
		
		private void alterarUsuario() {
			//validação
			if (txtUsuNome.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Coloque as informações do usuário");
				txtUsuNome.requestFocus();
			} else if (txtUsuLogin.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Coloque o login do usuário");
				txtUsuLogin.requestFocus();
			} else if (cboUsuPerfil.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(null, "Coloque o perfil do usuário");
				cboUsuPerfil.requestFocus();
			} else {
				// lógica principal
				String update = "update usuarios set usuario=?, login=?, perfil=? where idusu=?;";
				try {
					// Estabelecer a conexão 
					Connection con = dao.conectar();
					// Preparar a execução da Query
					PreparedStatement pst = con.prepareStatement(update);
					// Substituir o ? pelo conteúdo da caixa de texto 
					pst.setString(1, txtUsuNome.getText());
					pst.setString(2, txtUsuLogin.getText());
					pst.setString(3, cboUsuPerfil.getSelectedItem().toString());
					pst.setString(4, txtUsuId.getText());
					// Executar a query e alterar o usuário no banco
					pst.executeUpdate();
					// confirmação
					limparCampos();
					JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
					// Encerrar a conexão
					con.close();
				} catch (SQLIntegrityConstraintViolationException ex) {
					JOptionPane.showMessageDialog(null, "Login em uso.\nEscolha outro login");
					txtUsuLogin.setText(null);
					txtUsuLogin.requestFocus();
				} catch (Exception e) {
					System.out.println(e);
				}
				}
				
		}
		
		/**
		 * Método responsável por alterar os dados de um usuário e sua respectiva senha no banco de dados
		 */
		
		private void alterarUsuarioSenha() {
			//validação da senha (captura segura)
			String capturaSenha = new String (txtUsuSenha.getPassword());
			//validação
			if (txtUsuNome.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Coloque as informações do usuário");
				txtUsuNome.requestFocus();
			} else if (txtUsuLogin.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Coloque o login do usuário");
				txtUsuLogin.requestFocus();
			} else if (cboUsuPerfil.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(null, "Coloque o perfil do usuário");
				cboUsuPerfil.requestFocus();
			} else if (txtUsuSenha.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha a senha");
				txtUsuSenha.requestFocus();
			} else {
				// lógica principal
				String update2 = "update usuarios set usuario=?, login=?, senha=md5(?), perfil=? where idusu=?";
				try {
					// Estabelecer a conexão 
					Connection con = dao.conectar();
					// Preparar a execução da Query
					PreparedStatement pst = con.prepareStatement(update2);
					// Substituir o ? pelo conteúdo da caixa de texto 
					pst.setString(1, txtUsuNome.getText());
					pst.setString(2, txtUsuLogin.getText());
					pst.setString(3, capturaSenha);
					pst.setString(4, cboUsuPerfil.getSelectedItem().toString());
					pst.setString(5, txtUsuId.getText());
					// Executar a query e alterar o usuário no banco
					pst.executeUpdate();
					// confirmação
					limparCampos();
					JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
					// Encerrar a conexão
					con.close();
				} catch (SQLIntegrityConstraintViolationException ex) {
					JOptionPane.showMessageDialog(null, "Login em uso.\nEscolha outro login");
					txtUsuLogin.setText(null);
					txtUsuLogin.requestFocus();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
				
	}
	
	
	
	private void limparCampos() {
		txtUsuNome.setText(null);
		txtUsuLogin.setText(null);
		txtUsuSenha.setText(null);
		cboUsuPerfil.setSelectedItem("");
		btnAdicionar.setEnabled(false);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(true);
		txtUsuNome.setEditable(true);
		txtUsuLogin.setEditable(true);
		cboUsuPerfil.setEnabled(false);
		txtUsuSenha.setEditable(true);
		txtUsuLogin.requestFocus();
		chkSenha.setVisible(false);
		chkSenha.setSelected(false);
		txtUsuSenha.setEditable(rootPaneCheckingEnabled);
		
	}
}// fim do c�digo






