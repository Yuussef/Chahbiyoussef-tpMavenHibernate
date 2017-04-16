package demohibernatee;
import org.hibernate.Session;


public class DemoHibernate {
	public static void main(String[] args){
		//ouverture
		System.out.println("Maven hibernate  mysql");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Employee employee= new Employee();
		employee.setId(110);
		employee.setFirstName("paral");
		employee.setLastName("okk");
		session.save(employee);
		session.getTransaction().commit();
		
		
	}

}
