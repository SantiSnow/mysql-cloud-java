package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cloud {

	public static void main(String[] args) {
		
		Connection miConexion;
		try {
			miConexion = DriverManager.getConnection("uri", "usr", "pass");
			Statement miStatement = miConexion.createStatement();
			
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
