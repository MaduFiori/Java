package view;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		addWindowListener(new WindowAdapter() {
			//evento ativar janela
			@Override
			public void windowActivated(WindowEvent e) {
				Date data = new Date();
		        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		        lblData.setText(formatador.format(data));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/balde-de-tinta (1).png")));
		setTitle("Tintas Maria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			//evento clicar no bot�o
			public void actionPerformed(ActionEvent e) {
				// Link para o jDialog
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("Usu\u00E1rios");
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/img/useruser.png")));
		btnNewButton.setBounds(20, 23, 128, 128);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedores fornecedores = new Fornecedores();
				fornecedores.setVisible(true);
			}
		});
		btnNewButton_1.setToolTipText("Fornecedores");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/img/forne.png")));
		btnNewButton_1.setBounds(172, 23, 128, 128);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes clientes = new Clientes();
				clientes.setVisible(true);
			}
		});
		btnNewButton_1_1.setToolTipText("Clientes");
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setIcon(new ImageIcon(Principal.class.getResource("/img/clientenovo.png")));
		btnNewButton_1_1.setBounds(461, 23, 128, 128);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setDefaultCapable(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos();
				produtos.setVisible(true);
			}
		});
		btnNewButton_2.setToolTipText("Produtos");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/img/produtosicon.png")));
		btnNewButton_2.setBounds(323, 23, 128, 128);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendas vendas = new Vendas();
				vendas.setVisible(true);
			}
		});
		btnNewButton_3.setToolTipText("PDV");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/img/caixapdv.png")));
		btnNewButton_3.setBounds(20, 177, 128, 128);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setToolTipText("Relat\u00F3rios");
		btnNewButton_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.setIcon(new ImageIcon(Principal.class.getResource("/img/relatorio.png")));
		btnNewButton_1_2.setBounds(172, 177, 128, 128);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.setToolTipText("Ferramentas");
		btnNewButton_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1.setIcon(new ImageIcon(Principal.class.getResource("/img/conf.png")));
		btnNewButton_2_1.setBounds(323, 177, 128, 128);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setToolTipText("Sobre");
		btnNewButton_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1.setIcon(new ImageIcon(Principal.class.getResource("/img/chat.png")));
		btnNewButton_1_1_1.setBounds(472, 177, 128, 128);
		contentPane.add(btnNewButton_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 388, 624, 53);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("");
		lblData.setForeground(SystemColor.window);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(325, 11, 289, 31);
		panel.add(lblData);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(550, 351, 64, 64);
		contentPane.add(lblNewLabel);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/img/pincel.png")));
	}
}
