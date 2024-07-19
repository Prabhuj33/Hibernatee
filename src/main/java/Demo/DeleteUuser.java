package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
//		EntityManager em=emf.createEntityManager();
//		
//		Uuser dbUuser=em.find(Uuser.class,5);
//		if(dbUuser!=null)
//		{
//			EntityTransaction et=em.getTransaction();
//			et.begin();
//			em.merge(dbUuser);
//			et.commit();
//		}
//    
//		else {
//			System.out.println("sorry id is not presend in the data base");
//		}
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		
		
		EntityTransaction et=em.getTransaction();
		
		Uuser dbUuser=em.find(Uuser.class,4);
		
		et.begin();
		em.remove(dbUuser);

		et.commit();
	
	}
	

}
