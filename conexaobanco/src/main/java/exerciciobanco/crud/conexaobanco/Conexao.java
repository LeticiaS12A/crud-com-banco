package exerciciobanco.crud.conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jbc.driver");
		
			Connection Conexao = DriverManager.getConnection("jdbc:mysql://localhost/testebanco", "root", "");		
		
			ResultSet log = Conexao.createStatement().executeQuery("SELECT * FROM log");
			while (log.next()) {
				System.out.println("Nome: " + log.getString("nome"));
			}
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco não encontrado.");
		}
		catch (SQLException ex) {
			System.out.println("Erro ao acessar o banco: "+ ex.getMessage());
		} 
		
	}

}
