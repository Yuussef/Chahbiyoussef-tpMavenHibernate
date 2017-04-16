package demohibernatee;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Crée une unique instance de la SessionFactory à partir de hibernate.cfg.xml
			Configuration configuration = new Configuration()
					.configure("hibernate.cfg.xml");
			return configuration.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Problème de configuration : " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	// Renvoie une session Hibernate
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}