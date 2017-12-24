package dao;

import java.sql.*;

public class Driver {
	
	public static void main(String[] args) {
		
		try {
			
			final String URL = "jdbc:mysql://localhost:3306/java_exemplo?useSSL=false";
			final String USER = "root";
			final String SENHA = "";
			
			Connection con = DriverManager.getConnection(URL, USER, SENHA);
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");
			
			while(rs.next()) {
				System.out.println("********************************************************");
				System.out.println("\nID: " + rs.getInt("id") + "\nNOME: " + rs.getString("nome") + 
						"\nEMAIL: " + rs.getString("email") + "\nSENHA: " + rs.getString("senha") +
						"\nCONECTADO: " + rs.getBoolean("conectado"));
				
			}//fim while
			
			rs.close();
			stmt.close();
			con.close();
						
		}
		catch(SQLException ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
