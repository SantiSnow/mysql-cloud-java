package src;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CloudHibernate {

	public static void main(String[] args) {
		
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		if(myFactory != null) {
			System.out.println("Conexion exitosa");
		}else {
			System.out.println("Error");
		}
		
		myFactory.close();
	}

}
