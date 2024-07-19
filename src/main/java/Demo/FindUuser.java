package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindUuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		Uuser dbUuser=em.find(Uuser.class,2);
//	
//		System.out.println(dbUuser);
//				
	
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Uuser dbUuser=em.find(Uuser.class,1);
		
		if(dbUuser!=null)
		{
			System.out.println(dbUuser);
		}
		else 
		{
			System.out.println("sorry id is not present");
		}
		
	
 
	
	}

}
