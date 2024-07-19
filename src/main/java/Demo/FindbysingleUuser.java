package Demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindbysingleUuser {

	public static void main(String[] args) {

		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select u from Uuser u where u.name=?1");
		
		Scanner s=new Scanner(System.in);
		
		String name="priya";
		
		query.setParameter(1, name);
		
		Uuser u=(Uuser)query.getSingleResult();
		
		System.out.println(u);
		
	}

}
