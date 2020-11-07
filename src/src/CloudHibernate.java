package src;

import model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CloudHibernate {

	public static void main(String[] args) {
		
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Inmueble.class)
				.addAnnotatedClass(Propietario.class)
				.buildSessionFactory();

		Session mySession = myFactory.openSession();
		
		if(myFactory != null) {
			System.out.println("Conexion exitosa");
		}else {
			System.out.println("Error");
		}
		
		myFactory.close();
	}

}
