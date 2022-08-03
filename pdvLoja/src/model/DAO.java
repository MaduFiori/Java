package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
	 * Classe modelo - Conexão com o banco de dados
	 * 
	 * @author maria.efiori
	 * 
	 */
public class DAO {
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.132:3306/MariaTintas";
	private String user = "root";
	private String password = "123@senac";
	
	/**
	 * Método responsável pela conexão
	 * @return con/ null
	 */
	
	public Connection conectar() {
		// objeto usado para conexão
		Connection con = null;
		
		//tratamento de excessões
		try {
			Class.forName(driver);
			//estabelecer a conexão
			con = DriverManager.getConnection(url, user, password);
			return con;
	} catch (Exception e) {
		System.out.println(e);
		return null;
		}
	}
}
