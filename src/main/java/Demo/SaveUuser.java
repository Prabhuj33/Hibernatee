package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uuser u=new Uuser();
		u.setId(5);
		u.setName("Ramya");
		u.setAddress("Thiruvarur");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(u);
		et.commit();
	
	
	
	}

}
