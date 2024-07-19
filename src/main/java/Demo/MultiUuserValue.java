package Demo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MultiUuserValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select u from Uuser u where u.name=?1");
		
		Scanner s=new Scanner(System.in);
		String name="Ramya";
		
		query.setParameter(1, name);
		
		List<Uuser>list=query.getResultList();
		
		System.out.println(list);
	}

}
