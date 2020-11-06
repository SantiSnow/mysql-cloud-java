package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cloud {

	public static void main(String[] args) {
		
		Connection miConexion;
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://umhwqqc5npdwycb3:W7X8MafxOtJg0qEZh06k@bmtqayoefjwgd9v0kf8y-mysql.services.clever-cloud.com:3306/bmtqayoefjwgd9v0kf8y", "umhwqqc5npdwycb3", "W7X8MafxOtJg0qEZh06k");
			Statement miStatement = miConexion.createStatement();
			
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
